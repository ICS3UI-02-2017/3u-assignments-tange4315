/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author tange4315
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city for the robot
        City kw = new City();

        // create a robot to put in kw
        RobotSE robot = new RobotSE(kw, 1, 1, Direction.EAST);

        // create things to put in kw
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        // make robot pick up 7 things
        robot.move();

        while (robot.canPickThing()) {
            robot.pickThing();
            robot.move();
            // make robot move on without picking up the rest of the things
            if (robot.countThingsInBackpack() >= 7) {
                robot.move(3);
            }

        }

    }
}
