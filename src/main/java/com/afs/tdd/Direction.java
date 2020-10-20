package com.afs.tdd;

public enum Direction {
    N{
        @Override
        Direction rotateLeft(){
            return W;
        }

        @Override
        Direction rotateRight(){
            return E;
        }
    },

    S {
        @Override
        Direction rotateLeft() {
            return E;
        }

        @Override
        Direction rotateRight() {
            return W;
        }
    },

    E {
        @Override
        Direction rotateLeft() {
            return N;
        }

        @Override
        Direction rotateRight() {
            return S;
        }
    },

    W {
        @Override
        Direction rotateLeft() {
            return S;
        }

        @Override
        Direction rotateRight() {
            return N;
        }
    };

    abstract Direction rotateLeft();

    abstract Direction rotateRight();
}
