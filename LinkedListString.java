import java.util.*;

public class LinkedListString {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of initial elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            System.out.print("Element " + (i+1) + ": ");
            list.add(sc.nextLine());
        }
        
        System.out.println("\nOriginal List: " + list);
        
        System.out.print("\nEnter element to add at end: ");
        String newElement = sc.nextLine();
        list.addLast(newElement);
        System.out.println("After adding at end: " + list);
        
        if(!list.isEmpty()) {
            String removed = list.removeFirst();
            System.out.println("\nRemoved first element: " + removed);
            System.out.println("After removing first: " + list);
        }
        
        System.out.println("\nList in reverse order:");
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        sc.close();
    }
}
