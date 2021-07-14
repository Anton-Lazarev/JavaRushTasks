package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;
import javafx.geometry.Side;

import java.util.ArrayList;

public class MinesweeperGame extends Game {
    private boolean isGameStopped;
    private static final int SIDE = 9;
    private static final String MINE = "\\uD83D\\uDCA3";
    private static final String FLAG = "\\uD83D\\uDEA9";
    private int countMinesOnField;
    private int countFlags;
    private int countClosedTiles = SIDE * SIDE;
    private int score = 0;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    private void createGame() {
        int countOfMine = 0;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                int mine = getRandomNumber(10);
                if (j == mine) {
                    gameField[i][j] = new GameObject(j, i, true);
                    countOfMine++;
                } else gameField[i][j] = new GameObject(j, i, false);
                setCellColor(j, i, Color.ORANGE);
                setCellValue(j, i, "");
            }
        }
        countMinesOnField = countOfMine;
        countFlags = countMinesOnField;
        countMineNeighbors();
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "Вы програли!", Color.YELLOW, 40);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.CORAL, "Поздравляем! Вы отличный минёр!", Color.WHITE, 40);
    }

    private void restart() {
        isGameStopped = false;
        countMinesOnField = 0;
        countFlags = 0;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        setScore(score);
        createGame();
    }

    private ArrayList<GameObject> getNeighbors(GameObject cell) {
        ArrayList<GameObject> neighbors = new ArrayList<>();
        if (cell.x == 0 && cell.y == 0) {
            neighbors.add(gameField[cell.x + 1][cell.y + 1]);
            neighbors.add(gameField[cell.x][cell.y + 1]);
            neighbors.add(gameField[cell.x + 1][cell.y]);
        } else if ((cell.x > 0 && cell.x < SIDE - 1) && cell.y == 0) {
            neighbors.add(gameField[cell.x + 1][cell.y + 1]);
            neighbors.add(gameField[cell.x + 1][cell.y]);
            neighbors.add(gameField[cell.x][cell.y + 1]);
            neighbors.add(gameField[cell.x - 1][cell.y + 1]);
            neighbors.add(gameField[cell.x - 1][cell.y]);
        } else if (cell.x == SIDE - 1 && cell.y == 0) {
            neighbors.add(gameField[cell.x][cell.y + 1]);
            neighbors.add(gameField[cell.x - 1][cell.y + 1]);
            neighbors.add(gameField[cell.x - 1][cell.y]);
        } else if (cell.x == 0 && (cell.y > 0 && cell.y < SIDE - 1)) {
            neighbors.add(gameField[cell.x + 1][cell.y + 1]);
            neighbors.add(gameField[cell.x][cell.y + 1]);
            neighbors.add(gameField[cell.x + 1][cell.y]);
            neighbors.add(gameField[cell.x + 1][cell.y - 1]);
            neighbors.add(gameField[cell.x][cell.y - 1]);
        } else if (cell.x == 0 && cell.y == SIDE - 1) {
            neighbors.add(gameField[cell.x + 1][cell.y]);
            neighbors.add(gameField[cell.x][cell.y - 1]);
            neighbors.add(gameField[cell.x + 1][cell.y - 1]);
        } else if ((cell.x > 0 && cell.x < SIDE - 1) && cell.y == SIDE - 1) {
            neighbors.add(gameField[cell.x + 1][cell.y]);
            neighbors.add(gameField[cell.x - 1][cell.y]);
            neighbors.add(gameField[cell.x + 1][cell.y - 1]);
            neighbors.add(gameField[cell.x][cell.y - 1]);
            neighbors.add(gameField[cell.x - 1][cell.y - 1]);
        } else if (cell.x == SIDE - 1 && cell.y == SIDE - 1) {
            neighbors.add(gameField[cell.x - 1][cell.y]);
            neighbors.add(gameField[cell.x][cell.y - 1]);
            neighbors.add(gameField[cell.x - 1][cell.y - 1]);
        } else if (cell.x == SIDE - 1 && (cell.y > 0 && cell.y < SIDE - 1)) {
            neighbors.add(gameField[cell.x][cell.y + 1]);
            neighbors.add(gameField[cell.x][cell.y - 1]);
            neighbors.add(gameField[cell.x - 1][cell.y]);
            neighbors.add(gameField[cell.x - 1][cell.y - 1]);
            neighbors.add(gameField[cell.x - 1][cell.y + 1]);
        } else {
            neighbors.add(gameField[cell.x - 1][cell.y]);
            neighbors.add(gameField[cell.x - 1][cell.y - 1]);
            neighbors.add(gameField[cell.x - 1][cell.y + 1]);
            neighbors.add(gameField[cell.x][cell.y + 1]);
            neighbors.add(gameField[cell.x][cell.y - 1]);
            neighbors.add(gameField[cell.x + 1][cell.y - 1]);
            neighbors.add(gameField[cell.x + 1][cell.y]);
            neighbors.add(gameField[cell.x + 1][cell.y + 1]);
        }
        return neighbors;
    }

    private void countMineNeighbors() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (!gameField[j][i].isMine) {
                    ArrayList<GameObject> neighbors = getNeighbors(gameField[i][j]);
                    for (int n = 0; n < neighbors.size(); n++) {
                        if (neighbors.get(n).isMine) gameField[j][i].countMineNeighbors++;
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        if (gameField[y][x].isOpen || gameField[y][x].isFlag || isGameStopped) {

        } else if (gameField[y][x].isMine) {
            gameField[y][x].isOpen = true;
            countClosedTiles--;
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else if (!gameField[y][x].isMine && gameField[y][x].countMineNeighbors != 0) {
            gameField[y][x].isOpen = true;
            countClosedTiles--;
            setCellNumber(x, y, gameField[y][x].countMineNeighbors);
            setCellColor(x, y, Color.GREEN);
            score += 5;
            setScore(score);
        } else if (!gameField[y][x].isMine && gameField[y][x].countMineNeighbors == 0) {
            gameField[y][x].isOpen = true;
            countClosedTiles--;
            setCellColor(x, y, Color.GREEN);
            setCellValue(x, y, "");
            score += 5;
            setScore(score);
            ArrayList<GameObject> neighbors = getNeighbors(gameField[x][y]);
            for (GameObject neighbor : neighbors)
                if (!neighbor.isOpen) openTile(neighbor.x, neighbor.y);
        }
        if (countClosedTiles == countMinesOnField && !gameField[y][x].isMine) win();
    }

    private void markTile(int x, int y) {
        if (gameField[y][x].isOpen || isGameStopped) {

        } else if (!gameField[y][x].isFlag) {
            if (countFlags == 0) {

            } else {
                gameField[y][x].isFlag = true;
                setCellColor(x, y, Color.AQUA);
                setCellValue(x, y, FLAG);
                countFlags--;
            }
        } else if (gameField[y][x].isFlag) {
            gameField[y][x].isFlag = false;
            setCellColor(x, y, Color.ORANGE);
            setCellValue(x, y, "");
            countFlags++;
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) restart();
        else openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }
}