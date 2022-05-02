package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverTest {

    @Test
    void shouldBeAt_X1Y3_WhenIsAt_X1Y2_AndLeftAndMoveInstructionsAreGiven() throws RoverOutOfPlateauBoundsException {
        Coordinate plateau = new Coordinate(5, 5);
        Coordinate coordinate = new Coordinate(1, 2);
        Rover rover = new Rover(coordinate, Direction.NORTH, plateau);
        Coordinate expectedCoordinate = new Coordinate(1, 3);

        rover.move("LMLMLMLMM");

        assertEquals(expectedCoordinate, rover.coordinate());
        assertEquals(Direction.NORTH, rover.direction());
    }

    @Test
    void shouldBeAt_X5Y1_WhenIsAt_X3Y3_AndMoveAndRightInstructionsAreGiven() throws RoverOutOfPlateauBoundsException {
        Coordinate plateau = new Coordinate(5, 5);
        Coordinate coordinate = new Coordinate(3, 3);
        Rover rover = new Rover(coordinate, Direction.EAST, plateau);
        Coordinate expected = new Coordinate(5, 1);

        rover.move("MMRMMRMRRM");

        assertEquals(expected, rover.coordinate());
        assertEquals(Direction.EAST, rover.direction());
    }

    @Test
    void shouldRaiseExceptionWhenRoverMovesOutOfBounds() {
        Coordinate plateau = new Coordinate(5, 5);
        Coordinate coordinate = new Coordinate(2, 3);
        Rover rover = new Rover(coordinate, Direction.NORTH, plateau);

        assertThrows(RoverOutOfPlateauBoundsException.class, () -> rover.move("MMM"));
    }
}
