public class Laptop implements ProductComponent {
    private String name;
    private double price;
    private String description;

    public Laptop(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Laptop: " + name + " - " + description + " | Price: $" + price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}