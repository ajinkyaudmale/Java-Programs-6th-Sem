import java.util.*;

public class StudentNamesIterator {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No student names provided!");
            System.out.println("Usage: java StudentNamesIterator name1 name2 name3 ...");
            return;
        }

        ArrayList<String> students = new ArrayList<>();

        System.out.println("Adding " + args.length + " student names...\n");
        for (String name : args) {
            students.add(name);
        }

        System.out.println("=== Using Iterator (Forward) ===");
        Iterator<String> iterator = students.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            System.out.println(count + ". " + iterator.next());
            count++;
        }

        System.out.println("\n=== Using ListIterator (Forward) ===");
        ListIterator<String> listIterator = students.listIterator();
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String name = listIterator.next();
            System.out.println("Index " + index + ": " + name);
        }

        System.out.println("\n=== Using ListIterator (Backward) ===");
        while (listIterator.hasPrevious()) {
            int index = listIterator.previousIndex();
            String name = listIterator.previous();
            System.out.println("Index " + index + ": " + name);
        }

        System.out.println("\nTotal students: " + students.size());
    }
}
