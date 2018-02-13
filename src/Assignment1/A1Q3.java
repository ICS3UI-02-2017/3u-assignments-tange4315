/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tange4315
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a new city for the robot
        City kw = new City();
        
        // put a new robot in kw
        RobotSE robot = new RobotSE(kw, 3, 0, Direction.EAST);
        
        // put a 'flag' in kw
        new Thing(kw, 3, 1);
        
        // build a 'mountain' in kw
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        
        // allow robot to pick up 'flag'
        robot.move();
        robot.pickThing();
        
        // allow robot to place 'flag' at the top of the 'mountain'
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.turnLeft();
        robot.move(2);
        robot.turnRight();
        robot.move();
        robot.putThing();
        
        // allow robot to move back down the 'mountain'
        robot.move();
        robot.turnRight();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move(2);
        robot.turnLeft();
        
    }
}
