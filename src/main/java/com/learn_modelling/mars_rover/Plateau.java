package com.learn_modelling.mars_rover;

public class Plateau {

    private final Coordinate upperRightBound;
    private final Coordinate bottomLeftBound;

    public static Plateau createPlateau(int upperRightX, int upperRightY) {
        return new Plateau(new Coordinate(0, 0), new Coordinate(upperRightX, upperRightY));
    }

    public Plateau(Coordinate bottomLeftBound, Coordinate upperRightBound) {
        this.bottomLeftBound = bottomLeftBound;
        this.upperRightBound = upperRightBound;
    }

    public boolean hasWithinBounds(Coordinate coordinate) {
        boolean upperRightCheck = coordinate.isXOrYGreater(upperRightBound);
        boolean bottomLeftCheck = bottomLeftBound.isXOrYGreater(coordinate);

        return !(upperRightCheck) && !(bottomLeftCheck);
    }
}
