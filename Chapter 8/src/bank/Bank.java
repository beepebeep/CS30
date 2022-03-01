package bank;
import java.util.Scanner;

public class Bank {


	
	private static String accType, fName, lName, str, city, prov, pst;
	private static double bal;
	static Scanner i = new Scanner(System.in);
	
	public static void getDetails()
	{
		
		System.out.print("Enter your first name: ");
		fName = i.nextLine();
		
		
		//Scanner i2 = new Scanner(System.in);
		System.out.print("\n" + "Enter your last name: ");
		lName = i.nextLine();
		
		
		//Scanner i3 = new Scanner(System.in);
		System.out.print("\n" + "Enter your street: ");
		str = i.nextLine();
		
		
		//Scanner i4 = new Scanner(System.in);
		System.out.print("\n" + "Enter the city: ");
		city = i.nextLine();
		
		
		//Scanner i5 = new Scanner(System.in);
		System.out.print("\n" + "Enter the province: ");
		prov = i.nextLine();
		
		
		//Scanner i6 = new Scanner(System.in);
		System.out.print("\n" + "Enter the postal code: ");
		pst = i.nextLine();
		
		
		
		//System.out.print("\n" + fName + " " + lName + " " + str + " " + city + " " + prov + " " + pst);
		
		Customer cust = new Customer(fName, lName, str, city, prov, pst);
		//System.out.println(cust.toString());
		
		getBalance();
	}
	
	public static void getBalance()
	{
		System.out.print("\n" + "Enter the balance of the account: ");
		bal = i.nextDouble();
		
		accountType();
	}
	
	public static void accountType()
	{
		
		System.out.print("Enter account type ('personal' or 'business'): ");
		accType = i.next();
		i.close();
		
		if (accType == "personal")
		{
			PersonalAcct pAcc = new PersonalAcct(bal, fName, lName, str, city, prov, pst);
			pAcc.toString();
		}
		else if (accType == "business")
		{
			
		}
	}
	
	
	public static void main(String[] args) 
	{
		getDetails();

	}

}
