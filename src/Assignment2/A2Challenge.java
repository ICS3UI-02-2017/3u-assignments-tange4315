/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tange4315
 */
public class A2Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city for the robots
        City kw = new City();

        // create robots to put in kw
        RobotSE karel = new RobotSE(kw, 0, 2, Direction.SOUTH);
        RobotSE tina = new RobotSE(kw, 0, 2, Direction.SOUTH);

        // create the road
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 4, 0, Direction.WEST);
        new Wall(kw, 5, 0, Direction.WEST);
        new Wall(kw, 6, 0, Direction.WEST);
        new Wall(kw, 7, 0, Direction.WEST);
        new Wall(kw, 8, 0, Direction.WEST);
        new Wall(kw, 9, 0, Direction.WEST);
        new Wall(kw, 0, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 7, 1, Direction.EAST);
        new Wall(kw, 8, 1, Direction.EAST);
        new Wall(kw, 9, 1, Direction.EAST);

        // put snow on the road
        new Thing(kw, 0, 1);
        new Thing(kw, 1, 0);
        new Thing(kw, 2, 0);
        new Thing(kw, 3, 0);
        new Thing(kw, 4, 0);
        new Thing(kw, 3, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 7, 0);
        new Thing(kw, 7, 1);
        new Thing(kw, 8, 1);
        new Thing(kw, 9, 1);
        new Thing(kw, 9, 0);

        // create the sidewalks and the driveways
        new Wall(kw, 0, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 4, 3, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 7, 3, Direction.NORTH);
        new Wall(kw, 7, 4, Direction.NORTH);
        new Wall(kw, 7, 5, Direction.NORTH);
        new Wall(kw, 7, 6, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 8, 3, Direction.SOUTH);
        new Wall(kw, 9, 2, Direction.EAST);
        new Wall(kw, 9, 2, Direction.SOUTH);

        // put snow on the sidewalk and the driveways
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 2, 6);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 4);
        new Thing(kw, 7, 2);
        new Thing(kw, 7, 3);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 4);
        new Thing(kw, 8, 6);
        new Thing(kw, 7, 7);

        // put snow in kw
        new Thing(kw, 0, 3);
        new Thing(kw, 0, 4);
        new Thing(kw, 0, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 6);
        new Thing(kw, 4, 6);
        new Thing(kw, 4, 7);
        new Thing(kw, 5, 7);
        new Thing(kw, 6, 6);
        new Thing(kw, 5, 5);
        new Thing(kw, 6, 4);
        new Thing(kw, 9, 3);
        new Thing(kw, 9, 4);
        new Thing(kw, 9, 6);

        // make karel move the snow from the driveway to the sidewalk
        while (karel.frontIsClear()) {
            karel.turnLeft();

            // if there is no driveway, karel will move on
            if (!karel.frontIsClear()) {
                karel.turnRight();
                karel.move();
                karel.turnLeft();
            }

            while (karel.frontIsClear()) {
                // if there is snow, karel will pick up the snow
                if (karel.canPickThing()) {
                    karel.pickThing();
                    karel.move();
                } else {
                    karel.move();
                }
                // if karel has reached the end of the driveway and can still pick up snow, he will pick up snow
                if (!karel.frontIsClear()) {
                    if (karel.canPickThing()) {
                        karel.pickThing();
                    }
                }
            }
            // once karel has reached the end of the driveway, he will turn around
            karel.turnAround();
            // karel will return to the sidewalk
            while (karel.frontIsClear()) {
                karel.move();
            }
            // karel will leave his snow on the sidewalk and find another driveway to shovel
            karel.turnLeft();
            karel.putAllThings();
            karel.move();
        }

        // make tina move the snow from the sidewalk to the end of the sidewalk
        while (tina.frontIsClear()) {
            // if tina can't pick snow up from the sidewalk, tina moves forward
            if (!tina.canPickThing()) {
                tina.move();
            } else {
                tina.pickAllThings();
                tina.move();
            }
            // when tina has reached the end of the sidewalk, tina will put all snow there
            if (!tina.frontIsClear()) {
                tina.putAllThings();
            }
        }

    }
}