package com.learn_modelling.mars_rover;

public class Rover {
    private Vector vector;
    private final Vector plateau;

    public Rover(Vector vector, Vector plateau) {
        this.vector = vector;
        this.plateau = plateau;
    }

    public Vector vector() {
        return vector;
    }


    public void move(String instructions) throws RoverOutOfPlateauBoundsException {
        Vector vector = this.vector;
        for (Character c : instructions.toCharArray()) {
            switch (c) {
                case 'L':
                    vector = vector.left();
                    break;
                case 'R':
                    vector = vector.right();
                case 'M':
                    vector = vector.move();
                    break;
                default:
                    break;
            }
        }
        if (vector.isOutOfBounds(plateau)) throw new RoverOutOfPlateauBoundsException();
        this.vector = vector;
    }

}
