package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class RoverControl {

    private List<Command> commands;

    public RoverControl() {
        commands = new ArrayList<>();
    }

    public void run() {
        commands.forEach(Command::execute);
    }

    public void record(Command command) {
        commands.add(command);
    }
}
