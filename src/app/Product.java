package app;

public class Product<T, U> implements IProduct<T, U> {
    private final T name;
    private final U amount;


    public Product(T name, U amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public T getProductName() {
        return name;
    }
    @Override
    public U getProductAmount() {
        return amount;
    }
}
