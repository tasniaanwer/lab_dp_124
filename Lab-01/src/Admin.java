import java.util.List;

public class Admin {
    private int id;
    private String name;
    private String role;

    public Admin(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void manageDriver(Driver driver) {
        System.out.println("Admin " + name + " is managing driver " + driver.getName());
    }

    public void deactivateDriver(Driver driver) {
        System.out.println("Admin " + name + " has deactivated driver " + driver.getName());
    }

    public void manageRider(Rider rider) {
        System.out.println("Admin " + name + " is managing rider " + rider.getName());
    }

    public void viewTripHistory(List<Trip> trips) {
        System.out.println("Admin " + name + " is viewing trip history");
        for (Trip trip : trips) {
            System.out.println("Trip from " + trip.getPickupLocation() + " to " + trip.getDropoffLocation() + " with fare $" + trip.getFare());
        }
    }

    public void handleDispute(Rider rider, Driver driver) {
        System.out.println("Admin " + name + " is handling a dispute between " + rider.getName() + " and " + driver.getName());
    }

    public void viewDashboard(List<Trip> trips, List<User> users) {
        double totalPayments = 0;
        int totalRides = trips.size();
        double totalRatings = 0;

        for (Trip trip : trips) {
            totalPayments += trip.getFare();
        }

        for (User user : users) {
            totalRatings += user.getRating();
        }

        double averageRating = users.size() > 0 ? totalRatings / users.size() : 0;

        System.out.println("---- Admin Dashboard ----");
        System.out.println("Total Rides: " + totalRides);
        System.out.println("Total Payments Processed: $" + totalPayments);
        System.out.println("Average User Rating: " + averageRating);
        System.out.println("-------------------------");
    }
}