public class Luxury implements RideType {
    private String type;

    public Luxury() {
        this.type = "Luxury";
    }

    @Override
    public double calculateFare(int distance) {
        double baseFare = distance * 100; // Base fare calculation

        // Logic for additional charges based on payment method can be done in Trip or another suitable place
        return baseFare; // Return the calculated fare
    }

    @Override
    public String getType() {
        return type;
    }
}
