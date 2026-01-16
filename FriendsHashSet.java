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
