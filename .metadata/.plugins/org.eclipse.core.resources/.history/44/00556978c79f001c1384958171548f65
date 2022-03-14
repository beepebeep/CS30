/*
 * Purpose: Test the functions of the customer, account, personal account and business account classes.
 */
package bank;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Bank {
	
	/*
	 * Declare Variables.
	 */
	private static String accType, fName, lName, str, city, prov, pst;	
	private static double withdrawAmount, depAmount, bal;
	private static int choice;
	static Scanner i = new Scanner(System.in);		//open a new scanner
	
	
	/**
	 * Get details of user (first name, last name, address).
	 */
	public static void getDetails() throws InterruptedException 
	{	
		System.out.print("Enter your first name: ");
		fName = i.nextLine();
		fName = fName.substring(0, 1).toUpperCase() + fName.substring(1);		//converts the first letter of the name to capital
		
		System.out.print("\n" + "Enter your last name: ");
		lName = i.nextLine();
		lName = lName.substring(0, 1).toUpperCase() + lName.substring(1);		
		
		System.out.print("\n" + "Enter your street: ");
		str = i.nextLine();
	
		System.out.print("\n" + "Enter the city: ");
		city = i.nextLine();
		city = city.substring(0, 1).toUpperCase() + city.substring(1);		
		
		System.out.print("\n" + "Enter the province: ");
		prov = i.nextLine();
		prov = prov.substring(0, 1).toUpperCase() + prov.substring(1);		
		
		System.out.print("\n" + "Enter the postal code: ");
		pst = i.nextLine();
		pst = pst.substring(0).toUpperCase();		//converts the entire postal code to capitals
		
		accountType();		//run the next method
	}
	
	
	/*
	 * Ask for the type of the account (personal or business).
	 */
	public static void accountType() throws InterruptedException
	{	
		System.out.print("\n" + "Enter account type ('personal' or 'business'): ");
		accType = i.next();
		
		getOgBalance();		//run the next method.
	}
	
	
	/*
	 * Get the balance of the account and check whether it meets the criteria of the type of account. 
	 */
	public static void getOgBalance() throws InterruptedException
	{
		System.out.print("\n" + "Enter the balance of the account: ");
		bal = i.nextDouble();
		
		if(accType.equals("personal"))		//if it is a personal account and the balance is < 100, re-enter valid balance but otherwise run next method
		{
			if(bal < 100)
			{
				System.out.println("Personal accounts require at least $100 balance.");
				TimeUnit.SECONDS.sleep(2);
				
				getOgBalance();
			}
			else 
			{
				checkAcc();
			}
		}
		else if(accType.equals("business"))		//if it is a business account and the balance is < 500, re-enter valid balance but otherwise run next method
		{
			if(bal < 500)
			{
				System.out.println("Business accounts require at least $500 balance.");
				TimeUnit.SECONDS.sleep(2);
				
				getOgBalance();
			}
			else
			{
				checkAcc();
			}
		}
		else
		{
			System.out.println("No account type selected");
			accountType();
		}
		
	}
	
	
	/*
	 * Check the account type and display the corresponding string.
	 */
	public static void checkAcc() throws InterruptedException
	{
		if (accType.equals("personal"))
		{
			PersonalAcct pAcc = new PersonalAcct(bal, fName, lName, str, city, prov, pst);
			System.out.println(pAcc.toString());
		}
		else if (accType.equals("business"))
		{
			BusinessAcct bAcc = new BusinessAcct(bal, fName, lName, str, city, prov, pst);
			System.out.println(bAcc.toString());
		}
		
		choice();
	}
	
	
	/*
	 * Handle the functions of the bank (deposit, withdraw, check account type and quit).
	 */
	public static void choice() throws InterruptedException
	{
		System.out.println("\n" + "Enter '1' to start a deposit, '2' to start a withdrawal, '3' to check account type or '4' to quit: ");
		choice = i.nextInt();
		Account acc = new Account(bal, fName, lName, str, city, prov, pst);
		
		switch (choice)		
		{
			case 1:		//deposit
				
				System.out.print("Enter amount to deposit: ");
				depAmount = i.nextDouble(); 
				acc.deposit(depAmount);
				bal = acc.getBalance();
				checkAcc();
				break;
				
			case 2:		//withdrawal
			{
				System.out.print("Enter amount to withdraw: ");
				withdrawAmount = i.nextDouble();
				
				if(accType.equals("personal"))		//personal account
				{
					if ((bal - withdrawAmount) < 100)		//check if new balance will be below minimum balance for account
					{
						System.out.println("Withdrawing $" + withdrawAmount + "0 will result in a charge of $2.00. Enter '1' to continue or '2' to stop.");
						int confirm = i.nextInt();
						
						if ((withdrawAmount + 2) > bal)		//check if withdraw amount is more than account balance
						{
							System.out.println("Not Enough Money in Account.");
							TimeUnit.SECONDS.sleep(2);
							
							checkAcc();
						}
						else 
						{
							switch (confirm)		//handle confirmation of penalty
							{
								case 1:
									acc.withdrawal(withdrawAmount + 2);
									System.out.println("$2 penalty charged.");
									TimeUnit.SECONDS.sleep(2);
									break;
									
								case 2:
									checkAcc();
									break;
							}
						}
					}
					else	
					{
						acc.withdrawal(withdrawAmount);
					}
				} 
				else if (accType.equals("business"))		//personal account
				{
					if ((bal - withdrawAmount) < 500)		//check if new balance will be below minimum balance for account
					{
						System.out.println("Withdrawing $" + withdrawAmount + "0 will result in a charge of $10.00. Enter '1' to continue or '2' to stop.");
						int confirm = i.nextInt();
						
						if((withdrawAmount + 10) > bal)		//check if withdraw amount is more than account balance
						{
							System.out.println("Not enough money in account.");
							TimeUnit.SECONDS.sleep(2);
							
							
							checkAcc();
						}
						else
						{
							switch (confirm)		//handle confirmation of penalty
							{
								case 1:
									acc.withdrawal(withdrawAmount + 10);
									System.out.println("$10 penalty charged.");
									TimeUnit.SECONDS.sleep(2);
									break;
									
								case 2:
									checkAcc();
									break;
							}
						}
					}
					else	
					{
						acc.withdrawal(withdrawAmount);
					}
				}
				
				bal = acc.getBalance();		//set new balance
				checkAcc();
				break;
			}
			
			case 3:		//display account type
			{
				System.out.print("Account Type: " + accType);
				TimeUnit.SECONDS.sleep(2);	
				checkAcc();
				break;
			}
			
			
			case 4:		//exit
			{
				System.out.println("Thank you for your business.");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Goodbye.");
				System.exit(0);
				break;
			}
			
			default:		//handle invalid number entered
			{
				System.out.println("Please enter a valid number.");
				TimeUnit.SECONDS.sleep(2);
				checkAcc();
				break;
			}
						
		}
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		getDetails();	//run the first method 
		i.close();		
	}

}
