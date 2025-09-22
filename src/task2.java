import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        System.out.println("What is the cost of your Spring maintenance?");
        Scanner in = new Scanner(System.in);
        double sprCost = in.nextDouble();

        System.out.println("What is the cost of your Summer maintenance?");
        double sumCost = in.nextDouble();

        System.out.println("What is the cost of your Fall maintenance?");
        double fallCost = in.nextDouble();

        System.out.println("What is the cost of your Winter maintenance?");
        double wintCost = in.nextDouble();


        double yearlyMaintenanceCost = sprCost + sumCost + fallCost + wintCost;
        System.out.println("Your Yearly maintenance cost is: " + yearlyMaintenanceCost);
        System.out.println("Your Spring cost: " + sprCost);
        System.out.println("Your Summer cost: " + sumCost);
        System.out.println("Your Fall cost: " + fallCost);
        System.out.println("Your Winter cost: " + wintCost);

        in.close();







    }
}
