import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistAppUC20 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // You can test BOTH cases:
        // Case 1: Empty array
        String[] bogieIds = {};

        // Case 2: Uncomment below to test normal flow
        // String[] bogieIds = {"BG101", "BG205", "BG309"};

        try {

            // ✅ FAIL-FAST CHECK
            if (bogieIds.length == 0) {
                throw new IllegalStateException("Train has no bogies. Cannot perform search.");
            }

            // Sort before binary search
            Arrays.sort(bogieIds);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Bogie ID to search: ");
            String key = sc.nextLine();

            // Binary Search Logic
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
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            // Output
            if (found) {
                System.out.println("Bogie ID " + key + " FOUND.");
            } else {
                System.out.println("Bogie ID " + key + " NOT FOUND.");
            }

            sc.close();

        } catch (IllegalStateException e) {

            // Handle exception
            System.out.println("ERROR: " + e.getMessage());

        }

        System.out.println("Program continues safely...");
    }
}