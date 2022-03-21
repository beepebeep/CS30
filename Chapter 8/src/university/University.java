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

/* Screen Dump
 * 
 * 		Enter the Employee Name: Mark

		Enter the Salary: $50000
		
		Enter '1' for faculty or '2' for staff: 1
		
		Enter the department name: Engineering
		
		The employee name is Mark and their salary is $50000.00. They are a faculty employee and part of the Engineering department.
		
	or:
	
		Enter the Employee Name: Mark

		Enter the Salary: $100000
		
		Enter '1' for faculty or '2' for staff: 2
		
		Enter the job title: Janitor
		
		The employee name is Mark and their salary is $100000.00. They are part of the staff and their job title is: Janitor.
*/
