/*
 * Purpose: Create an application that searches a text file for a search word or phrase and replaces it with a replacement word or phrase.
 */
package findName;

import java.util.Scanner;

public class FindName 
{

	private static Scanner s = new Scanner(System.in);
	private static int numNames, location;
	private static String searchName;
	
	public static void main(String[] args) 
	{
		System.out.print("How many names do you want to enter?: ");
		numNames = s.nextInt();
		String[] names = new String[numNames];
		
		
		for (int i = 0; i < numNames; i++)
		{
			System.out.print("Enter name: ");
			
			names[i] = s.next();

		}
		
		System.out.print("Enter a name to search for: ");
		searchName = s.next();
		
		location = Search.linear(names, searchName);
	
		if (location == -1)
		{
			System.out.println("Name not found in array");
		}
		else
		{
			System.out.println("The first occurrence of the name is in index: " + location);
		}
		
	}

}
