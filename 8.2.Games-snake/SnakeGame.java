package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private static final int GOAL = 28;
    private boolean isGameStopped;
    private int score;
    private int turnDelay;
    private Snake snake;
    private Apple apple;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        isGameStopped = false;
        score = 0;
        setScore(score);
        turnDelay = 300;
        setTurnTimer(turnDelay);
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        drawScene();
    }

    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) setCellValueEx(x, y, Color.DARKORANGE, "");
        }
        snake.draw(this);
        apple.draw(this);
    }

    private void createNewApple() {
        apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
        while (snake.checkCollision(apple)) {
            apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
        }
    }

    private void gameOver() {
        this.isGameStopped = true;
        stopTurnTimer();
        showMessageDialog(Color.AQUAMARINE, "GAME OVER", Color.BLACK, 120);
    }

    private void win() {
        this.isGameStopped = true;
        stopTurnTimer();
        showMessageDialog(Color.AQUAMARINE, "YOU WIN", Color.BLACK, 120);
    }

    @Override
    public void onTurn(int step) {
        snake.move(apple);
        if (!apple.isAlive) {
            score += 5;
            setScore(score);
            turnDelay -= 10;
            setTurnTimer(turnDelay);
            createNewApple();
        }
        if (!snake.isAlive) gameOver();
        if (snake.getLength() > GOAL) win();
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        if (key.equals(Key.LEFT)) snake.setDirection(Direction.LEFT);
        else if (key.equals(Key.RIGHT)) snake.setDirection(Direction.RIGHT);
        else if (key.equals(Key.UP)) snake.setDirection(Direction.UP);
        else if (key.equals(Key.DOWN)) snake.setDirection(Direction.DOWN);
        else if (key.equals(Key.SPACE)) if (isGameStopped) createGame();
    }
}
