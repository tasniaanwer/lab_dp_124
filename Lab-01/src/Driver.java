public class Driver extends User {
    private RideType vehicleType;
    private boolean available;

    public Driver(int id, String name, RideType vehicleType, String location, double rating) {
        super(id, name, location, rating);  // Use 'User' constructor to initialize location
        this.available = true;
        this.vehicleType = vehicleType;
    }

    public void rateRider(Rider rider, int rating) {
        rider.setRating((rider.getRating() + rating) / 2);
        System.out.println(getName() + " rated rider " + rider.getName() + " with " + rating + " stars.");
    }

    public void updateLocation(String location) {
        setLocation(location); // Use the 'User' class method to update location
        System.out.println("Driver " + getName() + " updated location to " + location);
    }

    public void acceptRide(Trip trip) {
        this.available = false;
        trip.assignDriver(this);
        System.out.println("Driver " + getName() + " accepted the ride.");
    }

    public void startTrip(Trip trip) {
        System.out.println("Driver " + getName() + " started the trip.");
    }

    public void completeTrip(Trip trip) {
        this.available = true;
        System.out.println("Driver " + getName() + " completed the trip.");
        new NotificationService(new InAppNotification()).sendNotification("Trip completed", trip.getRider());
    }

    public boolean isAvailable() {
        return available;
    }

    public RideType getVehicleType() {
        return vehicleType;
    }

    // Get location from 'User' class
    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public String getUserType() {
        return "Driver";
    }
}
