package com.afs.tdd;

import java.util.Arrays;

import static com.afs.tdd.Constants.*;


public class MarsRover {

    private int posX;
    private int posY;
    private String direction;

    public MarsRover(int posX , int posY, String direction) {
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
    }

    public void moveMarsRover(String movements) {
        Arrays.asList(movements.split(""))
                .forEach(move -> {
                    try {
                        this.sortRoverMovement(move);
                    } catch (CommandNotDefinedException e) {
                        e.printStackTrace();
                    }
                });
    }

    void sortRoverMovement(String move) throws CommandNotDefinedException {
        switch(move){
            case MOVE: moveFoward(); break;
            case LEFT: turnLeft(); break;
            case RIGHT: turnRight(); break;
            default:
                throw new CommandNotDefinedException("Invalid movement");
        }
    }

    private void turnRight() {
        switch(direction){
            case NORTH: direction = EAST; break;
            case SOUTH: direction = WEST; break;
            case EAST: direction = SOUTH; break;
            case WEST: direction = NORTH; break;
            default: direction = null;
        }
    }

    private void turnLeft() {
        switch(direction){
            case NORTH: direction = WEST; break;
            case SOUTH: direction = EAST; break;
            case EAST: direction = NORTH; break;
            case WEST: direction = SOUTH; break;
            default: direction = null;
        }
    }

    private void moveFoward() {
        switch(direction){
            case NORTH: posY += 1; break;
            case SOUTH: posY -= 1; break;
            case EAST: posX += 1; break;
            case WEST: posX -= 1; break;
            default: direction = null;
        }
    }

    public int getXPosition() {
        return posX;
    }

    public int getYPosition(){
        return posY;
    }

    public String getDirection(){
        return direction;
    }
}
