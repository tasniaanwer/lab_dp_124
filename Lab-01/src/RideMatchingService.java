import java.util.List;

public class RideMatchingService {

    // This method finds the nearest available driver based on location
    public Driver findDriver(Rider rider, List<Driver> drivers) {
        Driver nearestDriver = null;
        double minDistance = Double.MAX_VALUE;

        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                String riderLocation = rider.getLocation();
                String driverLocation = driver.getLocation();

                // Calculate distance only if locations are valid
                if (riderLocation != null && driverLocation != null) {
                    double distance = calculateDistance(riderLocation, driverLocation);
                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestDriver = driver;
                    }
                }
            }
        }

        return nearestDriver;
    }

    // Basic string length-based "distance" calculation
    public double calculateDistance(String location1, String location2) {
        if (location1 == null || location2 == null) {
            throw new IllegalArgumentException("Both locations must be non-null.");
        }

        // Dummy distance calculation: you can replace this with a real implementation later
        return Math.abs(location1.length() - location2.length());
    }
}
