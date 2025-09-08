package com.afs.tdd;

public class MarsRover {
    private static final String NORTH = "N";
    private static final String EAST = "E";
    private static final String SOUTH = "S";
    private static final String WEST = "W";

    int x;
    int y;
    String direction;

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
            case "MB":
                moveBackRover();
                break;
        }
    }

    private void turnRightRover() {
        switch (direction) {
            case NORTH:
                direction = EAST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case SOUTH:
                direction = WEST;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }

    private void turnLeftRover() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case EAST:
                direction = NORTH;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case WEST:
                direction = SOUTH;
                break;
        }
    }

    private void moveRover() {
        switch (direction) {
            case NORTH:
                this.y++;
                break;
            case EAST:
                this.x++;
                break;
            case SOUTH:
                this.y--;
                break;
            case WEST:
                this.x--;
                break;
        }
    }

    private void moveBackRover() {
        switch (direction) {
            case NORTH:
                this.y--;
                break;
            case EAST:
                this.x--;
                break;
            case SOUTH:
                this.y++;
                break;
            case WEST:
                this.x++;
                break;
        }
    }
}