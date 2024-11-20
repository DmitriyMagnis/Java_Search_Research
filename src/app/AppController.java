package app;

public class AppController {
    public void runApp() {
        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        try {
            String namesOutput = dataHandler.handleData(provider.getProductNames());
            getOutput("Products: " + namesOutput);

            String salesOutput = dataHandler.handleData(provider.getSalesAmounts());
            getOutput("Sales, EUR: " + salesOutput);

        } catch (IllegalArgumentException e) {
            getOutput("Error: " +e.getMessage());
        }

    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
