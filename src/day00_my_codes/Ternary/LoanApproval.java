package day00_my_codes.Ternary;

public class LoanApproval {
    public static void main(String[] args) {
        /** TERNARY - TRY USE SCANNER FOR EACH VARIABLE - SALARY AND SCORE. THEN DO TERNARY BASED ON BOTH RESULTS. CAN I DO && IN TERNARY CONDITION??????
         [Eligible to get Loan]
         Given two values: yearly salary and credit score determine if you can get a loan.
         To be approved for the loan, print: "Loan Approved":
         Salary: above 60,000
         Credit Score: above 650
         Otherwise print: "Loan Denied" */

        int salary = 120000;
        int creditScore = 800;

        String loanApproval = (salary > 60000 && creditScore > 650) ? "Loan Approved" : "Loan Denied";
        System.out.println(loanApproval);

    }
}
