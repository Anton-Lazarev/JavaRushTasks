package com.javarush.games.snake;

import java.util.*;

import com.javarush.engine.cell.*;

public class Snake {
    public boolean isAlive;
    private Direction direction = Direction.LEFT;
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    private List<GameObject> snakeParts = new ArrayList<>();

    public void setDirection(Direction toDirection) {
        if (direction == Direction.LEFT && toDirection == Direction.RIGHT) {
        } else if (direction == Direction.RIGHT && toDirection == Direction.LEFT) {
        } else if (direction == Direction.DOWN && toDirection == Direction.UP) {
        } else if (direction == Direction.UP && toDirection == Direction.DOWN) {
        } else if (direction == Direction.LEFT && snakeParts.get(0).x == snakeParts.get(1).x) {
        } else if (direction == Direction.RIGHT && snakeParts.get(0).x == snakeParts.get(1).x) {
        } else if (direction == Direction.UP && snakeParts.get(0).y == snakeParts.get(1).y) {
        } else if (direction == Direction.DOWN && snakeParts.get(0).y == snakeParts.get(1).y) {
        } else this.direction = toDirection;
    }

    public int getLength() {
        return snakeParts.size();
    }

    public Snake(int x, int y) {
        isAlive = true;
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        if (!isAlive) {
            game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.RED, 75);
            for (int i = 1; i < snakeParts.size(); i++) {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.RED, 75);
            }
        } else {
            game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.BLACK, 75);
            for (int i = 1; i < snakeParts.size(); i++) {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.BLACK, 75);
            }
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x < 0 || newHead.x > SnakeGame.WIDTH - 1) isAlive = false;
        else if (newHead.y < 0 || newHead.y > SnakeGame.HEIGHT - 1) isAlive = false;
        else {
            if (checkCollision(newHead)) {
                this.isAlive = false;
            } else {
                snakeParts.add(0, newHead);
                if (newHead.x == apple.x && newHead.y == apple.y) {
                    apple.isAlive = false;
                } else {
                    removeTail();
                }
            }
        }
    }

    public GameObject createNewHead() {
        if (direction == Direction.LEFT) {
            GameObject newHead = new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
            return newHead;
        } else if (direction == Direction.RIGHT) {
            GameObject newHead = new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
            return newHead;
        } else if (direction == Direction.UP) {
            GameObject newHead = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
            return newHead;
        } else {
            GameObject newHead = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
            return newHead;
        }
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public boolean checkCollision(GameObject newSnakeHead) {
        boolean haveCollision = false;
        for (GameObject snakePart : snakeParts) {
            if (newSnakeHead.x == snakePart.x && newSnakeHead.y == snakePart.y) haveCollision = true;
        }
        return haveCollision;
    }
}
