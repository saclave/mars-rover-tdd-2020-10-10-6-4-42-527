package com.afs.tdd;

public class MarsRover {

    private int posX;
    private int posY;
    private String direction;

    public MarsRover(int posX , int posY, String direction) {
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
    }

    public void moveMarsRover(String movement) {
        if(movement.equals("M")){
            moveFoward();
        }
        if(movement.equals("L")){
            turnLeft();
        }
        if(movement.equals("R")){
            turnRight();
        }
    }

    private void turnRight() {
        if(direction.equals("N")){
            direction = "E";
        }
        else if(direction.equals("S")){
            direction = "W";
        }
    }

    private void turnLeft() {
        if(direction.equals("N")){
            direction = "W";
        }
        else if(direction.equals("S")){
            direction = "E";
        }
        else if(direction.equals("E")){
            direction = "N";
        }
    }

    private void moveFoward() {
        if(direction.equals("N")){
            posY += 1;
        }
        else if(direction.equals("S")){
            posY -= 1;
        }
        else if(direction.equals("M")){
            posX += 1;
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
