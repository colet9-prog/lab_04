import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.println("What is the price of your purchase?");
        Scanner in = new Scanner(System.in);

        double price = in.nextDouble();

        in.close();

        double salesTaxTotal = price * .05;
        double totalPrice = price + salesTaxTotal;

        System.out.println("Your item cost: " + price);
        System.out.println("Your sales tax: " + salesTaxTotal);
        System.out.println("Your total price is: " + totalPrice);








    }
}
