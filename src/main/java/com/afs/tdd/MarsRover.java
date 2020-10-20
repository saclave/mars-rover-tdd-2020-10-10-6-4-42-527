package com.afs.tdd;

import java.util.Arrays;

import static com.afs.tdd.Constants.*;

public class MarsRover implements RoverMovement{

    private int posX;
    private int posY;
    private Direction direction;

    public MarsRover(int posX, int posY, Direction direction) {
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

    public void sortRoverMovement(String move) throws CommandNotDefinedException {
        switch(move){
            case MOVE: moveForward(); break;
            case LEFT: turnLeft(); break;
            case RIGHT: turnRight(); break;
            default:
                throw new CommandNotDefinedException("Invalid movement");
        }
    }

    @Override
    public void turnRight() {
        direction = direction.rotateRight();
    }

    @Override
    public void turnLeft() {
        direction = direction.rotateLeft();
    }

    @Override
    public void moveForward() {
        switch(direction) {
            case N:
                posY += 1;
                break;
            case S:
                posY -= 1;
                break;
            case E:
                posX += 1;
                break;
            case W:
                posX -= 1;
                break;
            default:
                direction = null;
        }
    }

    public int getXPosition() {
        return posX;
    }

    public int getYPosition() {
        return posY;
    }

    public String getDirection() {
        return String.valueOf(direction);
    }
}
