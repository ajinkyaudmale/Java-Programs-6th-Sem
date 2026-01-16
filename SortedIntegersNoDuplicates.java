import java.util.*;

public class SortedIntegersNoDuplicates {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            int num = sc.nextInt();
            if (!numbers.add(num)) {
                System.out.println("  (Duplicate! Not added)");
            }
        }

        System.out.println("\nIntegers in sorted order:");
        System.out.println(numbers);

        System.out.println("\nDetailed display:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}
