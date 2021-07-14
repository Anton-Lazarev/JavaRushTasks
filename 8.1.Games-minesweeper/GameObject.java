package com.javarush.games.minesweeper;

public class GameObject {
    public int x,y, countMineNeighbors;
    public boolean isMine, isOpen, isFlag;


    public GameObject(int inX, int inY, boolean isMine){
        this.x = inX;
        this.y = inY;
        this.isMine = isMine;
        this.isOpen = false;
        this.isFlag = false;
        this.countMineNeighbors = 0;
    }
}
