package com.afs.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DemoTest {
    @Test
    void test_when_x0_y0_heading_N_with_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        //when
        marsRover.moveMarsRover("M");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(1, marsRover.getYPosition());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_N_with_command_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        //when
        marsRover.moveMarsRover("L");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_N_with_command_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        //when
        marsRover.moveMarsRover("R");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_S_with_command_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        //when
        marsRover.moveMarsRover("M");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(-1, marsRover.getYPosition());
        assertEquals("S", marsRover.getDirection());
    }


    @Test
    void test_when_x0_y0_heading_S_with_command_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        //when
        marsRover.moveMarsRover("L");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_S_with_command_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        //when
        marsRover.moveMarsRover("R");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_E_with_command_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        //when
        marsRover.moveMarsRover("M");
        //then
        assertEquals(1, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_E_with_command_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        //when
        marsRover.moveMarsRover("L");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_E_with_command_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        //when
        marsRover.moveMarsRover("R");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_W_with_command_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        //when
        marsRover.moveMarsRover("M");
        //then
        assertEquals(-1, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_W_with_command_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        //when
        marsRover.moveMarsRover("L");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_W_with_command_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        //when
        marsRover.moveMarsRover("R");
        //then
        assertEquals(0, marsRover.getXPosition());
        assertEquals(0, marsRover.getYPosition());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_N_with_multiple_commands(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        //when
        marsRover.moveMarsRover("MLMR");
        //then
        assertEquals(-1, marsRover.getXPosition());
        assertEquals(1, marsRover.getYPosition());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void test_when_x0_y0_heading_N_with_invalid_commands() {
        //then
        assertThrows(CommandNotDefinedException.class, () -> {
            //given
            MarsRover marsRover = new MarsRover(0, 0, Direction.N);
            //when
            marsRover.sortRoverMovement("F");
        });
    }
}



