package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {
    @Test
    void shouldReturnEastWhenTurnedRightFromNorth() {
        Direction north = Direction.NORTH;
        Direction expected = Direction.EAST;

        Direction actual = north.right();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnWestWhenTurnedRightFromSouth() {
        Direction south = Direction.SOUTH;
        Direction expected = Direction.WEST;

        Direction actual = south.right();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnEastWhenTurnedLeftFromSouth() {
        Direction south = Direction.SOUTH;
        Direction expected = Direction.EAST;

        Direction actual = south.left();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnWestWhenTurnedLeftFromNorth() {
        Direction south = Direction.NORTH;
        Direction expected = Direction.WEST;

        Direction actual = south.left();

        assertEquals(expected, actual);
    }
}
