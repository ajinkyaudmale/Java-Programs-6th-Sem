import java.util.*;

public class LinkedListIntegerOps {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of initial elements: ");
        int n = sc.nextInt();

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        System.out.println("\nOriginal List: " + list);
        System.out.println("Size: " + list.size());

        System.out.print("\nEnter integer to add at first position: ");
        int newElement = sc.nextInt();
        list.addFirst(newElement);
        System.out.println("After adding at first: " + list);
        System.out.println("Size: " + list.size());

        if (!list.isEmpty()) {
            int removed = list.removeLast();
            System.out.println("\nRemoved last element: " + removed);
            System.out.println("After removing last: " + list);
            System.out.println("Final Size: " + list.size());
        }

        sc.close();
    }
}
