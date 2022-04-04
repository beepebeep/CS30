/*
 * Purpose: Create a MyFile application that creates a file named 'zzz.txt' and then informs the user that the file has been created. 
 * 			It then asks the user whether to keep or delete the file.
 */
package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile_2 {
	
	/*Initialize variables*/
	private static String fileName = "zzz.txt";
	private static int choice;
	private static Scanner i = new Scanner(System.in);	
	static File f = new File(fileName);
	
	/*
	 * Creates the 'zzz.txt' file and displays an error message if there is an error 
	 */
	public static void createFile()
	{		
		try 
		{
			f.createNewFile();
			System.out.println("New file created!");
		} 
		catch (IOException e) 
		{
			System.out.println("Error creating file!");
		}
		
		keepDelete();
	}
	
	/*
	 * Ask whether to keep or delete the file
	 */
	public static void keepDelete()
	{
		System.out.println("Enter '1' to keep file or '2' to delete file");
		choice = i.nextInt();
		
		switch (choice)
		{
			case 1:
			{
				System.out.println("The file has not been deleted.");
				break;
			}
			case 2:
			{
				f.delete();
				System.out.println("The file has been deleted.");
				break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		createFile();
		i.close();
	}

}


/* Screen Dump:
 * 
 * 		New file created!
 *		Enter '1' to keep file or '2' to delete file
 *		1
 *		The file has not been deleted.
 *
 * or:
 * 
 * 		New file created!
 *		Enter '1' to keep file or '2' to delete file
 *		2
 *		The file has been deleted.
 * 
 */
