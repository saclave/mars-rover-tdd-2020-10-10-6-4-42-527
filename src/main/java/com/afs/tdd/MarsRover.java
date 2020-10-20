package com.afs.tdd;

import java.util.Objects;

public class MarsRover implements RoverMovement{

    private int posX;
    private int posY;
    private Direction direction;

    public MarsRover(int posX, int posY, Direction direction) {
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final MarsRover marsRover = (MarsRover) o;
        return direction == marsRover.direction &&
                Objects.equals(posX, marsRover.posX) &&
                Objects.equals(posY, marsRover.posY);
    }
}
