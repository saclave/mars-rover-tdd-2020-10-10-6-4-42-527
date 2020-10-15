package com.afs.tdd;

import java.util.Arrays;

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
                .forEach(move -> this.sortRoverMovement(move));
    }

    public void sortRoverMovement(String move) {
        if(move.equals("M")){
            moveFoward();
        }
        else if(move.equals("L")){
            turnLeft();
        }
        else if(move.equals("R")){
            turnRight();
        }else{
            //throw new CommandNotDefinedException("Invalid movement");
        }
    }

    private void turnRight() {
        if(direction.equals("N")){
            direction = "E";
        }
        else if(direction.equals("S")){
            direction = "W";
        }
        else if(direction.equals("E")){
            direction = "S";
        }
        else if(direction.equals("W")){
            direction = "N";
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
        else if(direction.equals("W")){
            direction = "S";
        }
    }

    private void moveFoward() {
        if(direction.equals("N")){
            posY += 1;
        }
        else if(direction.equals("S")){
            posY -= 1;
        }
        else if(direction.equals("E")){
            posX += 1;
        }
        else if(direction.equals("W")){
            posX -= 1;
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
