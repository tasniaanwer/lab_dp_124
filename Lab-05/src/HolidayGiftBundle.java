public class HolidayGiftBundle extends Bundle {
    public HolidayGiftBundle(String name, String description) {
        super(name, description);
        build();
    }

    @Override
    public void build() {
        addProduct(new Laptop("High-performance Laptop", 999.99, "Latest model with high specs"));
        addProduct(new Phone("Smartphone", 499.99, "Latest model smartphone"));
    }
}
