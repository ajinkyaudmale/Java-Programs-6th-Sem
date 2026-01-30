// Question 14: Write a Java program to create a thread for moving a ball inside a panel vertically.
// The ball should be created when the user clicks on the start button.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingBall extends JFrame implements ActionListener {
    private BallPanel ballPanel;
    private JButton startButton;

    public MovingBall() {
        setTitle("Moving Ball");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ballPanel = new BallPanel();
        add(ballPanel, BorderLayout.CENTER);

        startButton = new JButton("START");
        startButton.addActionListener(this);
        add(startButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        ballPanel.startBall();
        startButton.setEnabled(false);
    }

    public static void main(String[] args) {
        new MovingBall();
    }
}

class BallPanel extends JPanel implements Runnable {
    private int yPosition = 50;
    private int ballSize = 30;
    private Thread thread;
    private boolean running = false;

    public void startBall() {
        if (!running) {
            running = true;
            thread = new Thread(this);
            thread.start();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(getWidth() / 2 - ballSize / 2, yPosition, ballSize, ballSize);
    }

    public void run() {
        int direction = 1;
        try {
            while (running) {
                yPosition += direction * 5;

                if (yPosition >= getHeight() - ballSize || yPosition <= 0) {
                    direction *= -1;
                }

                repaint();
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
