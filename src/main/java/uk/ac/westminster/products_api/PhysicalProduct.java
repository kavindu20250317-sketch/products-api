package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it inherits common product details.
// A ShoppingCart HAS-A collection of Products.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;
    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {

        super(id, name, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}