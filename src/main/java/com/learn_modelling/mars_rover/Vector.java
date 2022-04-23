package com.learn_modelling.mars_rover;

import java.util.Objects;

public class Vector {
    private final int x;
    private final int y;
    private final Direction direction;

    public Vector(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return x == vector.x && y == vector.y && direction == vector.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }

    public boolean isOutOfBounds(Vector other) {
        return this.x > other.x || this.y > other.y;
    }

    public Vector move() {
        return new Vector(this.x + direction.xMovement, this.y + direction.yMovement, this.direction);
    }


    public Vector left() {
        return new Vector(this.x, this.y, direction.left());
    }

    public Vector right() {
        return new Vector(this.x, this.y, direction.right());
    }
}
