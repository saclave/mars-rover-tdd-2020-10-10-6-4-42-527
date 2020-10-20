package com.afs.tdd;

public enum Direction {
    NORTH{
        @Override
        Direction rotateLeft(){
            return WEST;
        }

        @Override
        Direction rotateRight(){
            return EAST;
        }
    },

    SOUTH {
        @Override
        Direction rotateLeft() {
            return EAST;
        }

        @Override
        Direction rotateRight() {
            return WEST;
        }
    },

    EAST {
        @Override
        Direction rotateLeft() {
            return NORTH;
        }

        @Override
        Direction rotateRight() {
            return SOUTH;
        }
    },

    WEST {
        @Override
        Direction rotateLeft() {
            return SOUTH;
        }

        @Override
        Direction rotateRight() {
            return NORTH;
        }
    };

    abstract Direction rotateLeft();

    abstract Direction rotateRight();
}
