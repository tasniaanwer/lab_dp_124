import java.util.List;

public class Rider extends User {
    private PaymentMethod preferredPaymentMethod;

    public Rider(int id, String name, String location, double rating, PaymentMethod preferredPaymentMethod) {
        super(id, name, location, rating);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }


    public Trip requestRide(String pickupLocation, String dropoffLocation, RideType rideType, int distance, List<Driver> drivers) {
        System.out.println(getName() + " requested a " + rideType.getType() + " ride.");
        new NotificationService(new EmailNotification()).sendNotification("Ride requested.", this);

        // Use RideMatchingService to find the nearest available driver
        RideMatchingService rideMatchingService = new RideMatchingService();
        Driver matchedDriver = rideMatchingService.findDriver(this, drivers);

        if (matchedDriver != null) {
            System.out.println("Driver " + matchedDriver.getName() + " is available and nearby.");
            Trip trip = new Trip(this, pickupLocation, dropoffLocation, rideType, distance, getPreferredPaymentMethod());
            matchedDriver.acceptRide(trip);
            return trip;
        } else {
            System.out.println("No available drivers nearby.");
            return null;
        }
    }

    public void rateDriver(Driver driver, int rating) {
        driver.setRating((driver.getRating() + rating) / 2);
        System.out.println(getName() + " rated driver " + driver.getName() + " with " + rating + " stars.");
    }

    public void makePayment(Trip trip) {
        trip.getPaymentMethod().processPayment(trip.getFare());
    }

    @Override
    public String getUserType() {
        return "Rider";
    }

    public PaymentMethod getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod(PaymentMethod preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }
}