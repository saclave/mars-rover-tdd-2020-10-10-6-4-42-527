package com.afs.tdd;

import java.util.Arrays;

import static com.afs.tdd.Constants.*;

public class CommandReceiver{

    private RoverControl roverControl = new RoverControl();
    private MarsRover marsRover;

    public CommandReceiver(MarsRover marsRover){
        this.marsRover = marsRover;
    }

    public void moveMarsRover(String movements) {
        Arrays.asList(movements.split(""))
                .forEach(this::sortRoverMovement);

        roverControl.run();
    }

    private void sortRoverMovement(String move) throws CommandNotDefinedException {
        switch(move){
            case MOVE: roverControl.record(marsRover::moveForward); break;
            case LEFT: roverControl.record(marsRover::turnLeft); break;
            case RIGHT: roverControl.record(marsRover::turnRight); break;
            default:
                throw new CommandNotDefinedException("Invalid movement");
        }
    }
}
