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

    public void move() {
        this.vector = this.vector.move();
    }

    public void move(String instructions) {
        for (Character c : instructions.toCharArray()) {
            switch (c) {
                case 'L':
                    this.vector = this.vector.left();
                    break;
                case 'R':
                    this.vector = this.vector.right();
                case 'M':
                    this.move();
                    break;
                default:
                    break;
            }
        }
    }

}
