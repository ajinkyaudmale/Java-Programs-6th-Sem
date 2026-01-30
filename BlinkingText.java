// Question 12: Write a Java program using Runnable interface to blink Text on the frame.

import javax.swing.*;
import java.awt.*;

public class BlinkingText extends JFrame implements Runnable {
    private JLabel label;
    private boolean isVisible = true;
    private Thread thread;

    public BlinkingText() {
        setTitle("Blinking Text");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("BLINKING TEXT");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.RED);
        add(label);

        thread = new Thread(this);
        thread.start();

        setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(500);
                isVisible = !isVisible;
                label.setVisible(isVisible);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new BlinkingText();
    }
}
