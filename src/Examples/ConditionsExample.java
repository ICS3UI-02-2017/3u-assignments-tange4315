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

/**
 *
 * @author tange4315
 */
public class ConditionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a city
        City kw = new City();
        
        // create a robot to put in kw
        RobotSE bob = new RobotSE(kw, 2, 1, Direction.EAST);
        
        // create a wall infront
        new Wall(kw, 2, 5, Direction.EAST);
        
        // place a few things in kw
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        
        // move while the front is clear
        while(bob.frontIsClear()) {
            // if front is clear, do this
            bob.move();
            
            // is there something to pick up?
            if(bob.canPickThing()) {
                bob.pickThing();
            }
        }
        
        // when front is not clear
        bob.turnRight();

        // do you have one thing in your backpack?
        if(bob.countThingsInBackpack() == 1 ) {
            bob.move();
        }else if(bob.countThingsInBackpack() == 2) {
            bob.move(2);
        }else{
            bob.turnAround();
        }
        
    }
    
}