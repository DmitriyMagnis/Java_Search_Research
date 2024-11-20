package app;

public interface IProduct<T, U> {
    T getProductName();
    U getProductAmount();
}
