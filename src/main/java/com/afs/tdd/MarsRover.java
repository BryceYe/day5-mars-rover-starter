package com.afs.tdd;

public class MarsRover {
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
        }
    }

    private void turnRightRover() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    private void turnLeftRover() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "E":
                direction = "N";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    private void moveRover() {
        switch (direction) {
            case "N":
                this.y++;
                break;
            case "E":
                this.x++;
                break;
            case "S":
                this.y--;
                break;
            case "W":
                this.x--;
                break;
        }
    }


}
