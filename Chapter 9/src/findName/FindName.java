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
	
	/*
	 * Main method 
	 */
	public static void main(String[] args) 
	{
		/*Enter number of names*/
		System.out.print("How many names do you want to enter?: ");
		numNames = s.nextInt();
		String[] names = new String[numNames];
		
		/*Enter names and create array*/
		for (int i = 0; i < numNames; i++)
		{
			System.out.print("Enter name: ");
			
			names[i] = s.next();

		}
		
		/*Enter name to search for*/
		System.out.print("Enter a name to search for: ");
		searchName = s.next();
		
		/*Find name in array*/
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

/*Screen Dump:
 * 
 *  	How many names do you want to enter?: 3
		Enter name: Bob
		Enter name: Mark
		Enter name: William
		Enter a name to search for: Mark
		The first occurrence of the name is in index: 1
 */
