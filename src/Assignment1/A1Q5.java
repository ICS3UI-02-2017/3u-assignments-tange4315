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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a city for the robots
        City kw = new City();
        
        // create robots to put in kw
        RobotSE maria = new RobotSE(kw, 0, 1, Direction.WEST);
        RobotSE karel = new RobotSE(kw, 3, 3, Direction.EAST);
        
        // put labels on maria and karel
        maria.setLabel("M");
        karel.setLabel("K");
        
        // place 'expensive things' in kw
        new Thing(kw, 0, 0);
        new Thing(kw, 1, 0);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        
        // build a 'house' for karel
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        
        // allow maria to pick up the 'expensive things'
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        // allow karel to pick up the 'expensive things'
        karel.turnAround();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        
    }
}
