/**
 * This program creates a BankLoan object that is used to track loans.
 * The object has a give starting balance, interest rate, and customer name.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/11/2022
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   /**
    * Creates a new BankLoan object with a given customer name 
    * and interest rate.
    *
    * @param customerNameIn the name of the customer
    * @param interestRateIn the interest rate of the loan
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
    * This method borrows an amount from the bank and 
    * updates the balance accordingly.
    * 
    * @param amount the amount to be borrowed
    * @return true if the loan was made, false otherwise
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
    * This method is used to pay the bank. 
    * The amount that is paid is subtracted from the balance. 
    * If the new balance is less than 0, then the balance 
    * becomes 0 and the overcharge is returned. 
    * Otherwise, the new balance is set as the balance.
    * 
    * @param amountPaid the amount being paid to the bank
    * @return the overcharge if there is one, or 0 if not
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }

   /**
    * This method returns the loan balance.
    *
    * @return loan balance
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * This method sets the interest rate for the account.
    *
    * @param interestRateIn The new interest rate for the account.
    * @return True if the interest rate is valid, false otherwise. 
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * This method returns the intrest rate.
    *
    * @return interest rate
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * This method charges interest to the account.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }

   /**
    * This method retuns whether or not the input amount is positive.
    *
    * @param amount input amount
    * @return if input amount is positive
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }

   /**
    * This method returns wheter or not the user is in debt.
    *
    * @param loan Bankloan object
    * @return if the user is in debt
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }

   /**
    * This method returns the number of loans created.
    *
    * @return number of loans created.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }

   /**
    * This method resets the loansCreated counter to 0.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   

   /**
    * This method converts the object data to a string.
    * 
    * @return string of object
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
