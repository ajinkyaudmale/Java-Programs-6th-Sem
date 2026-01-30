// Question 16: Write a Multithreading program in java to display the numbers between 1 to 100
// continuously in a TextField by clicking on button. (Use Runnable Interface)

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberDisplay extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton startButton;
    private NumberThread numberThread;

    public NumberDisplay() {
        setTitle("Number Display");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        add(textField);

        startButton = new JButton("START");
        startButton.addActionListener(this);
        add(startButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (numberThread == null || !numberThread.isRunning()) {
            numberThread = new NumberThread(textField);
            Thread t = new Thread(numberThread);
            t.start();
            startButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new NumberDisplay();
    }
}

class NumberThread implements Runnable {
    private JTextField textField;
    private boolean running = false;

    public NumberThread(JTextField textField) {
        this.textField = textField;
    }

    public boolean isRunning() {
        return running;
    }

    public void run() {
        running = true;
        try {
            for (int i = 1; i <= 100; i++) {
                textField.setText(String.valueOf(i));
                Thread.sleep(100);
            }
            textField.setText("Completed!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        running = false;
    }
}
