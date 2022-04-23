package com.learn_modelling.mars_rover;

public class Rover {
    private Vector vector;
    private final int plateauX;
    private final int plateauY;

    public Rover(Vector vector, int plateauX, int plateauY) {
        this.vector = vector;
        this.plateauX = plateauX;
        this.plateauY = plateauY;
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
