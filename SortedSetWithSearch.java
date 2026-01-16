import java.util.*;

public class SortedSetWithSearch {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("\nIntegers in sorted order (duplicates removed):");
        System.out.println(numbers);

        System.out.print("\nEnter number to search: ");
        int search = sc.nextInt();

        if (numbers.contains(search)) {
            System.out.println(search + " is present in the collection");
        } else {
            System.out.println(search + " is not present in the collection");
        }

        sc.close();
    }
}
