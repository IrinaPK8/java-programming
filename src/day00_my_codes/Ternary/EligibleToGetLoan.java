package day00_my_codes.Ternary;

public class EligibleToGetLoan {
    public static void main(String[] args) {
        /** TERNARY
         [Eligible to get Loan]
         Given two values: yearly salary and credit score determine if you can get a loan.
         To be approved for the loan, print: "Loan Approved":
         Salary: above 60,000
         Credit Score: above 650
         Otherwise print: "Loan Denied" */

        int salary = 60000;
        int creditScore = 700;

        String loanApproval = (salary >= 60000 && creditScore >= 650) ? "Loan Approved" : "Loan Denied";
    }
}
