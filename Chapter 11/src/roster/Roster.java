/*
 * Purpose: Create a roster application that prompts the user for a file name, then the first and last
 * 			name of each student. The data is written to a file and then the application displays each name.
 */
package roster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Roster {

	/*Initialize variables*/
	static String fileName, lName, fName;
	static StuName n;
	static int numStudents;
	private static Scanner i = new Scanner(System.in);		
	
	
	/*
	 * Main method, prompt user for file name
	 */
	public static void main(String[] args) 
	{
		System.out.print("Give your file a name: ");
		fileName = i.next();
		
		File f = new File(fileName + ".dat");
		
		write(f);
	}
	
	
	/*
	 * Write objects to file
	 */
	public static void write(File file)
	{
		try 
		{
			System.out.print("How many students' names do you want to store?: ");
			numStudents = i.nextInt();
			System.out.println("");
			
			FileOutputStream out = new FileOutputStream(file);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for (int o = 0; o < numStudents; o++)		//prompt for first and last name for number of students requested
			{
				System.out.print("Enter student's first name: ");
				fName = i.next();
				
				System.out.print("Enter student's last name: ");
				lName = i.next();
				System.out.println("");
				
				writeStu.writeObject(new StuName(fName, lName));
			}			
		
			System.out.println("Data written to file!");
			writeStu.close();
			out.close();
		}
		catch(IOException e)
		{
			System.out.println("Error during output stream!");
			System.err.println("IOException: " + e.getMessage());
		}
		
		read(file);
	}
	
	/*
	 * Read objects from files
	 */
	public static void read(File file)
	{
		try
		{
			FileInputStream in = new FileInputStream(file);
			ObjectInputStream readStu = new ObjectInputStream(in);
			
			System.out.println("\nClass List: ");
			
			for(int p = 0; p < numStudents; p++)		//read each name from the data in the file
			{
				StuName name = (StuName)readStu.readObject();
				System.out.println(name);
			}
			
			readStu.close();
			in.close();			
		}
		catch(IOException e)
		{
			System.out.println("Error during input stream!");
			System.err.println("IOException: " + e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class could not be used!");
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
		
	}	
}

/* Screen dump:
 * 
 * 		Give your file a name: bugs
		How many students' names do you want to store?: 2
		
		Enter student's first name: Spongebob
		Enter student's last name: Squarepants
		
		Enter student's first name: Patrick
		Enter student's last name: Star
		
		Data written to file!
		
		Class List: 
		Spongebob Squarepants
		Patrick Star

 */
