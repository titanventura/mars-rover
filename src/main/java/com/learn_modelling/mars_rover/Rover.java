package com.learn_modelling.mars_rover;

public class Rover {
    private Coordinate coordinate;
    private Direction direction;

    public Rover(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate coordinate() {
        return coordinate;
    }

    public Direction direction() {
        return direction;
    }


    public void turnLeft() {
        this.direction = this.direction.left();
    }

    public void turnRight() {
        this.direction = this.direction.right();
    }

    public void moveForward() {
        Coordinate offset = new Coordinate(this.direction.xMovement, this.direction.yMovement);
        this.coordinate = this.coordinate.add(offset);
    }
}
