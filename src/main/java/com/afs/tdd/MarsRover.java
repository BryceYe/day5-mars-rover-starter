package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private static final String NORTH = "N";
    private static final String EAST = "E";
    private static final String SOUTH = "S";
    private static final String WEST = "W";

    public void executeCommand(Location location, String command) {
        switch (command) {
            case "M":
                moveRover(location);
                break;
            case "L":
                turnLeftRover(location);
                break;
            case "R":
                turnRightRover(location);
                break;
            case "MB":
                moveBackRover(location);
                break;
        }
    }

    public void executeCommands(Location location, String commands) {
        Arrays.stream(commands.split("")).forEach(command -> executeCommand(location, command));
    }

    private void turnRightRover(Location location) {
        switch (location.getDirection()) {
            case NORTH:
                location.setDirection(EAST);
                break;
            case EAST:
                location.setDirection(SOUTH);
                break;
            case SOUTH:
                location.setDirection(WEST);
                break;
            case WEST:
                location.setDirection(NORTH);
                break;
        }
    }

    private void turnLeftRover(Location location) {
        switch (location.getDirection()) {
            case NORTH:
                location.setDirection(WEST);
                break;
            case EAST:
                location.setDirection(NORTH);
                break;
            case SOUTH:
                location.setDirection(EAST);
                break;
            case WEST:
                location.setDirection(SOUTH);
                break;
        }
    }

    private void moveRover(Location location) {
        switch (location.getDirection()) {
            case NORTH:
                location.setY(location.getY() + 1);
                break;
            case EAST:
                location.setX(location.getX() + 1);
                break;
            case SOUTH:
                location.setY(location.getY() - 1);
                break;
            case WEST:
                location.setX(location.getX() - 1);
                break;
        }
    }

    private void moveBackRover(Location location) {
        switch (location.getDirection()) {
            case NORTH:
                location.setY(location.getY() - 1);
                break;
            case EAST:
                location.setX(location.getX() - 1);
                break;
            case SOUTH:
                location.setY(location.getY() + 1);
                break;
            case WEST:
                location.setX(location.getX() + 1);
                break;
        }
    }
}