package roster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Roster {

	static String fileName, lName, fName;
	static StuName n;
	static int numStudents;
	private static Scanner i = new Scanner(System.in);		
	
	public static void main(String[] args) 
	{
		System.out.print("Give your file a name: ");
		fileName = i.next();
		
		System.out.print("How many students' names do you want to store?: ");
		numStudents = i.nextInt();
		System.out.println("");
		
		try 
		{
			File f = new File(fileName + ".dat");
			
			/* Write Objects */
			FileOutputStream out = new FileOutputStream(f);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for (int o = 0; o < numStudents; o++)
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
			
			/*Read Objects*/
			FileInputStream in = new FileInputStream(f);
			ObjectInputStream readStu = new ObjectInputStream(in);
			
			System.out.println("\nClass List: ");
			
			for(int p = 0; p < numStudents; p++)
			{
				StuName name = (StuName)readStu.readObject();
				System.out.println(name);
			}
			
			readStu.close();
			in.close();			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File could not be found!");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Error during input or output stream!");
			System.err.println("IOException: " + e.getMessage());
		}
		
		catch(ClassNotFoundException e)
		{
			System.out.println("Class could not be used!");
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
	}
}
