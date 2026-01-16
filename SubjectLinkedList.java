import java.util.*;

public class SubjectLinkedList {
    public static void main(String[] args) {
        LinkedList<String> subjects = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter subject names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects.add(sc.nextLine());
        }

        System.out.println("\nSubjects using Iterator:");
        Iterator<String> iterator = subjects.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            System.out.println(count + ". " + iterator.next());
            count++;
        }

        sc.close();
    }
}
