package com.learn_modelling.mars_rover;

public class Rover {
    private Coordinate coordinate;
    private Direction direction;

    public static Rover createRover(int x, int y, Direction direction) {
        return new Rover(new Coordinate(x, y), direction);
    }

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

    public Coordinate forwardCoordinate() {
        return this.coordinate.add(new Coordinate(this.direction.xMovement, this.direction.yMovement));
    }

    public void moveForward() {
        this.coordinate = forwardCoordinate();
    }

    @Override
    public String toString() {
        return String.format("%s %s", coordinate.toString(), direction.toString());
    }
}
