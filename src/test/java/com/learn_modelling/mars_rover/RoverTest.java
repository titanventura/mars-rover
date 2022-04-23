package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void shouldRunProperlyWhenLeftAndMoveInstructionsAreGiven() {
        int plateauX = 5;
        int plateauY = 5;
        Vector vector = new Vector(1, 2, Direction.NORTH);
        Rover rover = new Rover(vector, plateauX, plateauY);
        Vector expected = new Vector(1, 3, Direction.NORTH);

        rover.move("LMLMLMLMM");

        assertEquals(expected, rover.vector());
    }
    @Test
    void shouldRunProperlyWhenRightAndMoveInstructionsAreGiven() {
        int plateauX = 5;
        int plateauY = 5;
        Vector vector = new Vector(3, 3, Direction.EAST);
        Rover rover = new Rover(vector, plateauX, plateauY);
        Vector expected = new Vector(5, 1, Direction.EAST);

        rover.move("MMRMMRMRRM");

        assertEquals(expected, rover.vector());
    }
}
