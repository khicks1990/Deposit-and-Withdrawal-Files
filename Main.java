import java.io.*;
import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Deposit and Withdrawl Files programming challenge.
*/

public class Main
{
   public static void main(String args[]) throws IOException
   {
      double interestRate;       // Annual interest rate
      double interestEarned;     // Interest earned
      double amount;             // Amount of a deposit or withdrawal

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the annual interest rate.
      System.out.print("Enter the savings account's " +
                       "annual interest rate: ");
      interestRate = keyboard.nextDouble();

      // Create a SavingsAccount object.
      SavingsAccount savings =
             new SavingsAccount(500.0, interestRate);

      // Open the Deposits.txt file.
      File file = new File("Deposits.txt");
      Scanner inFile = new Scanner(file);

      // Get the deposits from the Deposits.txt file.
      while (inFile.hasNext())
      {
         amount = inFile.nextDouble();
         savings.deposit(amount);
      }
      inFile.close();      // Close the Deposits.txt file.

      // Open the Withdrawals.txt file.
      file = new File("Withdrawals.txt");
      inFile = new Scanner(file);

      // Get the withdrawals from the Withdrawals.txt file.
      while (inFile.hasNext())
      {
         amount = inFile.nextDouble();
         savings.withdraw(amount);
      }
      inFile.close();      // Close the Withdrawals.txt file.

      // Get the balance before adding interest.
      double balBefore = savings.getBalance();

      // Add the interest.
      savings.addInterest();

      // Get the interest earned.
      interestEarned = savings.getLastInterest();

      // Display the interest earned and the balance.
      System.out.printf("Interest earned: $%,.2f\n",
                        interestEarned);
      System.out.printf("Ending balance: $%,.2f\n",
                        savings.getBalance());
   }
}
