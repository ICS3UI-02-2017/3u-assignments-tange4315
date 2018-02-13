/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tange4315
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a new city for the robot
        City kw = new City();
        
        // put a new robot in kw
        RobotSE karel = new RobotSE(kw, 1, 2, Direction.SOUTH);
        
        // build a house for karel in kw
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        
        // put a newspaper outside of karel's house
        new Thing(kw, 2, 2);
        
        // move karel to pick up newspaper
        karel.turnRight();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        
        // move karel to go back to original position
        karel.turnAround();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.turnRight();
        
    }
}
