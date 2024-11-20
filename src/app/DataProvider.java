package app;

import java.util.Arrays;

public class DataProvider {

    private final Product[] products;

    public DataProvider() {
        this.products = new Product[] {
                new Product<>("apple",1520.89),
                new Product<>("grape",2058.35),
                new Product<>("mango",1220.39),
                new Product<>("orange",1120.19)
        };
    }

    public String[] getProductNames() {
        return Arrays.stream(this.products).map(Product::getProductName).toArray(String[]::new);
    }

    public Double[] getSalesAmounts() {
        return Arrays.stream(this.products).map(Product::getProductAmount).toArray(Double[]::new);
    }
}
