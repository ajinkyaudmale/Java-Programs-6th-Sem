# Java Collection Programs - 6th Semester

A comprehensive collection of 10 Java programs demonstrating various collection frameworks including HashSet, LinkedList, HashMap, TreeSet, and ArrayList.

## 📋 Programs Overview

### Program 1: Friends HashSet
**File:** `FriendsHashSet.java`
- **Description:** Read N names of friends, store in HashSet and display in ascending order.
- **Collection Used:** HashSet
- **Key Operations:** Adding elements, sorting, removing duplicates
- **Run Command:** `java FriendsHashSet`

### Program 2: LinkedList String Operations
**File:** `LinkedListString.java`
- **Description:** Create LinkedList of String objects and perform add at end, delete first, and display in reverse.
- **Collection Used:** LinkedList
- **Key Operations:** addLast(), removeFirst(), reverse iteration
- **Run Command:** `java LinkedListString`

### Program 3: City STD Code Manager
**File:** `CitySTDCode.java`
- **Description:** Store city names and STD codes. Perform add, remove, and search operations.
- **Collection Used:** HashMap
- **Key Operations:** put(), remove(), get(), entrySet()
- **Features:** Menu-driven interface
- **Run Command:** `java CitySTDCode`

### Program 4: Sorted Set with Search
**File:** `SortedSetWithSearch.java`
- **Description:** Accept N integers, store in sorted order without duplicates, and search for an element.
- **Collection Used:** TreeSet
- **Key Operations:** Automatic sorting, contains(), duplicate elimination
- **Run Command:** `java SortedSetWithSearch`

### Program 5: Color TreeSet
**File:** `ColorTreeSet.java`
- **Description:** Create TreeSet, add colors and print in ascending order.
- **Collection Used:** TreeSet
- **Key Operations:** Adding strings, automatic alphabetical sorting
- **Run Command:** `java ColorTreeSet`

### Program 6: Sorted Integers Without Duplicates
**File:** `SortedIntegersNoDuplicates.java`
- **Description:** Accept N integers, store and display in sorted order without duplicates.
- **Collection Used:** TreeSet
- **Key Operations:** add() with duplicate detection, sorted display
- **Run Command:** `java SortedIntegersNoDuplicates`

### Program 7: LinkedList - Display Negative Integers
**File:** `LinkedListNegative.java`
- **Description:** Accept N integers, store in LinkedList and display only negative integers.
- **Collection Used:** LinkedList
- **Key Operations:** Conditional iteration, filtering
- **Run Command:** `java LinkedListNegative`

### Program 8: Subject LinkedList with Iterator
**File:** `SubjectLinkedList.java`
- **Description:** Accept N subject names, store in LinkedList and display using Iterator.
- **Collection Used:** LinkedList
- **Key Operations:** Iterator implementation, hasNext(), next()
- **Run Command:** `java SubjectLinkedList`

### Program 9: LinkedList Integer Operations
**File:** `LinkedListIntegerOps.java`
- **Description:** Create LinkedList of integers. Perform add at first, delete last, and display size.
- **Collection Used:** LinkedList
- **Key Operations:** addFirst(), removeLast(), size()
- **Run Command:** `java LinkedListIntegerOps`

### Program 10: Student Names Iterator
**File:** `StudentNamesIterator.java`
- **Description:** Accept student names from command line, store in collection and display using Iterator and ListIterator.
- **Collection Used:** ArrayList
- **Key Operations:** Iterator (forward), ListIterator (forward and backward)
- **Run Command:** `java StudentNamesIterator Alice Bob Charlie Diana Edward`

## 🚀 How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- Command line/Terminal access

### Compilation
Compile all programs at once:
```bash
javac *.java
```

Or compile individual programs:
```bash
javac FriendsHashSet.java
javac LinkedListString.java
# ... and so on
```

### Execution

#### Interactive Programs (Input Required)
```bash
java FriendsHashSet
java LinkedListString
java CitySTDCode
java SortedSetWithSearch
java ColorTreeSet
java SortedIntegersNoDuplicates
java LinkedListNegative
java SubjectLinkedList
java LinkedListIntegerOps
```

#### Command-Line Arguments Program
```bash
java StudentNamesIterator Alice Bob Charlie Diana Edward
```

## 📊 Collections Used

| Collection | Program | Characteristics |
|-----------|---------|-----------------|
| **HashSet** | Program 1 | Unordered, no duplicates |
| **LinkedList** | Programs 2, 7, 8, 9 | Ordered, allows duplicates, efficient insertion/deletion |
| **HashMap** | Program 3 | Key-value pairs, no duplicate keys |
| **TreeSet** | Programs 4, 5, 6 | Sorted, no duplicates, maintains natural ordering |
| **ArrayList** | Program 10 | Ordered, allows duplicates, fast random access |

## 🎯 Key Concepts Covered

✓ Adding, removing, and searching elements  
✓ Iterating using Iterator and ListIterator  
✓ Sorting collections (ascending order)  
✓ Handling duplicates  
✓ Command line arguments  
✓ Menu-driven programs  
✓ Forward and backward iteration  
✓ Size and capacity management  

## 📝 Sample I/O Examples

### Program 1: Friends HashSet
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

### Program 3: City STD Code Manager
```
=== City STD Code Manager ===
1. Add new city
2. Remove city
3. Search city
4. Display all cities
5. Exit
Enter choice: 3
Enter city name to search: Pune
STD Code for Pune: 020
```

### Program 10: Student Names Iterator
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

## 📁 File Structure
```
Java/
├── FriendsHashSet.java
├── LinkedListString.java
├── CitySTDCode.java
├── SortedSetWithSearch.java
├── ColorTreeSet.java
├── SortedIntegersNoDuplicates.java
├── LinkedListNegative.java
├── SubjectLinkedList.java
├── LinkedListIntegerOps.java
├── StudentNamesIterator.java
├── java_collections_word.md
└── README.md
```

## 🔧 Troubleshooting

### Common Issues

**Issue:** "No such file or directory"
- **Solution:** Ensure you are in the correct directory (`d:\Java`)

**Issue:** "Exception in thread "main" java.util.NoSuchElementException"
- **Solution:** Provide all required inputs before pressing Enter

**Issue:** Program not compiling
- **Solution:** Ensure Java compiler is installed and in PATH. Check JDK version compatibility.

## 💡 Learning Outcomes

After working with these programs, you will understand:
- How to work with different collection types
- Memory efficient data structures for different use cases
- Iterator patterns for traversing collections
- Sorting and duplicate handling in collections
- Menu-driven program design
- Command-line argument parsing

## 📚 Additional Resources

- [Java Collections Framework Documentation](https://docs.oracle.com/javase/tutorial/collections/)
- [HashSet Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)
- [LinkedList Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)
- [HashMap Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
- [TreeSet Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)

## 👨‍💻 Author
6th Semester Java Programming Course

## 📄 License
Educational purposes only

## ✅ Version
1.0 - Complete 10 Program Collection

---

**Last Updated:** January 16, 2026
