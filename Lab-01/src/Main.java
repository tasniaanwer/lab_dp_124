import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rider information
        System.out.println("Enter Rider Name: ");
        String riderName = scanner.nextLine();

        System.out.println("Enter Rider Location: ");
        String riderLocation = scanner.nextLine();

        System.out.println("Enter Rider Rating: ");
        double riderRating = scanner.nextDouble();

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Digital Wallet");
        System.out.println("3. PayPal");
        int paymentChoice = scanner.nextInt();
        PaymentMethod paymentMethod = switch (paymentChoice) {
            case 1 -> new CreditCard();
            case 2 -> new DigitalWallet();
            case 3 -> new PayPal();
            default -> throw new IllegalArgumentException("Invalid payment method");
        };

        // Create rider
        Rider rider = new Rider(1, riderName, riderLocation, riderRating, paymentMethod);

        // Enter trip details
        scanner.nextLine();  // Consume leftover newline
        System.out.println("Enter Pickup Location: ");
        String pickupLocation = scanner.nextLine();

        System.out.println("Enter Dropoff Location: ");
        String dropoffLocation = scanner.nextLine();

        System.out.println("Enter Distance (in km): ");
        int distance = scanner.nextInt();

        System.out.println("Choose Ride Type:");
        System.out.println("1. Carpool");
        System.out.println("2. Bike");
        System.out.println("3. Luxury");
        int rideTypeChoice = scanner.nextInt();
        RideType rideType = switch (rideTypeChoice) {
            case 1 -> new Carpool();
            case 2 -> new Bike();
            case 3 -> new Luxury();
            default -> throw new IllegalArgumentException("Invalid ride type");
        };

        // Create drivers
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(1, "Driver A", new Bike(), "g", 4.5));
        drivers.add(new Driver(2, "Driver B", new Luxury(), "c", 4.8));
        drivers.add(new Driver(3, "Driver C", new Carpool(), "b", 4.2));

        // Rider requests a ride
        Trip trip = rider.requestRide(pickupLocation, dropoffLocation, rideType, distance, drivers);

        if (trip != null) {
            System.out.println("Ride accepted. Trip details:");
            System.out.println("Pickup: " + trip.getPickupLocation());
            System.out.println("Dropoff: " + trip.getDropoffLocation());
            System.out.println("Fare: $" + trip.getFare());
        } else {
            System.out.println("No available drivers nearby.");
        }

        scanner.close();
    }
}
