public class Trip {
    private Rider rider;
    private String pickupLocation;
    private String dropoffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private Driver driver;
    private int distance;
    private PaymentMethod paymentMethod;

    public Trip(Rider rider, String pickupLocation, String dropoffLocation, RideType rideType, int distance, PaymentMethod paymentMethod) {
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.rideType = rideType;
        this.distance = distance;
        this.status = "Requested";
        this.paymentMethod = paymentMethod;
        this.fare = 0; // Set fare to 0 initially
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.status = "Assigned";
        // Calculate the fare after the driver is assigned
        this.fare = rideType.calculateFare(distance); // Fare calculation
        new NotificationService(new SMSNotification()).sendNotification("Driver assigned", rider);
    }

    public void completeTrip() {
        this.status = "Completed";
        rider.makePayment(this);  // Rider makes the payment after the trip is completed
        new NotificationService(new SMSNotification()).sendNotification("Trip completed", rider);
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public double getFare() {
        return fare;
    }

    public Rider getRider() {
        return rider;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public String getStatus() {
        return status;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getDistance() {
        return distance;
    }
}
