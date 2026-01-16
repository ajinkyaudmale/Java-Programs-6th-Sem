import java.util.*;

public class LinkedListNegative {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("\nAll integers: " + numbers);

        System.out.println("\nNegative integers:");
        boolean found = false;
        for (Integer num : numbers) {
            if (num < 0) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No negative integers found!");
        }

        sc.close();
    }
}
