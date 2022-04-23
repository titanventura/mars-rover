package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VectorTest {
    @Test
    void shouldCompareOneCoordinateWithAnother() {
        Vector vector = new Vector(2, 3, Direction.NORTH);
        Vector other = new Vector(2, 3, Direction.NORTH);

        assertEquals(vector, other);
    }

    @Test
    void shouldReturnOutOfBoundsWhenX2AndY2IsComparedWithX3AndY2() {
        Vector vector = new Vector(2, 2, Direction.NORTH);
        Vector greater = new Vector(3, 2, Direction.NORTH);

        assertTrue(greater.isOutOfBounds(vector));
    }
}
