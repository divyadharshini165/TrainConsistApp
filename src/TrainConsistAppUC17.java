import java.util.Arrays;

public class TrainConsistAppUC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original array
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // SORT using built-in method
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}
