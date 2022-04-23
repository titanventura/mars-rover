package com.learn_modelling.mars_rover;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Direction {

    NORTH(0, 0, 1),
    EAST(90, 1, 0),
    SOUTH(180, 0, -1),
    WEST(270, -1, 0);


    private static Map<Integer, Direction> angleDirectionMap;

    static {
        loadAnglesAndDirections();
    }

    private static void loadAnglesAndDirections() {
        angleDirectionMap = new HashMap<>();
        Direction[] directions = new Direction[]{Direction.NORTH, Direction.EAST, Direction.WEST, Direction.SOUTH};
        Arrays.stream(directions).forEach(direction -> angleDirectionMap.put(direction.angle, direction));
    }

    private final int angle;
    public final int xMovement;
    public final int yMovement;

    Direction(int angle, int xMovement, int yMovement) {
        this.angle = angle;
        this.xMovement = xMovement;
        this.yMovement = yMovement;
    }

    public Direction left() {
        return angleDirectionMap.get(
                (360 + this.angle - 90) % 360
        );
    }

    public Direction right() {
        return angleDirectionMap.get(
                (360 + this.angle + 90) % 360
        );
    }

}
