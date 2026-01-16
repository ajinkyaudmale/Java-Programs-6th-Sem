import java.util.*;

public class ColorTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of colors: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter colors:");
        for (int i = 0; i < n; i++) {
            System.out.print("Color " + (i + 1) + ": ");
            colors.add(sc.nextLine());
        }

        System.out.println("\nColors in ascending order:");
        for (String color : colors) {
            System.out.println(color);
        }

        sc.close();
    }
}
