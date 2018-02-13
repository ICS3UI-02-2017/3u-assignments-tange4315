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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // create a city for the robot
        City kw = new City();
        
        // put a robot in kw
        RobotSE bob = new RobotSE(kw, 0, 2, Direction.WEST);
        
        // create the walls in kw
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        
        // move bob around the walls in kw
        bob.move(2);
        bob.turnLeft();
        bob.move(3);
        bob.turnLeft();
        bob.move(3);
        bob.turnLeft();
        bob.move(3);
        bob.turnLeft();
        bob.move();
        
    }
}
