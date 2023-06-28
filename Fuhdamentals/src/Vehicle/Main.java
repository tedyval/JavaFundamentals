package Vehicle;



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle car = createVehicle(scanner);
        Vehicle track = createVehicle(scanner);
        Vehicle bus = createVehicle(scanner);
        Map<String, Vehicle> vehicles = new LinkedHashMap<String, Vehicle>();
        vehicles.put("Car", car);
        vehicles.put("Truck", track);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            try {
                switch (tokens[0]) {
                    case "Drive":
                        vehicles.get(tokens[1]).drive(Double.parseDouble(tokens[2]));
                        break;
                    case "DriveEmpty":
                        ((Bus) vehicles.get(tokens[1])).driveEmpty(Double.parseDouble(tokens[2]));
                        break;
                    case "Refuel":

                        vehicles.get(tokens[1]).refuel(Double.parseDouble(tokens[2]));

                        break;
                }
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        for (Vehicle value : vehicles.values()) {
            System.out.println(value);
        }


    }

    private static Vehicle createVehicle(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double fuelConsumtion = Double.parseDouble(tokens[2]);
        int tankCapacity = Integer.parseInt(tokens[3]);
        Vehicle v = null;
        if (tokens[0].equals("Car")) {
            v = new Car(fuelQuantity, fuelConsumtion, tankCapacity);

        } else if (tokens[0].equals("Truck")) {
            v = new Truck(fuelQuantity, fuelConsumtion, tankCapacity);

        } else if (tokens[0].equals("Bus")) {
            v = new Bus(fuelQuantity, fuelConsumtion, tankCapacity);
        }
        return v;
    }
}
