package app;

public class Product {
    private final String name;
    private final Double amount;

    public Product(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getProductName() {
        return name;
    }
    public Double getProductAmount() {
        return amount;
    }
}
