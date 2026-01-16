# JAVA COLLECTION PROGRAMS
## Complete Set of 10 Programs with Sample Outputs

---

## Program 1: HashSet - Friends Names in Ascending Order

**Description:** Read 'N' names of friends, store in HashSet and display in ascending order.

**Code:**
```java
import java.util.*;

public class FriendsHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> friends = new HashSet<>();
        
        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter names of friends:");
        for(int i = 0; i < n; i++) {
            System.out.print("Friend " + (i+1) + ": ");
            friends.add(sc.nextLine());
        }
        
        ArrayList<String> sortedList = new ArrayList<>(friends);
        Collections.sort(sortedList);
        
        System.out.println("\nFriends names in ascending order:");
        for(String name : sortedList) {
            System.out.println(name);
        }
        sc.close();
    }
}
```

**Sample Output:**
```
Enter number of friends: 5
Enter names of friends:
Friend 1: Alice
Friend 2: David
Friend 3: Bob
Friend 4: Charlie
Friend 5: Bob

Friends names in ascending order:
Alice
Bob
Charlie
David
```

---

## Program 2: LinkedList String Operations

**Description:** Create LinkedList of String objects and perform: (i) Add at end (ii) Delete first (iii) Display in reverse

**Code:**
```java
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
```

**Sample Output:**
```
Enter number of initial elements: 4
Enter elements:
Element 1: Apple
Element 2: Banana
Element 3: Cherry
Element 4: Date

Original List: [Apple, Banana, Cherry, Date]

Enter element to add at end: Elderberry
After adding at end: [Apple, Banana, Cherry, Date, Elderberry]

Removed first element: Apple
After removing first: [Banana, Cherry, Date, Elderberry]

List in reverse order:
Elderberry
Date
Cherry
Banana
```

---

## Program 3: City and STD Code HashMap

**Description:** Store city names and STD codes. Perform: (i) Add new city (ii) Remove city (iii) Search city

**Code:**
```java
import java.util.*;

public class CitySTDCode {
    public static void main(String[] args) {
        HashMap<String, String> cityMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        cityMap.put("Mumbai", "022");
        cityMap.put("Delhi", "011");
        cityMap.put("Pune", "020");
        
        while(true) {
            System.out.println("\n=== City STD Code Manager ===");
            System.out.println("1. Add new city");
            System.out.println("2. Remove city");
            System.out.println("3. Search city");
            System.out.println("4. Display all cities");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = sc.nextLine();
                    if(cityMap.containsKey(city)) {
                        System.out.println("City already exists!");
                    } else {
                        System.out.print("Enter STD code: ");
                        String code = sc.nextLine();
                        cityMap.put(city, code);
                        System.out.println("City added successfully!");
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter city name to remove: ");
                    String removeCity = sc.nextLine();
                    if(cityMap.remove(removeCity) != null) {
                        System.out.println("City removed successfully!");
                    } else {
                        System.out.println("City not found!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter city name to search: ");
                    String searchCity = sc.nextLine();
                    String code = cityMap.get(searchCity);
                    if(code != null) {
                        System.out.println("STD Code for " + searchCity + ": " + code);
                    } else {
                        System.out.println("City not found!");
                    }
                    break;
                    
                case 4:
                    System.out.println("\nAll Cities and STD Codes:");
                    for(Map.Entry<String, String> entry : cityMap.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
```

**Sample Output:**
```
=== City STD Code Manager ===
1. Add new city
2. Remove city
3. Search city
4. Display all cities
5. Exit
Enter choice: 1
Enter city name: Kolkata
Enter STD code: 033
City added successfully!

=== City STD Code Manager ===
1. Add new city
2. Remove city
3. Search city
4. Display all cities
5. Exit
Enter choice: 3
Enter city name to search: Pune
STD Code for Pune: 020

=== City STD Code Manager ===
1. Add new city
2. Remove city
3. Search city
4. Display all cities
5. Exit
Enter choice: 4

All Cities and STD Codes:
Mumbai : 022
Pune : 020
Kolkata : 033
Delhi : 011
```

---

## Program 4: Sorted Set with Search (No Duplicates)

**Description:** Accept 'n' integers, store in sorted order without duplicates, and search for an element.

**Code:**
```java
import java.util.*;

public class SortedSetWithSearch {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        
        System.out.println("Enter integers:");
        for(int i = 0; i < n; i++) {
            System.out.print("Number " + (i+1) + ": ");
            numbers.add(sc.nextInt());
        }
        
        System.out.println("\nIntegers in sorted order (duplicates removed):");
        System.out.println(numbers);
        
        System.out.print("\nEnter number to search: ");
        int search = sc.nextInt();
        
        if(numbers.contains(search)) {
            System.out.println(search + " is present in the collection");
        } else {
            System.out.println(search + " is not present in the collection");
        }
        
        sc.close();
    }
}
```

