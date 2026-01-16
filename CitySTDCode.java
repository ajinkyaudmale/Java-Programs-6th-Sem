import java.util.*;

public class CitySTDCode {
    public static void main(String[] args) {
        HashMap<String, String> cityMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        cityMap.put("Mumbai", "022");
        cityMap.put("Delhi", "011");
        cityMap.put("Pune", "020");

        while (true) {
            System.out.println("\n=== City STD Code Manager ===");
            System.out.println("1. Add new city");
            System.out.println("2. Remove city");
            System.out.println("3. Search city");
            System.out.println("4. Display all cities");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = sc.nextLine();
                    if (cityMap.containsKey(city)) {
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
                    if (cityMap.remove(removeCity) != null) {
                        System.out.println("City removed successfully!");
                    } else {
                        System.out.println("City not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter city name to search: ");
                    String searchCity = sc.nextLine();
                    String code = cityMap.get(searchCity);
                    if (code != null) {
                        System.out.println("STD Code for " + searchCity + ": " + code);
                    } else {
                        System.out.println("City not found!");
                    }
                    break;

                case 4:
                    System.out.println("\nAll Cities and STD Codes:");
                    for (Map.Entry<String, String> entry : cityMap.entrySet()) {
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
