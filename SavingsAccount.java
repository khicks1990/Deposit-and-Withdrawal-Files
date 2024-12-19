/**
   The SavingsAccount class stores data about a savings account
   for the Deposit and Withdrawal Files programming challenge.
*/

public class SavingsAccount
{
   private double balance;          // The account balance
   private double interestRate;     // The annual interest rate
   private double lastInterest;     // Last amount of interest earned

   /**
      The constructor initializes an object with a
      balance and an annual interest rate.
      @param bal The account balance.
      @param intRate The annual interest rate.
   */

   public SavingsAccount(double bal, double intRate)
   {
      balance = bal;
      interestRate = intRate;
      lastInterest = 0.0;
   }

   /**
      The withdraw method withdraws an amount from
      the account.
      @param amount The amount to withdraw.
   */

   public void withdraw(double amount)
   {
      balance -= amount;
   }
   
   /**
      The deposit method deposits an amount into
      the account.
      @param amount The amount to deposit.
   */

   public void deposit(double amount)
   {
      balance += amount;
   }

   /**
      The addInterest method calculates the monthly
      interest and adds it to the account balance.
   */

   public void addInterest()
   {
      // Get the monthly interest rate.
      double monthlyInterestRate = interestRate / 12;
      
      // Calculate the last amount of interest earned.
      lastInterest = monthlyInterestRate * balance;
      
      // Add the interest to the balance.
      balance += lastInterest;
   }

   /**
      The getBalance method returns the account balance.
      @return The account balance.
   */

   public double getBalance()
   {
      return balance;
   }

   /**
      The getInterestRate method returns the annual
      interest rate.
      @return The annual interest rate.
   */

   public double getInterestRate()
   {
      return interestRate;
   }

   /**
      The getLastInterest method returns the last amount
      of interest earned.
      @return The last amount of interest earned.
   */

   public double getLastInterest()
   {
      return lastInterest;
   }

}
