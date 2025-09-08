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

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 1, "N");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_1_0_E_when_input_0_0_E_M(){
        int x = 0;
        int y = 0;
        String direction = "E";
        String command = "M";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(1, 0, "E");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_0_ne1_S_when_input_0_0_S_M(){
        int x = 0;
        int y = 0;
        String direction = "S";
        String command = "M";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, -1, "S");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_ne1_0_W_when_input_0_0_W_M(){
        int x = 0;
        int y = 0;
        String direction = "W";
        String command = "M";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(-1, 0, "W");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_0_0_W_when_input_0_0_N_L(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String command = "L";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 0, "W");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_input_0_0_W_L(){
        int x = 0;
        int y = 0;
        String direction = "W";
        String command = "L";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 0, "S");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_input_0_0_S_L(){
        int x = 0;
        int y = 0;
        String direction = "S";
        String command = "L";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 0, "E");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_0_0_N_when_input_0_0_E_L(){
        int x = 0;
        int y = 0;
        String direction = "E";
        String command = "L";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 0, "N");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }


    @Test
    public void should_return_0_0_E_when_input_0_0_N_R(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String command = "R";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 0, "E");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }


    @Test
    public void should_return_0_0_N_when_input_0_0_W_R(){
        int x = 0;
        int y = 0;
        String direction = "W";
        String command = "R";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 0, "N");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }


    @Test
    public void should_return_0_0_W_when_input_0_0_S_R(){
        int x = 0;
        int y = 0;
        String direction = "S";
        String command = "R";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 0, "W");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_input_0_0_E_R(){
        int x = 0;
        int y = 0;
        String direction = "E";
        String command = "R";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 0, "S");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_0_ne1_N_when_input_0_0_N_MB(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String command = "MB";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, -1, "N");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_1_0_W_when_input_0_0_W_MB(){
        int x = 0;
        int y = 0;
        String direction = "W";
        String command = "MB";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(1, 0, "W");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_0_1_S_when_input_0_0_S_MB(){
        int x = 0;
        int y = 0;
        String direction = "S";
        String command = "MB";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(0, 1, "S");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_ne1_0_E_when_input_0_0_E_MB(){
        int x = 0;
        int y = 0;
        String direction = "E";
        String command = "MB";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommand(location, command);

        Location expectedLocation = new Location(-1, 0, "E");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }

    @Test
    public void should_return_2_2_E_when_input_0_0_N_MMRMM(){
        int x = 0;
        int y = 0;
        String direction = "N";
        String commands = "MMRMM";

        Location location = new Location(x,y,direction);
        MarsRover marsRover = new MarsRover();

        marsRover.executeCommands(location, commands);

        Location expectedLocation = new Location(2, 2, "E");

        assertEquals(location.getX() , expectedLocation.getX());
        assertEquals(location.getY() , expectedLocation.getY());
        assertEquals(location.getDirection() , expectedLocation.getDirection());
    }



}
