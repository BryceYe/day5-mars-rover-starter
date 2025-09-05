package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_0_1_N_when_input_0_0_N_M(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String comment = "M";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeComment(comment);

        MarsRover expectation = new MarsRover(0, 1, "N");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_1_0_E_when_input_0_0_E_M(){
        int x = 0;
        int y = 0;
        String direction = "E";
        String comment = "M";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeComment(comment);

        MarsRover expectation = new MarsRover(1, 0, "E");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_ne1_S_when_input_0_0_S_M(){
        int x = 0;
        int y = 0;
        String direction = "S";
        String comment = "M";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeComment(comment);

        MarsRover expectation = new MarsRover(0, -1, "S");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_ne1_0_W_when_input_0_0_W_M(){
        int x = 0;
        int y = 0;
        String direction = "W";
        String comment = "M";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeComment(comment);

        MarsRover expectation = new MarsRover(-1, 0, "W");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_0_W_when_input_0_0_N_L(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String comment = "L";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeComment(comment);

        MarsRover expectation = new MarsRover(0, 0, "W");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_0_S_when_input_0_0_W_L(){
        int x = 0;
        int y = 0;
        String direction = "W";
        String comment = "L";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeComment(comment);

        MarsRover expectation = new MarsRover(0, 0, "S");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_0_E_when_input_0_0_S_L(){
        int x = 0;
        int y = 0;
        String direction = "S";
        String comment = "L";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeComment(comment);

        MarsRover expectation = new MarsRover(0, 0, "E");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_0_N_when_input_0_0_N_E(){
        int x = 0;
        int y = 0;
        String direction = "E";
        String comment = "L";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeComment(comment);

        MarsRover expectation = new MarsRover(0, 0, "N");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }



}
