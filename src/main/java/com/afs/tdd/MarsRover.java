package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private static final String NORTH = "N";
    private static final String EAST = "E";
    private static final String SOUTH = "S";
    private static final String WEST = "W";

    int x;
    int y;
    String direction;

    private static final Map<String, String> RIGHT_TURN_MAP = new HashMap<>();
    private static final Map<String, String> LEFT_TURN_MAP = new HashMap<>();
    private static final Map<String, int[]> MOVE_FORWARD_MAP = new HashMap<>();

    static {
        RIGHT_TURN_MAP.put(NORTH, EAST);
        RIGHT_TURN_MAP.put(EAST, SOUTH);
        RIGHT_TURN_MAP.put(SOUTH, WEST);
        RIGHT_TURN_MAP.put(WEST, NORTH);

        LEFT_TURN_MAP.put(NORTH, WEST);
        LEFT_TURN_MAP.put(WEST, SOUTH);
        LEFT_TURN_MAP.put(SOUTH, EAST);
        LEFT_TURN_MAP.put(EAST, NORTH);

        MOVE_FORWARD_MAP.put(NORTH, new int[]{0, 1});
        MOVE_FORWARD_MAP.put(EAST,  new int[]{1, 0});
        MOVE_FORWARD_MAP.put(SOUTH, new int[]{0, -1});
        MOVE_FORWARD_MAP.put(WEST,  new int[]{-1, 0});
    }

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        switch (command) {
            case "M":
                moveRover();
                break;
            case "L":
                turnLeftRover();
                break;
            case "R":
                turnRightRover();
                break;
        }
    }

    private void turnRightRover() {
        direction = RIGHT_TURN_MAP.get(direction);
    }

    private void turnLeftRover() {
        direction = LEFT_TURN_MAP.get(direction);
    }

    private void moveRover() {
        int[] delta = MOVE_FORWARD_MAP.get(direction);
        this.x += delta[0];
        this.y += delta[1];
    }
}