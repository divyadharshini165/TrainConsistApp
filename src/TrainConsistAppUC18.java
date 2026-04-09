import java.util.Scanner;

public class TrainConsistAppUC18 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Linear Search logic
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break; // Early termination
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        sc.close();
    }
}