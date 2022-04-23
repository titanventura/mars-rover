package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverTest {
    @Test
    void shouldRunProperlyWhenLeftAndMoveInstructionsAreGiven() throws RoverOutOfPlateauBoundsException {
        Vector plateau = new Vector(5, 5, Direction.NULL_DIRECTION);
        Vector vector = new Vector(1, 2, Direction.NORTH);
        Rover rover = new Rover(vector, plateau);
        Vector expected = new Vector(1, 3, Direction.NORTH);

        rover.move("LMLMLMLMM");

        assertEquals(expected, rover.vector());
    }

    @Test
    void shouldRunProperlyWhenRightAndMoveInstructionsAreGiven() throws RoverOutOfPlateauBoundsException {
        Vector plateau = new Vector(5, 5, Direction.NULL_DIRECTION);
        Vector vector = new Vector(3, 3, Direction.EAST);
        Rover rover = new Rover(vector, plateau);
        Vector expected = new Vector(5, 1, Direction.EAST);

        rover.move("MMRMMRMRRM");

        assertEquals(expected, rover.vector());
    }

    @Test
    void shouldRaiseExceptionWhenRoverMovesOutOfBounds() {
        Vector plateau = new Vector(5, 5, Direction.NULL_DIRECTION);
        Vector vector = new Vector(2, 3, Direction.NORTH);
        Rover rover = new Rover(vector, plateau);

        assertThrows(RoverOutOfPlateauBoundsException.class, () -> rover.move("MMM"));
    }
}
