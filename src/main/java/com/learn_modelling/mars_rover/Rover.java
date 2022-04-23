package com.learn_modelling.mars_rover;

public class Rover {
    private Vector vector;
    private final Plateau plateau;

    public Rover(Vector vector, Plateau plateau) {
        this.vector = vector;
        this.plateau = plateau;
    }

    public Vector vector() {
        return vector;
    }


    public void move(String instructions) {
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

        this.vector = vector;
    }

}
