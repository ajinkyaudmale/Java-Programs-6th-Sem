// Question 20: Write a java program to define a thread for printing text on output screen
// for 'n' number of times. Create 3 threads and run them.
// Pass the text 'n' parameters to the thread constructor.
// Example: First thread prints "COVID19" 10 times,
// Second thread prints "LOCKDOWN2020" 20 times,
// Third thread prints "VACCINATED2021" 30 times

class TextPrinter extends Thread {
    private String text;
    private int count;

    // Constructor to initialize text and count
    public TextPrinter(String text, int count) {
        this.text = text;
        this.count = count;
    }

    // Override run method - executed when thread starts
    public void run() {
        System.out.println("\n" + Thread.currentThread().getName() +
                " started printing \"" + text + "\"");
        System.out.println("=".repeat(50));

        for (int i = 1; i <= count; i++) {
            System.out.println(Thread.currentThread().getName() +
                    ": " + text + " - " + i);

            try {
                // Small delay to make output visible
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("=".repeat(50));
        System.out.println(Thread.currentThread().getName() +
                " completed printing \"" + text + "\"");
        System.out.println();
    }
}

public class TextPrinterMain {
    public static void main(String[] args) {
        System.out.println("******************************************************");
        System.out.println("    MULTITHREADING PROGRAM - TEXT PRINTER");
        System.out.println("******************************************************");

        // Create three threads with different text and count parameters
        TextPrinter thread1 = new TextPrinter("COVID19", 10);
        TextPrinter thread2 = new TextPrinter("LOCKDOWN2020", 20);
        TextPrinter thread3 = new TextPrinter("VACCINATED2021", 30);

        // Set thread names for better identification
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread3.setName("Thread-3");

        // Display thread information
        System.out.println("\nThread Information:");
        System.out.println("-".repeat(50));
        System.out.println(thread1.getName() + " will print \"COVID19\" 10 times");
        System.out.println(thread2.getName() + " will print \"LOCKDOWN2020\" 20 times");
        System.out.println(thread3.getName() + " will print \"VACCINATED2021\" 30 times");

        // Start all three threads
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Starting all threads...");
        System.out.println("=".repeat(50));

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("All threads have completed execution!");
        System.out.println("=".repeat(50));
    }
}
