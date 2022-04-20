/*
 * Purpose: create a LocalBank class to test the functions of the Customer, Account, and Bank classes. 
 */
package localBank;

/*
 * LocalBank.java from Chapter 9
 * Chapter 9 Case Study
 * Lawrenceville Press
 * August 21, 2011
 */

 /**
  * A bank where accounts can be opened or closed and customers can
  * make transactions.
  */

 import java.util.Scanner;

 public class LocalBank {

	public static void main(String[] args) {
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action, acctID;
		Double amt;

		/* display menu of choices */
		do {
			System.out.println("\nDeposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account\\Modify account");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();

			if (action.equalsIgnoreCase("A")) 
			{
				easySave.addAccount();
			} 
			else if (!action.equalsIgnoreCase("Q")) 
			{
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				} else if (action.equalsIgnoreCase("M")) {
					easySave.modifyAccount(acctID);
				}
			}
		} while (!action.equalsIgnoreCase("Q"));
		input.close();
	}
}
 
 /*Screen Dump:
  * 
  * 
		Deposit\Withdrawal\Check balance
		Add an account\Remove an account\Modify account
		Quit
		
		Enter choice: a
		First name: Bob
		Last name: Marley
		Street: 123 Smooth Street
		City: Kingston
		Province: Alberta
		Postal Code: T3K4M3
		Beginning balance: 500
		Account created. Account ID is: BMarley
		
		Deposit\Withdrawal\Check balance
		Add an account\Remove an account\Modify account
		Quit
		
		Enter choice: c
		Enter account ID: BMarley
		BMarley
		Bob Marley
		123 Smooth Street, Kingston, Alberta, T3K4M3
		Current balance is $500.00
		
		Deposit\Withdrawal\Check balance
		Add an account\Remove an account\Modify account
		Quit
		
		Enter choice: d
		Enter account ID: 
		BMarley
		Enter deposit amount: 500
		BMarley
		Bob Marley
		123 Smooth Street, Kingston, Alberta, T3K4M3
		Current balance is $1,000.00
		
		Deposit\Withdrawal\Check balance
		Add an account\Remove an account\Modify account
		Quit
		
		Enter choice: 
  * 
  * 
  */
  