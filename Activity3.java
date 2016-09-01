/**
 * to begin, this program moves northwest until it hits the northwestern most point on the grid. It then moves
 * south until it reaches the lowest point, counting all spaces, then east counting all. It then simply multiplies
 * the two values.
 * This code will not work for #4, but in order to do that I would be making a new 2d arraylist essentialy mapping out the grid.
 * The longest it would take would be if the robot started in the bottom right corner.
 * @author Michael McGloin
 * @version 08/30
 */
public class Activity3 {
    
    /**
     * Activity 3: Rectangular
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Robot robot;
        robot = new Robot(5, 3, 2, 1);
        while(robot.check('n') == true)//goes north until it cannot any more
        {
        	robot.move('n');
        }
        while(robot.check('w') == true)//goes west until it cannot any more
        {
        	robot.move('w');
        }
        int y = 1;
        int x = 1;
        while(robot.check('s') == true)//goes south, counting all squares
        {
        	y++;
        	robot.move('s');
        }
        while(robot.check('e') == true)//goes east, counting all squares
        {
        	x++;
        	robot.move('e');
        }
        robot.say("the number of rooms is " + (x * y));
    }
}