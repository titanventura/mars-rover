package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoordinateTest {
    @Test
    void shouldCompareOneCoordinateWithAnother() {
        Coordinate coordinate = new Coordinate(2, 3);
        Coordinate other = new Coordinate(2, 3);

        assertEquals(other, coordinate);
    }

    @Test
    void shouldReturnOutOfBoundsWhenX3AndY2IsComparedWithX3AndY3() {
        Coordinate coordinate = new Coordinate(3, 2);
        Coordinate greater = new Coordinate(3, 3);

        assertTrue(greater.isXOrYGreater(coordinate));
    }

    @Test
    void shouldAddXAndYOffsetsToCoordinate() {
        Coordinate coordinate = new Coordinate(1, 1);
        Coordinate offset = new Coordinate(2, 3);
        Coordinate expected = new Coordinate(3, 4);

        Coordinate actual = coordinate.add(offset);

        assertEquals(expected, actual);
    }
}
