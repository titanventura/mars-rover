package com.learn_modelling.mars_rover;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Direction {

    NORTH(360), EAST(90), SOUTH(180), WEST(270);


    private static Map<Integer, Direction> angleDirectionMap;

    static {
        loadDirectionsAndAngles();
    }

    private static void loadDirectionsAndAngles() {
        angleDirectionMap = new HashMap<>();
        Direction[] directions = new Direction[]{Direction.NORTH, Direction.EAST, Direction.WEST, Direction.SOUTH};
        Arrays.stream(directions).forEach(direction -> angleDirectionMap.put(direction.angle, direction));
    }

    private final int angle;

    Direction(int angle) {
        this.angle = angle;
    }

    public Direction left() {
        return angleDirectionMap.get(
                (this.angle - 90) % 360
        );
    }

    public Direction right() {
        return angleDirectionMap.get(
                (this.angle + 90) % 360
        );
    }

}
