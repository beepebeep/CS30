/*
 * Purpose: Create a MyFile application that prompts the user for the name of a file and then displays 
 * 			a message that indicates whether the file exists or not.
 */
package file;

import java.io.File;
import java.util.Scanner;

public class MyFile_1 {

	/* initialize variables*/
	private static Scanner i = new Scanner(System.in);	
	private static String fileName;
	
	/*
	 * Prompt for a file name and check whether it exists
	 */
	public static void checkFile()
	{
		System.out.print("Enter a file name (try 'hello.txt'): ");
		fileName = i.nextLine();
		
		File f = new File(fileName);
		
		if (f.exists() == true)
		{
			System.out.println("\nThe file exists.");
		}
		else
		{
			System.out.println("\nThe File does not exist.");
		}
			
	}
	public static void main(String[] args) 
	{
		checkFile();
		i.close();
	}

}

/* Screen Dump:
 * 
 * 		Enter a file name (try 'hello.txt'): hello.txt
 *
 * 		The file exists.
 * 
 * or:
 * 
 * 		Enter a file name (try 'hello.txt'): goodbye.txt
 *
 *		The File does not exist.
 */
