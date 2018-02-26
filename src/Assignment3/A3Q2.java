/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author tange4315
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city for the robot
        City kw = new City();

        // create a robot to put in kw
        RobotSE robot = new RobotSE(kw, 0, 0, Direction.EAST);

        // put a counter for the things
        kw.showThingCounts(true);

        // put 10 things in kw
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);

        // make robot move things individually to the next intersection
        for (int moveToNextIntersection = 0; moveToNextIntersection < 10; moveToNextIntersection++) {
            robot.pickThing();
            robot.move();
            robot.putThing();
            robot.turnAround();
            robot.move();
            robot.turnAround();
        }

        // make robot move to final situation
        robot.move();

    }
}
