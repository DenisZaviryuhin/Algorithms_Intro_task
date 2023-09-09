package app;

public class Main02 {

    private static String CURRENCY = "USD";
    static double[] prices = {2.99, 3.99, 1.99, 3.50, 4.29};

    public static void main(String[] args) {


        getOutput(getAveragePrice(getSortedPrices(prices)));

    }

    private static double[] getSortedPrices(double[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int b = 1; b < (prices.length - 1); b++) {
                if (prices[b - 1] > prices[b]) {
                    double temp = prices[b - 1];
                    prices[b - 1] = prices[b];
                    prices[b] = temp;
                }
            }
        }
        System.out.println("Sorted prices in " + CURRENCY + " :");
        for (double price : prices) {
            System.out.print(price + " ");
        }
        return prices;
    }

    private static double getAveragePrice(double[] prices) {
       double sum = 0.0;
        for (double price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    private static void getOutput(double average) {
        System.out.printf("\nAverage price for all period : %.2f %s", average ,CURRENCY);

    }
}
