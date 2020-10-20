package com.afs.tdd;

import jdk.jfr.internal.cmd.Command;

public class MarsRoverController {
    private List<Command> commands;

    public MarsRoverController(){
        commands = new ArrayList<>();
    }

    public void run(){
        commands.forEach(Command::execute);
    }

    public void record(Command command){
        commands.add(command);
    }
}
