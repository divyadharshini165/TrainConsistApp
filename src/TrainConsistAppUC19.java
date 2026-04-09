import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistAppUC19 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Unsorted bogie IDs (to show sorting step)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // STEP 1: Sort array (IMPORTANT for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;   // search right
            } else {
                high = mid - 1;  // search left
            }
        }

        // Output
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND.");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND.");
        }

        sc.close();
    }
}