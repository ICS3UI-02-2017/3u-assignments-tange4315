/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the Robots
 * @author tange4315
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a city for the robot
        City kw = new City();
        
        // put a robot in KW
        RobotSE karel = new RobotSE(kw, 2, 3, Direction.EAST);
        
        // create a wall
        new Wall(kw, 2, 5, Direction.WEST);
        
        // create a thing
        new Thing (kw, 2, 4);
       
        // move the robot forward one space
        karel.move();
        
        // move the robot n number of spaces
        // karel.move(2);
        
        // turn the robot to the left
        karel.turnLeft();
        
        // put the letter K on karel
        karel.setLabel("K");
        
        // set the colour of the robot
        karel.setColor(Color.blue);
        
        //pick up the thing
        karel.pickThing();
        
        // move once more
        karel.move();
        
        karel.countThingsInBackpack();
        karel.putThing();
        karel.move();
        
    }
}