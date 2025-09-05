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

    public void executeComment(String comment) {
        if(comment.equals("M")){
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


}
