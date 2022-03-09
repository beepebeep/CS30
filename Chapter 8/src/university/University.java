/*
 * Purpose: Create a university application to display employee information.
 */
package university;

import java.util.Scanner;

public class University {

	/*
	 * Declare variables
	 */
	static String eName, dName, jTitle;
	static double sal;
	static int choice;
	static Scanner i = new Scanner(System.in);		//open a new scanner
	
	
	/*
	 * Get the employee's information
	 */
	public static void getInfo()
	{
		System.out.print("Enter the Employee Name: ");
		eName = i.nextLine();
		
		System.out.print("\nEnter the Salary: $");
		sal = i.nextDouble();
		
		getJob();
	}
	
	/*
	 * Determine whether the employee is part of the faculty or staff. 
	 */
	public static void getJob()
	{
		System.out.print("\nEnter '1' for faculty or '2' for staff: ");
		choice = i.nextInt();
		
		switch (choice)		//get the department name if faculty or job title if staff.
		{
			case 1:
			{
				System.out.print("\nEnter the department name: ");
				dName = i.next();
				
				Faculty f = new Faculty(dName, eName, sal);
				System.out.println(f.toString());
				break;
			}
			case 2:
			{
				System.out.print("\nEnter the job title: ");
				jTitle = i.next();
				
				Staff s = new Staff(jTitle, eName, sal);
				System.out.println(s.toString());
				break;
			}
			default:		//handle invalid number
			System.out.println("Invalid number entered.");		
			getJob();
			break;
		}
	}
	
	
	public static void main(String[] args) 
	{
		getInfo();
		i.close();

	}

}
