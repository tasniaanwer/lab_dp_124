import java.util.ArrayList;
import java.util.List;

public abstract class Bundle implements ProductComponent {
    protected List<ProductComponent> products = new ArrayList<>();
    protected String name;
    protected String description;

    public Bundle(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void build();

    public void addProduct(ProductComponent product) {
        products.add(product);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Bundle: " + name + " - " + description);
        for (ProductComponent product : products) {
            product.displayProductInfo();
        }
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (ProductComponent product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
