package com.afs.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class DemoTest {
    private MarsRover marsRover;
    private CommandReceiver commandReceiver;

    @Test
    void when_x0_y0_heading_N_with_command_M() {
        //given
        marsRover = new MarsRover(0, 0, Direction.N);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("M");
        //then
        assertEquals(new MarsRover(0, 1, Direction.N), marsRover);
    }

    @Test
    void when_x0_y0_heading_N_with_command_L() {
        //given
        marsRover = new MarsRover(0, 0, Direction.N);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("L");
        //then
        assertEquals(new MarsRover(0, 0, Direction.W), marsRover);
    }

    @Test
    void when_x0_y0_heading_N_with_command_R() {
        //given
        marsRover = new MarsRover(0, 0, Direction.N);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("R");

        //then
        assertEquals(new MarsRover(0, 0, Direction.E), marsRover);
    }

    @Test
    void when_x0_y0_heading_S_with_command_M() {
        //given
        marsRover = new MarsRover(0, 0, Direction.S);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("M");

        //then
        assertEquals(new MarsRover(0, -1, Direction.S), marsRover);

    }

    @Test
    void when_x0_y0_heading_S_with_command_L() {
        //given
        marsRover = new MarsRover(0, 0, Direction.S);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("L");

        //then
        assertEquals(new MarsRover(0, 0, Direction.E), marsRover);
    }

    @Test
    void when_x0_y0_heading_S_with_command_R() {
        //given
        marsRover = new MarsRover(0, 0, Direction.S);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("R");

        //then
        assertEquals(new MarsRover(0, 0, Direction.W), marsRover);
    }

    @Test
    void when_x0_y0_heading_E_with_command_M() {
        //given
        marsRover = new MarsRover(0, 0, Direction.E);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("M");

        //then
        assertEquals(new MarsRover(1, 0, Direction.E), marsRover);
    }

    @Test
    void when_x0_y0_heading_E_with_command_L() {
        //given
        marsRover = new MarsRover(0, 0, Direction.E);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("L");

        //then
        assertEquals(new MarsRover(0, 0, Direction.N), marsRover);
    }

    @Test
    void when_x0_y0_heading_E_with_command_R() {
        //given
        marsRover = new MarsRover(0, 0, Direction.E);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("R");

        //then
        assertEquals(new MarsRover(0, 0, Direction.S), marsRover);
    }

    @Test
    void when_x0_y0_heading_W_with_command_M() {
        //given
        marsRover = new MarsRover(0, 0, Direction.W);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("M");

        //then
        assertEquals(new MarsRover(-1, 0, Direction.W), marsRover);
    }

    @Test
    void when_x0_y0_heading_W_with_command_L() {
        //given
        marsRover = new MarsRover(0, 0, Direction.W);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("L");

        //then
        assertEquals(new MarsRover(0, 0, Direction.S), marsRover);
    }

    @Test
    void when_x0_y0_heading_W_with_command_R() {
        //given
        marsRover = new MarsRover(0, 0, Direction.W);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("R");

        //then
        assertEquals(new MarsRover(0, 0, Direction.N), marsRover);
    }

    @Test
    void when_x0_y0_heading_N_with_multiple_commands() {
        //given
        marsRover = new MarsRover(0, 0, Direction.N);
        commandReceiver = new CommandReceiver(marsRover);
        //when
        commandReceiver.moveMarsRover("MLMR");

        //then
        assertEquals(new MarsRover(-1, 1, Direction.N), marsRover);

    }

    @Test
    void should_throw_exception_when_x0_y0_heading_N_with_invalid_commands() {
        //then
        assertThrows(CommandNotDefinedException.class, () -> {
            //given
            marsRover = new MarsRover(0, 0, Direction.N);
            commandReceiver = new CommandReceiver(marsRover);
            //when
            commandReceiver.moveMarsRover("F");
        });
    }
}



