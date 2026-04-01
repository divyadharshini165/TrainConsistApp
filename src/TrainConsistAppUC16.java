
import java.util.ArrayList;
import java.util.List;

// Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistAppUC16 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 40));
        bogies.add(new PassengerBogie("Luxury", 80));

        // -------------------------------
        // BUBBLE SORT (Ascending Order)
        // -------------------------------
        int n = bogies.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (bogies.get(j).capacity > bogies.get(j + 1).capacity) {

                    // Swap
                    PassengerBogie temp = bogies.get(j);
                    bogies.set(j, bogies.get(j + 1));
                    bogies.set(j + 1, temp);
                }
            }
        }

        // Display sorted bogies
        System.out.println("Sorted Bogies (by Capacity):");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}