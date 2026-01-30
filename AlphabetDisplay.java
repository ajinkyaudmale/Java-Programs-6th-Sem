// Question 11: Write a Java program to display all the alphabets between 'A' to 'Z' after every 2 seconds.

public class AlphabetDisplay extends Thread {
    public void run() {
        try {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println(ch);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        AlphabetDisplay thread = new AlphabetDisplay();
        thread.start();
        System.out.println("Displaying alphabets A to Z with 2 seconds delay...");
    }
}
