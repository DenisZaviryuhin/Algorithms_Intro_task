package app;
//Протягом семи днів фіксувалась щоденна різна ціна товару.
//За допомогою алгоритму Bubble sort реалізуйте функціонал,
//який сортує значення цін в зростаючому порядку.
//Також реалізуйте функціонал, який розраховує середню ціну
//за весь період.
public class Main01 {
    static double sum;
    private static String CURRENCY = "USD";

    public static void main(String[] args) {
        double[] prices = {2.99, 3.99, 1.99, 3.50, 4.29};
        for (int i = 0; i < prices.length; i++) {
            for (int b = 1; b < (prices.length - 1); b++) {
                if (prices[b - 1] > prices[b]) {
                    double temp = prices[b - 1];
                    prices[b - 1] = prices[b];
                    prices[b] = temp;
                }
            }
        }
        System.out.println("Sorted prices in " + CURRENCY + " :" );
        for (double price : prices) {
            System.out.print(price + " ");
        }
        sum = 0;
        for (double price : prices) {
            sum += price;
        }
           double average = sum / prices.length;
            System.out.printf("\nAverage price for all period : %.2f %s" ,average,CURRENCY);
    }
}







