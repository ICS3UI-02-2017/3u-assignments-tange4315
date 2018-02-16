/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author tange4315
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a city for the robot
        City kw = new City();
        
        // create a robot to put in kw
        RobotSE karel = new RobotSE(kw, 4, 5, Direction.EAST);

        // make karel move to avenue 0
        while(karel.getAvenue() != 0) {
            if(!karel.isFacingWest()){
                karel.turnLeft();
            }else{
                karel.move();
        }
        
        // make karel move to street 0
        while(karel.getStreet() != 0) {
            if(!karel.isFacingNorth()) {
                karel.turnLeft();
            }else{
                karel.move();
            }
            }
    }
        
    }
}
