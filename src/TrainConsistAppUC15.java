// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Cargo Assignment Method
    public void assignCargo(String cargo) {

        try {
            // Safety rule
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be loaded in Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " -> " + (cargo == null ? "No Cargo" : cargo);
    }
}

public class TrainConsistAppUC15 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // SAFE assignment
        b1.assignCargo("Petroleum");

        // UNSAFE assignment
        b2.assignCargo("Petroleum");

        // Continue program
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nProgram continues safely...");
    }
}