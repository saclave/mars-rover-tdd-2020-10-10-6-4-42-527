package com.afs.tdd;

import java.util.Arrays;

import static com.afs.tdd.Constants.*;

public class MarsRover implements RoverMovement{

    private Coordinates coordinates;
    private int posX;
    private int posY;
    private Direction direction;

    public MarsRover(Coordinates coordinates, Direction direction) {
        this.coordinates = coordinates;
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
        posX = coordinates.getXPosition();
        posY = coordinates.getYPosition();

        if (direction == NORTH) coordinate = new Coordinate(x, y + 1);
        if (direction == EAST) coordinate = new Coordinate(x + 1, y);
        if (direction == WEST) coordinate = new Coordinate(x - 1, y);
        if (direction == SOUTH) coordinate = new Coordinate(x, y - 1);
    }

}

//switch(direction){
//        case NORTH: posY += 1; break;
//        case SOUTH: posY -= 1; break;
//        case EAST: posX += 1; break;
//        case WEST: posX -= 1; break;
//default: direction = null;
//        }
