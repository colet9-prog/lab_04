public class task3{
    public static void main(String[] args) {
        double balance = 5000.0;
        double annualRate = 0.17;
        double monthlyRate = annualRate / 12;

        double firstMonthInterest = balance * monthlyRate;
        double balanceAfterOneMonth = balance + firstMonthInterest;

        double secondMonthInterest = balanceAfterOneMonth * monthlyRate;
        double balanceAfterTwoMonths = balanceAfterOneMonth + secondMonthInterest;

        System.out.printf("Initial Balance: $%.2f%n", balance);
        System.out.printf("Interest due after one month: $%.2f%n", firstMonthInterest);
        System.out.printf("Balance after one month: $%.2f%n", balanceAfterOneMonth);
        System.out.printf("Interest due after two months: $%.2f%n", secondMonthInterest);
        System.out.printf("Balance after two months: $%.2f%n", balanceAfterTwoMonths);
    }

}

