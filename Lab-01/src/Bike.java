public class Bike implements RideType {
    private String type;

    public Bike() {
        this.type = "Bike";
    }

    @Override
    public double calculateFare(int distance) {
        double baseFare = distance * 30; // Base fare calculation

        // Assuming we need to apply discount based on payment method, we need to pass it differently
        // This can be adjusted based on your requirements for discounts
        return baseFare; // Currently, we won't apply discounts here
    }

    @Override
    public String getType() {
        return type;
    }
}
