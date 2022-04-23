package com.learn_modelling.mars_rover;

public class Rover {
    private Coordinate coordinate;
    private Direction direction;
    private final Coordinate plateau;

    public Rover(Coordinate coordinate, Direction direction, Coordinate plateau) {
        this.coordinate = coordinate;
        this.direction = direction;
        this.plateau = plateau;
    }

    public Coordinate coordinate() {
        return coordinate;
    }

    public Direction direction() {
        return direction;
    }

    public void move(String instructions) throws RoverOutOfPlateauBoundsException {
        Coordinate coordinate = this.coordinate;
        Direction direction = this.direction;

        for (Character ch : instructions.toCharArray()) {
            switch (ch) {
                case 'L':
                    direction = direction.left();
                    break;
                case 'R':
                    direction = direction.right();
                    break;
                case 'M':
                    coordinate = coordinate.add(new Coordinate(direction.xMovement, direction.yMovement));
                    break;
            }
        }

        if (coordinate.isOutOfBounds(plateau)) throw new RoverOutOfPlateauBoundsException();

        this.coordinate = coordinate;
        this.direction = direction;
    }
}
