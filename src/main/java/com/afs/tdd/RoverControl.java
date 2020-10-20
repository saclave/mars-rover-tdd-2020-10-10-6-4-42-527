package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

class RoverControl {

    private List<Command> commands;

    RoverControl() {
        commands = new ArrayList<>();
    }

    void run() {
        commands.forEach(Command::execute);
    }

    void record(Command command) {
        commands.add(command);
    }
}
