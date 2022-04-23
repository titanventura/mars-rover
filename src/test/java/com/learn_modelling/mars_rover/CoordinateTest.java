package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoordinateTest {
    @Test
    void shouldCompareOneCoordinateWithAnother() {
        Coordinate coordinate = new Coordinate(2, 3);
        Coordinate other = new Coordinate(2, 3);

        assertEquals(coordinate, other);
    }

    @Test
    void shouldReturnOutOfBoundsWhenX2AndY2IsComparedWithX3AndY2() {
        Coordinate coordinate = new Coordinate(2, 2);
        Coordinate greater = new Coordinate(3,2);

        assertTrue(greater.isOutOfBounds(coordinate));
    }
}
