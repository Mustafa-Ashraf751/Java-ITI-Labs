package task3;

import javax.swing.*;
import java.awt.*;

public class BouncingBallApp extends JFrame {

    private BallPanel ballPanel;

    public BouncingBallApp() {
        this.setTitle("Bouncing Ball");
        this.setSize(800, 600);

        ballPanel = new BallPanel();
        this.add(ballPanel);

        this.setVisible(true);

        // Start the animation
        Thread animationThread = new Thread(ballPanel);
        animationThread.start();
    }

}

class BallPanel extends JPanel implements Runnable {
    private int x = 100;
    private int y = 100;
    private int diameter = 30;
    private int xSpeed = 5;
    private int ySpeed = 5;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillOval(x, y, diameter, diameter);
    }

    @Override
    public void run() {
        while (true) {

            x += xSpeed;
            y += ySpeed;


            if (x <= 0 || x + diameter >= getWidth()) {
                xSpeed = -xSpeed;
            }
            if (y <= 0 || y + diameter >= getHeight()) {
                ySpeed = -ySpeed;
            }


            repaint();


            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
