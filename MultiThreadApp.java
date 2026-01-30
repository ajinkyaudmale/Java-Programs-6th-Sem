// Question 19: Write a java program that implements a multi-thread application that has three threads.
// First thread generates random integer number after every one second, if the number is even;
// second thread computes the square of that number and print it.
// If the number is odd, the third thread computes the cube of that number and print it.

import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100);
                System.out.println("\nGenerated Number: " + number);

                if (number % 2 == 0) {
                    EvenThread evenThread = new EvenThread(number);
                    evenThread.start();
                } else {
                    OddThread oddThread = new OddThread(number);
                    oddThread.start();
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Generator thread interrupted");
        }
    }
}

class EvenThread extends Thread {
    private int number;

    public EvenThread(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Even Number - Square of " + number + " = " + square);
    }
}

class OddThread extends Thread {
    private int number;

    public OddThread(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Odd Number - Cube of " + number + " = " + cube);
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        System.out.println("Starting Multi-Thread Application...");
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}
