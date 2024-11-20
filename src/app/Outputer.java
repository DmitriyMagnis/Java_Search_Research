package app;

public class Outputer {

    public <T> void getOutput(T item) {
        System.out.print(item + " ");
    }

    public <T> void getOutput(T[] items) {
        for (T item : items) {
            System.out.print(item + " ");
        }
    }
}
