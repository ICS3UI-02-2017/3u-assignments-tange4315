package FinalProject;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
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
public class FlappyBird extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1030;
    static final int HEIGHT = 700;

    //Title of the window
    String title = "Flappy Bird";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));

    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // tube variables
    // tube speed
    int tubeSpeed = 10;
    // random tube height number
    int randomTubeHeight = 0;
    // x positions of tubes
    int tube1X = 50 + WIDTH;
    int tube2X = 270 + WIDTH;
    int tube3X = 490 + WIDTH;
    int tube4X = 710 + WIDTH;
    int tube5X = 930 + WIDTH;
    // tube top height values
    int tubeTopHeight1 = 240;
    int tubeTopHeight2 = 100;
    int tubeTopHeight3 = 270;
    int tubeTopHeight4 = 380;
    int tubeTopHeight5 = 200;
    // y positions of bottom tubes
    int tubeBottom1Y = tubeTopHeight1 + 150;
    int tubeBottom2Y = tubeTopHeight2 + 150;
    int tubeBottom3Y = tubeTopHeight3 + 150;
    int tubeBottom4Y = tubeTopHeight4 + 150;
    int tubeBottom5Y = tubeTopHeight5 + 150;
    // tube bottom height values
    int tubeBottomHeight1 = 630 - 150 - tubeTopHeight1;
    int tubeBottomHeight2 = 630 - 150 - tubeTopHeight2;
    int tubeBottomHeight3 = 630 - 150 - tubeTopHeight3;
    int tubeBottomHeight4 = 630 - 150 - tubeTopHeight4;
    int tubeBottomHeight5 = 630 - 150 - tubeTopHeight5;
    // create rectangles for the top tubes
    Rectangle tubeTop1 = new Rectangle(tube1X, 0, 70, tubeTopHeight1);
    Rectangle tubeTop2 = new Rectangle(tube2X, 0, 70, tubeTopHeight2);
    Rectangle tubeTop3 = new Rectangle(tube3X, 0, 70, tubeTopHeight3);
    Rectangle tubeTop4 = new Rectangle(tube4X, 0, 70, tubeTopHeight4);
    Rectangle tubeTop5 = new Rectangle(tube5X, 0, 70, tubeTopHeight5);
    // create rectangles for the bottom tubes
    Rectangle tubeBottom1 = new Rectangle(tube1X, tubeBottom1Y, 70, tubeBottomHeight1);
    Rectangle tubeBottom2 = new Rectangle(tube2X, tubeBottom2Y, 70, tubeBottomHeight2);
    Rectangle tubeBottom3 = new Rectangle(tube3X, tubeBottom3Y, 70, tubeBottomHeight3);
    Rectangle tubeBottom4 = new Rectangle(tube4X, tubeBottom4Y, 70, tubeBottomHeight4);
    Rectangle tubeBottom5 = new Rectangle(tube5X, tubeBottom5Y, 70, tubeBottomHeight5);

    // bird variables
    // x position of the bird
    int birdX = 65;
    // y position of the bird
    int birdY = 295;
    // create a rectangle for the bird
    Rectangle bird = new Rectangle(birdX, birdY, 40, 40);

    // create a rectangle for the grass
    Rectangle grass = new Rectangle(0, 630, WIDTH, 20);

    // score variables
    // score
    int score = 0;
    // create a font for the score
    Font scoreFont = new Font("arial", Font.BOLD, 36);

    // colour variables
    // create a background colour
    Color background = new Color(113, 198, 208);
    // create colours for the ground
    Color ground = new Color(222, 217, 149);
    Color grassColor = new Color(146, 223, 78);
    // create a bird colour
    Color birdColor = new Color(199, 179, 38);
    // create a tube colour
    Color tube = new Color(116, 193, 42);

    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public FlappyBird() {
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
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // set background colour
        g.setColor(background);
        // draw background
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // set ground colour
        g.setColor(ground);
        // draw ground
        g.fillRect(0, HEIGHT - 50, WIDTH, 50);
        // set grass colour
        g.setColor(grassColor);
        // draw grass
        g.fillRect(grass.x, grass.y, WIDTH, grass.height);

        // set tube colour
        g.setColor(tube);
        // draw top tubes
        g.fillRect(tube1X, tubeTop1.y, tubeTop1.width, tubeTopHeight1);
        g.fillRect(tube2X, tubeTop2.y, tubeTop2.width, tubeTopHeight2);
        g.fillRect(tube3X, tubeTop3.y, tubeTop3.width, tubeTopHeight3);
        g.fillRect(tube4X, tubeTop4.y, tubeTop4.width, tubeTopHeight4);
        g.fillRect(tube5X, tubeTop5.y, tubeTop5.width, tubeTopHeight5);
        // draw bottom tubes
        g.fillRect(tube1X, tubeBottom1Y, tubeBottom1.width, tubeBottomHeight1);
        g.fillRect(tube2X, tubeBottom2Y, tubeBottom2.width, tubeBottomHeight2);
        g.fillRect(tube3X, tubeBottom3Y, tubeBottom3.width, tubeBottomHeight3);
        g.fillRect(tube4X, tubeBottom4Y, tubeBottom4.width, tubeBottomHeight4);
        g.fillRect(tube5X, tubeBottom5Y, tubeBottom5.width, tubeBottomHeight5);

        // set bird colour
        g.setColor(birdColor);
        // draw bird
        g.fillRect(birdX, birdY, bird.width, bird.height);

        // set score colour
        g.setColor(Color.BLACK);
        // set score font
        g.setFont(scoreFont);
        // draw the score
        g.drawString("Score: " + score, 15, 689);
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        generateTubes();
        moveTubes();
        birdFall();
        birdJump();
        checkForCollision();
        updateScore();
    }

    private void generateTubes() {
        // make tubes reappear on screen in different positions
        if (tube1X + 70 < 0) {
            // calculate random height for top tube
            randomTubeHeight = (int) (Math.random() * (380 - 100 + 1)) + 100;
            // set top tube height
            tubeTopHeight1 = randomTubeHeight;
            // calculate bottom tube height
            tubeBottomHeight1 = 630 - 150 - tubeTopHeight1;
            // calculate bottom tube y position
            tubeBottom1Y = tubeTopHeight1 + 150;
            // make tube reappear on other side of screen
            tube1X = WIDTH;
        } else if (tube2X + 70 < 0) {
            // calculate random height for top tube
            randomTubeHeight = (int) (Math.random() * (380 - 100 + 1)) + 100;
            // set top tube height
            tubeTopHeight2 = randomTubeHeight;
            // calculate bottom tube height
            tubeBottomHeight2 = 630 - 150 - tubeTopHeight2;
            // calculate bottom tube y position
            tubeBottom2Y = tubeTopHeight2 + 150;
            // make tube reappear on other side of screen
            tube2X = WIDTH;
        } else if (tube3X + 70 < 0) {
            // calculate random height for top tube
            randomTubeHeight = (int) (Math.random() * (380 - 100 + 1)) + 100;
            // set top tube height
            tubeTopHeight3 = randomTubeHeight;
            // calculate bottom tube height
            tubeBottomHeight3 = 630 - 150 - tubeTopHeight3;
            // calculate bottom tube y position
            tubeBottom3Y = tubeTopHeight3 + 150;
            // make tube reappear on other side of screen
            tube3X = WIDTH;
        } else if (tube4X + 70 < 0) {
            // calculate random height for top tube
            randomTubeHeight = (int) (Math.random() * (380 - 100 + 1)) + 100;
            // set top tube height
            tubeTopHeight4 = randomTubeHeight;
            // calculate bottom tube height
            tubeBottomHeight4 = 630 - 150 - tubeTopHeight4;
            // calculate bottom tube y position
            tubeBottom4Y = tubeTopHeight4 + 150;
            // make tube reappear on other side of screen
            tube4X = WIDTH;
        } else if (tube5X + 70 < 0) {
            // calculate random height for top tube
            randomTubeHeight = (int) (Math.random() * (380 - 100 + 1)) + 100;
            // set top tube height
            tubeTopHeight5 = randomTubeHeight;
            // calculate bottom tube height
            tubeBottomHeight5 = 630 - 150 - tubeTopHeight5;
            // calculate bottom tube y position
            tubeBottom5Y = tubeTopHeight5 + 150;
            // make tube reappear on other side of screen
            tube5X = WIDTH;
        }
    }

    private void birdFall() {
    }

    private void moveTubes() {
        // make tubes constantly move on screen
        tube1X -= tubeSpeed;
        tube2X -= tubeSpeed;
        tube3X -= tubeSpeed;
        tube4X -= tubeSpeed;
        tube5X -= tubeSpeed;
    }

    private void birdJump() {
    }

    private void checkForCollision() {
    }

    private void updateScore() {
        // increase score if bird has gone in between a set of tubes
        if (birdX == tube1X && birdY > tubeTopHeight1 && birdY < tubeBottom1Y - 40) {
            score++;
        } else if (birdX == tube2X && birdY > tubeTopHeight2 && birdY < tubeBottom2Y - 40) {
            score++;
        } else if (birdX == tube3X && birdY > tubeTopHeight3 && birdY < tubeBottom3Y - 40) {
            score++;
        } else if (birdX == tube4X && birdY > tubeTopHeight4 && birdY < tubeBottom4Y - 40) {
            score++;
        } else if (birdX == tube5X && birdY > tubeTopHeight5 && birdY < tubeBottom5Y - 40) {
            score++;
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
        FlappyBird game = new FlappyBird();
    }
}
