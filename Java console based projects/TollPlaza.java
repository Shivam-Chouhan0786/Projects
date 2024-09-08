import java.util.Scanner;

public class TollPlaza {

    // Vehicle types and their toll rates
    private static final String[] VEHICLE_TYPES = {"Car", "Bus", "Truck"};
    private static final double[] TOLL_RATES = {100, 200, 300}; // Corresponding rates for Car, Bus, Truck

    // Tracks the total revenue
    private double totalRevenue = 0.0;

    public static void main(String[] args) {
        TollPlaza plaza = new TollPlaza();
        plaza.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
			System.out.println("-------------------------TollPlaza-------------------------");
            System.out.println("Toll Plaza Management System");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Check Total Revenue");
            System.out.println("4. Exit");
			System.out.println("-----------------------------------------------------------");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    handleVehicleEntry(scanner);
                    break;
                case 2:
                    handleVehicleExit(scanner);
                    break;
                case 3:
                    checkTotalRevenue();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void handleVehicleEntry(Scanner scanner) {
        System.out.println("Enter vehicle type (Car/Bus/Truck):");
        String vehicleType = scanner.nextLine();
        if (isValidVehicleType(vehicleType)) {
            System.out.println("Vehicle of type " + vehicleType + " entered.");
        } else {
            System.out.println("Unknown vehicle type.");
        }
    }

    private void handleVehicleExit(Scanner scanner) {
        System.out.println("Enter vehicle type (Car/Bus/Truck):");
        String vehicleType = scanner.nextLine();
        int index = getVehicleTypeIndex(vehicleType);
        if (index != -1) {
            double tollAmount = TOLL_RATES[index];
            totalRevenue += tollAmount;
            System.out.println("Vehicle of type " + vehicleType + " exited. Toll charged: " + tollAmount + "rupee");
        } else {
            System.out.println("Unknown vehicle type.");
        }
    }

    private void checkTotalRevenue() {
        System.out.println("Total revenue collected: " + totalRevenue+ "rupee");
    }

    private boolean isValidVehicleType(String vehicleType) {
        for (String type : VEHICLE_TYPES) {
            if (type.equalsIgnoreCase(vehicleType)) {
                return true;
            }
        }
        return false;
    }

    private int getVehicleTypeIndex(String vehicleType) {
        for (int i = 0; i < VEHICLE_TYPES.length; i++) {
            if (VEHICLE_TYPES[i].equalsIgnoreCase(vehicleType)) {
                return i;
            }
        }
        return -1;
    }
}
