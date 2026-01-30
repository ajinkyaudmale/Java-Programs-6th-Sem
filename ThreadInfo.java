// Question 15: Write a java program to display name and priority of a Thread.

public class ThreadInfo extends Thread {
    public ThreadInfo(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
        System.out.println("Thread ID: " + getId());
        System.out.println("Is Alive: " + isAlive());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Main Thread Information:");
        System.out.println("Name: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
        System.out.println("\nCreating custom threads...\n");

        ThreadInfo t1 = new ThreadInfo("High Priority Thread", Thread.MAX_PRIORITY);
        ThreadInfo t2 = new ThreadInfo("Normal Priority Thread", Thread.NORM_PRIORITY);
        ThreadInfo t3 = new ThreadInfo("Low Priority Thread", Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
