/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author tange4315
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a city for the robots
        City kw = new City();
        
        // create robots to put in kw
        RobotSE karel = new RobotSE(kw, 0, 0, Direction.SOUTH);
        RobotSE bob = new RobotSE(kw, 0, 1, Direction.SOUTH);
        
        // build a wall in kw
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        
        // move the karel and bob to the final destination
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        karel.move(2);
        karel.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        karel.move();
        
    }
}
