package com.learn_modelling.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlateauTest {

    @Test
    void shouldReturnWithinBoundsFor_X1Y1_WhenPlateauUpperBoundIs_X2Y2() {
        Plateau plateau = Plateau.createPlateau(2, 2);
        Coordinate coordinate = new Coordinate(1, 1);

        assertTrue(plateau.hasWithinBounds(coordinate));
    }

    @Test
    void shouldReturnOutOfBoundsFor_X3Y3_WhenPlateauUpperBoundIs_X2Y2() {
        Plateau plateau = Plateau.createPlateau(2, 2);
        Coordinate coordinate = new Coordinate(3, 3);

        assertFalse(plateau.hasWithinBounds(coordinate));
    }

    @Test
    void shouldReturnOutOfBoundsFor_XMinus1Y2_WhenPlateauUpperBoundIs_X2Y2() {
        Plateau plateau = Plateau.createPlateau(2, 2);
        Coordinate coordinate = new Coordinate(-1, 3);

        assertFalse(plateau.hasWithinBounds(coordinate));
    }

}