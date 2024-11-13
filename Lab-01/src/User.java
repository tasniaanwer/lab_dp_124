public abstract class User {
    private int id;
    private String name;
    private String location;
    private double rating;

    public User(int id, String name, String location, double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        setRating(rating);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location != null && !location.isEmpty()) {
            this.location = location;
        } else {
            System.out.println("Invalid location.");
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0 and 5.");
        }
    }

    public abstract String getUserType();
}