**Sample Output:**
```
Enter number of integers: 7
Enter integers:
Number 1: 45
Number 2: 12
Number 3: 78
Number 4: 23
Number 5: 12
Number 6: 90
Number 7: 34

Integers in sorted order (duplicates removed):
[12, 23, 34, 45, 78, 90]

Enter number to search: 23
23 is present in the collection
```

---

## Program 5: TreeSet with Colors

**Description:** Create TreeSet, add colors and print in ascending order.

**Code:**
```java
import java.util.*;

public class ColorTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of colors: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter colors:");
        for(int i = 0; i < n; i++) {
            System.out.print("Color " + (i+1) + ": ");
            colors.add(sc.nextLine());
        }
        
        System.out.println("\nColors in ascending order:");
        for(String color : colors) {
            System.out.println(color);
        }
        
        sc.close();
    }
}
```

**Sample Output:**
```
Enter number of colors: 6
Enter colors:
Color 1: Red
Color 2: Blue
Color 3: Green
Color 4: Yellow
Color 5: Blue
Color 6: Orange

Colors in ascending order:
Blue
Green
Orange
Red
Yellow
```

---

## Program 6: Sorted Integers Without Duplicates

**Description:** Accept 'N' integers, store and display in sorted order without duplicates.

**Code:**
```java
import java.util.*;

public class SortedIntegersNoDuplicates {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        
        System.out.println("Enter integers:");
        for(int i = 0; i < n; i++) {
            System.out.print("Integer " + (i+1) + ": ");
            int num = sc.nextInt();
            if(!numbers.add(num)) {
                System.out.println("  (Duplicate! Not added)");
            }
        }
        
        System.out.println("\nIntegers in sorted order:");
        System.out.println(numbers);
        
        System.out.println("\nDetailed display:");
        for(Integer num : numbers) {
            System.out.println(num);
        }
        
        sc.close();
    }
}
```

**Sample Output:**
```
Enter number of integers: 8
Enter integers:
Integer 1: 50
Integer 2: 20
Integer 3: 80
Integer 4: 20
  (Duplicate! Not added)
Integer 5: 65
Integer 6: 30
Integer 7: 50
  (Duplicate! Not added)
Integer 8: 10

Integers in sorted order:
[10, 20, 30, 50, 65, 80]

Detailed display:
10
20
30
50
65
80
```

---

## Program 7: LinkedList - Display Negative Integers

**Description:** Accept 'N' integers, store in LinkedList and display only negative integers.

**Code:**
```java
import java.util.*;

public class LinkedListNegative {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        
        System.out.println("Enter integers:");
        for(int i = 0; i < n; i++) {
            System.out.print("Integer " + (i+1) + ": ");
            numbers.add(sc.nextInt());
        }
        
        System.out.println("\nAll integers: " + numbers);
        
        System.out.println("\nNegative integers:");
        boolean found = false;
        for(Integer num : numbers) {
            if(num < 0) {
                System.out.println(num);
                found = true;
            }
        }
        
        if(!found) {
            System.out.println("No negative integers found!");
        }
        
        sc.close();
    }
}
```

**Sample Output:**
```
Enter number of integers: 8
Enter integers:
Integer 1: 25
Integer 2: -15
Integer 3: 30
Integer 4: -7
Integer 5: 42
Integer 6: -23
Integer 7: 10
Integer 8: -5

All integers: [25, -15, 30, -7, 42, -23, 10, -5]

Negative integers:
-15
-7
-23
-5
```

---

## Program 8: LinkedList Subject Names with Iterator

**Description:** Accept 'N' subject names, store in LinkedList and display using Iterator.

**Code:**
```java
import java.util.*;

public class SubjectLinkedList {
    public static void main(String[] args) {
        LinkedList<String> subjects = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter subject names:");
        for(int i = 0; i < n; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            subjects.add(sc.nextLine());
        }
        
        System.out.println("\nSubjects using Iterator:");
        Iterator<String> iterator = subjects.iterator();
        int count = 1;
        while(iterator.hasNext()) {
            System.out.println(count + ". " + iterator.next());
            count++;
        }
        
        sc.close();
    }
}
```

