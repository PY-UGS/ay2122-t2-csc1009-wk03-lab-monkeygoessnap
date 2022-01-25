import java.util.Date;
import java.lang.Math;
public class Loan {

    double annualIntRate;
    int numYears;
    double loanAmt;
    Date loanDate;

    public Loan() {
        this.annualIntRate = 2.5;
        this.numYears = 1;
        this.loanAmt = 1000;
        this.loanDate = new Date();
    }

    public Loan(double annualIntRate, int numYears, double loanAmt) {
        this.annualIntRate = annualIntRate;
        this.numYears = numYears;
        this.loanAmt = loanAmt;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return this.annualIntRate;
    }

    public int getNumberOfYears() {
        return this.numYears;
    }

    public double getLoanAmount() {
        return this.loanAmt;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }

    public void setAnnualInterestRate(double annualIntRate) {
        this.annualIntRate = annualIntRate;
    }

    public void setNumberOfYears(int numYears) {
        this.numYears = numYears;
    }

    public void setLoanAmount(double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public double getMonthlyPayment() {

        double monthIntRate = this.annualIntRate/12/100;

        double a = 1 / Math.pow((1+monthIntRate), this.numYears * 12);

        double monthlyPayment = this.loanAmt * monthIntRate / (1 - a);

        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = this.getMonthlyPayment() * this.numYears * 12;

        return totalPayment;
    }

}
