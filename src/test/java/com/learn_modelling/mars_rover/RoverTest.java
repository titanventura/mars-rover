package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void shouldFaceWestWhenTurnedLeftFromNorth() {
        Coordinate coordinate = new Coordinate(1, 1);
        Rover rover = new Rover(coordinate, Direction.NORTH);

        rover.turnLeft();

        assertEquals(Direction.WEST, rover.direction());
    }

    @Test
    void shouldFaceSouthWhenTurnedRightFromEast() {
        Coordinate coordinate = new Coordinate(1, 1);
        Rover rover = new Rover(coordinate, Direction.EAST);

        rover.turnRight();

        assertEquals(Direction.SOUTH, rover.direction());
    }

    @Test
    void shouldReturnForwardCoordinateAs_X2Y1_WhenCoordinateIs_X1Y1_AndDirectionIsEast() {
        Coordinate coordinate = new Coordinate(1, 1);
        Rover rover = new Rover(coordinate, Direction.EAST);
        Coordinate expected = new Coordinate(2, 1);

        assertEquals(expected, rover.forwardCoordinate());
    }

    @Test
    void shouldBeAt_X1Y2_WhenMovedForwardFrom_X1Y1_AndDirectionIsNorth() {
        Coordinate coordinate = new Coordinate(1, 1);
        Rover rover = new Rover(coordinate, Direction.NORTH);
        Coordinate expected = new Coordinate(1, 2);

        rover.moveForward();

        assertEquals(expected, rover.coordinate());
        assertEquals(Direction.NORTH, rover.direction());
    }
}
