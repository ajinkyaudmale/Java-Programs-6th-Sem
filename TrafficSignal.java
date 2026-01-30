// Question 13: Write a java program to simulate traffic signal using threads.

import javax.swing.*;
import java.awt.*;

public class TrafficSignal extends JFrame implements Runnable {
    private JPanel redPanel, yellowPanel, greenPanel;
    private Thread thread;

    public TrafficSignal() {
        setTitle("Traffic Signal Simulation");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        redPanel = new JPanel();
        redPanel.setBackground(Color.GRAY);
        add(redPanel);

        yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.GRAY);
        add(yellowPanel);

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.GRAY);
        add(greenPanel);

        thread = new Thread(this);
        thread.start();

        setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                redPanel.setBackground(Color.RED);
                yellowPanel.setBackground(Color.GRAY);
                greenPanel.setBackground(Color.GRAY);
                System.out.println("RED - STOP");
                Thread.sleep(3000);

                redPanel.setBackground(Color.GRAY);
                yellowPanel.setBackground(Color.YELLOW);
                greenPanel.setBackground(Color.GRAY);
                System.out.println("YELLOW - READY");
                Thread.sleep(1000);

                redPanel.setBackground(Color.GRAY);
                yellowPanel.setBackground(Color.GRAY);
                greenPanel.setBackground(Color.GREEN);
                System.out.println("GREEN - GO");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new TrafficSignal();
    }
}
