package com.afs.tdd;

public class CommandNotDefinedException extends RuntimeException {

    CommandNotDefinedException(String message){
        super(message);
    }
}
