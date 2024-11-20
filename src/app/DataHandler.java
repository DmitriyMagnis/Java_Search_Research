package app;

public class DataHandler {

    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (T item : items) {
            if (!(item instanceof String || item instanceof Number)) {
                throw new IllegalArgumentException("Items must be String or Number.");
            }
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }
        return sb.toString();
    }

//    public String handleData(String[] items) {
//        return handleBaseData(items);
//    }
//    public String handleData(Number[] items) {
//        return handleBaseData(items);
//    }
}
