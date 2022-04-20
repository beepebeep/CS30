package localBank;

import java.util.Scanner;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName, street, city, province, postalCode;
	private Scanner i = new Scanner(System.in);	

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String st, String ct, String pv, String pc) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;
		street = st;
		city = ct;
		province = pv;
		postalCode = pc;
	}
	
	/*
	 * Asks the user their city and records city in a variable above
	 */
	public void changeCity()
	{
		System.out.print("Enter new city: ");
		city = i.next();
	}

	/*
	 * Asks the user their street and records street in a variable above
	 */
	public void changeStreet()
	{
		System.out.print("Enter new street address: ");
		street = i.next();
	}
	
	/*
	 * Asks the user their province and records province in a variable above
	 */
	public void changeProvince()
	{
		System.out.print("Enter new province: ");
		province = i.next();
	}
	
	/*
	 * Asks the user their postal code and records postal code in a variable above
	 */
	public void changePostalCode()
	{
		System.out.print("Enter new postal code: ");
		postalCode = i.next();
	}
	


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;
		custString = firstName + " " + lastName +  "\n" + street + "," + " " + city + "," + " " +  province + "," + " " + postalCode + "\n";
	 	return(custString);
	}

}
