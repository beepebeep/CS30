package roster;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Roster {

	String fileName, fName, lName;
	int numStudents;
	private static Scanner i = new Scanner(System.in);
	File f = new File(fileName + ".txt");
	FileWriter out;
	BufferedWriter writeF;
	
	
	public void createFile()
	{
		try 
		{
			
			System.out.print("Give your file a name: ");
			fileName = i.next();
			
			System.out.print("How many students' names do you want to store?: ");
			numStudents = i.nextInt();
			
			out = new FileWriter(f);
			writeF = new BufferedWriter(out);
			
			for (int o = 0; o < numStudents; o++)
			{
				System.out.print("Enter student's first name: ");
				fName = i.next();
				
				System.out.print("Enter student's last name: ");
				lName = i.next();
				
				writeF.write(fName + " " + lName);
				writeF.newLine();
			}			
		
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) 
	{
		

	}

}
