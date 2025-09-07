package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_0_1_N_when_input_0_0_N_M(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String command = "M";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

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
        String command = "M";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

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
        String command = "M";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

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
        String command = "M";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

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
        String command = "L";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

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
        String command = "L";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

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
        String command = "L";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        MarsRover expectation = new MarsRover(0, 0, "E");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_0_N_when_input_0_0_E_L(){
        int x = 0;
        int y = 0;
        String direction = "E";
        String command = "L";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        MarsRover expectation = new MarsRover(0, 0, "N");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }


    @Test
    public void should_return_0_0_E_when_input_0_0_N_R(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String command = "R";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        MarsRover expectation = new MarsRover(0, 0, "E");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }


    @Test
    public void should_return_0_0_N_when_input_0_0_W_R(){
        int x = 0;
        int y = 0;
        String direction = "W";
        String command = "R";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        MarsRover expectation = new MarsRover(0, 0, "N");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }


    @Test
    public void should_return_0_0_W_when_input_0_0_S_R(){
        int x = 0;
        int y = 0;
        String direction = "S";
        String command = "R";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        MarsRover expectation = new MarsRover(0, 0, "W");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_0_S_when_input_0_0_E_R(){
        int x = 0;
        int y = 0;
        String direction = "E";
        String command = "R";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        MarsRover expectation = new MarsRover(0, 0, "S");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_0_N_when_input_0_0_N_MB(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String command = "MB";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        MarsRover expectation = new MarsRover(0, -1, "N");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }

    @Test
    public void should_return_0_0_W_when_input_0_0_W_MB(){
        int x = 0;
        int y = 0;
        String direction = "W";
        String command = "MB";

        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        MarsRover expectation = new MarsRover(1, 0, "W");

        assertEquals(marsRover.x , expectation.x);
        assertEquals(marsRover.y , expectation.y);
        assertEquals(marsRover.direction , expectation.direction);
    }




}
