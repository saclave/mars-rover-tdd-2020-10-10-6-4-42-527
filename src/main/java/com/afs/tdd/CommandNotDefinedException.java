package com.afs.tdd;

public class CommandNotDefinedException extends RuntimeException {

    public CommandNotDefinedException (String message){
        super(message);
    }
}
