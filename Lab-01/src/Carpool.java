public class Carpool implements RideType {
    private String type;

    public Carpool() {
        this.type = "Carpool";
    }

    @Override
    public double calculateFare(int distance) {
        double baseFare = distance * 60; // Base fare calculation

        // Logic for additional charges based on payment method can be done in Trip or another suitable place
        return baseFare; // Return the calculated fare
    }

    @Override
    public String getType() {
        return type;
    }
}
