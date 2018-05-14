package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author tange4315
 */
public class A8Q1 extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Face";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an appropriate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    // make colours
    Color skin = new Color(252, 213, 169);
    Color purple = new Color(122, 13, 155);
    Color green = new Color(25, 168, 10);
    Color background = new Color(175, 25, 12);
    // Y coordinates for the right tooth
    int rightToothY1 = 395;
    int rightToothY2 = 395;
    int rightToothY3 = 420;
    // X coordinates for the hat
    int hatRectX = 315;
    int hatOvalX = 245;
    int stripeRectX = 315;
    // make hat move from side to side
    boolean hatMoveRight = true;

    // GAME VARIABLES END HERE
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // make background
        g.setColor(background);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // make skin
        g.setColor(skin);
        g.fillOval(250, 210, 280, 300);

        // make a hat
        g.setColor(purple);
        g.fillRect(hatRectX, 60, 150, 200);
        g.fillOval(hatOvalX, 215, 300, 50);
        // put a stripe across the hat
        g.setColor(green);
        g.fillRect(stripeRectX, 180, 150, 40);

        // make eyes
        g.setColor(Color.BLACK);
        // left eye
        g.fillOval(300, 310, 20, 20);
        // right eye
        g.fillOval(450, 310, 20, 20);

        // make mouth
        g.setColor(Color.BLACK);
        g.fillArc(310, 320, 150, 150, 180, 180);

        // make teeth
        g.setColor(Color.WHITE);
        // left tooth
        int[] leftToothX = {355, 375, 365};
        int[] leftToothY = {395, 395, 420};
        g.fillPolygon(leftToothX, leftToothY, 3);
        // right tooth
        int[] rightToothX = {395, 415, 405};
        int[] rightToothY = {rightToothY1, rightToothY2, rightToothY3};
        g.fillPolygon(rightToothX, rightToothY, 3);
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {

        // make right tooth break off
        rightToothY1 = rightToothY1 + 2;
        rightToothY2 = rightToothY2 + 2;
        rightToothY3 = rightToothY3 + 2;

        // make hat move from side to side
        // determine which direction the hat should move
        if (hatOvalX <= 295) {
            hatMoveRight = true;
        } else if (hatOvalX >= 195) {
            hatMoveRight = false;
        }
        // make hat move to the right
        if (hatMoveRight == true) {
            hatRectX = hatRectX + 2;
            hatOvalX = hatOvalX + 2;
            stripeRectX = stripeRectX + 2;
            // make hat move to the left
        } else {
            hatRectX = hatRectX - 2;
            hatOvalX = hatOvalX - 2;
            stripeRectX = stripeRectX - 2;
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8Q1 game = new A8Q1();
    }
}