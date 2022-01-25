import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.5: ");
        double annualIntRate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmt = input.nextDouble();        

        Loan newLoan = new Loan(annualIntRate, numYears, loanAmt);

        System.out.println("The loan was created on " + newLoan.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", newLoan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", newLoan.getTotalPayment());
    }
}