**Sample Output:**
```
Enter number of subjects: 5
Enter subject names:
Subject 1: Mathematics
Subject 2: Physics
Subject 3: Chemistry
Subject 4: Computer Science
Subject 5: English

Subjects using Iterator:
1. Mathematics
2. Physics
3. Chemistry
4. Computer Science
5. English
```

---

## Program 9: LinkedList Integer Operations

**Description:** Create LinkedList of integers. Perform: (i) Add at first (ii) Delete last (iii) Display size

**Code:**
```java
import java.util.*;

public class LinkedListIntegerOps {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of initial elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter integers:");
        for(int i = 0; i < n; i++) {
            System.out.print("Integer " + (i+1) + ": ");
            list.add(sc.nextInt());
        }
        
        System.out.println("\nOriginal List: " + list);
        System.out.println("Size: " + list.size());
        
        System.out.print("\nEnter integer to add at first position: ");
        int newElement = sc.nextInt();
        list.addFirst(newElement);
        System.out.println("After adding at first: " + list);
        System.out.println("Size: " + list.size());
        
        if(!list.isEmpty()) {
            int removed = list.removeLast();
            System.out.println("\nRemoved last element: " + removed);
            System.out.println("After removing last: " + list);
            System.out.println("Final Size: " + list.size());
        }
        
        sc.close();
    }
}
```

**Sample Output:**
```
Enter number of initial elements: 5
Enter integers:
Integer 1: 10
Integer 2: 20
Integer 3: 30
Integer 4: 40
Integer 5: 50

Original List: [10, 20, 30, 40, 50]
Size: 5

Enter integer to add at first position: 5
After adding at first: [5, 10, 20, 30, 40, 50]
Size: 6

Removed last element: 50
After removing last: [5, 10, 20, 30, 40]
Final Size: 5
```

---

## Program 10: Command Line Arguments with Iterator & ListIterator

**Description:** Accept student names from command line, store in collection and display using Iterator and ListIterator.

**Code:**
```java
import java.util.*;

public class StudentNamesIterator {
    public static void main(String[] args) {
        
        if(args.length == 0) {
            System.out.println("No student names provided!");
            System.out.println("Usage: java StudentNamesIterator name1 name2 name3 ...");
            return;
        }
        
        ArrayList<String> students = new ArrayList<>();
        
        System.out.println("Adding " + args.length + " student names...\n");
        for(String name : args) {
            students.add(name);
        }
        
        System.out.println("=== Using Iterator (Forward) ===");
        Iterator<String> iterator = students.iterator();
        int count = 1;
        while(iterator.hasNext()) {
            System.out.println(count + ". " + iterator.next());
            count++;
        }
        
        System.out.println("\n=== Using ListIterator (Forward) ===");
        ListIterator<String> listIterator = students.listIterator();
        while(listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String name = listIterator.next();
            System.out.println("Index " + index + ": " + name);
        }
        
        System.out.println("\n=== Using ListIterator (Backward) ===");
        while(listIterator.hasPrevious()) {
            int index = listIterator.previousIndex();
            String name = listIterator.previous();
            System.out.println("Index " + index + ": " + name);
        }
        
        System.out.println("\nTotal students: " + students.size());
    }
}
```

**Sample Output:**
```
Command: java StudentNamesIterator Alice Bob Charlie Diana Edward

Adding 5 student names...

=== Using Iterator (Forward) ===
1. Alice
2. Bob
3. Charlie
4. Diana
5. Edward

=== Using ListIterator (Forward) ===
Index 0: Alice
Index 1: Bob
Index 2: Charlie
Index 3: Diana
Index 4: Edward

=== Using ListIterator (Backward) ===
Index 4: Edward
Index 3: Diana
Index 2: Charlie
Index 1: Bob
Index 0: Alice

Total students: 5
```

---

## SUMMARY

### Collections Used:

1. **HashSet** - Unordered collection, no duplicates allowed
2. **LinkedList** - Ordered collection, allows duplicates, efficient insertion/deletion
3. **HashMap** - Key-value pairs, no duplicate keys allowed
4. **TreeSet** - Sorted collection, no duplicates, maintains natural ordering
5. **ArrayList** - Ordered collection, allows duplicates, fast random access

### Key Concepts Covered:

✓ Adding, removing, and searching elements
✓ Iterating using Iterator and ListIterator
✓ Sorting collections (ascending order)
✓ Handling duplicates
✓ Command line arguments
✓ Menu-driven programs
✓ Forward and backward iteration
✓ Size and capacity management

---

**Document Information:**
- Total Programs: 10
- Format: Markdown
- Page Size: A4
- Font Recommendations: Courier New (code), Times New Roman (text)
- Font Size: 12pt

**END OF DOCUMENT**
