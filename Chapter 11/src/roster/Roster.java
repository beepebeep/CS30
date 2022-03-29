package roster;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Roster {

	static String fileName, lName, fName, n;
	static int numStudents;
	private static Scanner i = new Scanner(System.in);
	
	public static void File()
	{
		System.out.print("Give your file a name: ");
		fileName = i.next();
		
		System.out.print("How many students' names do you want to store?: ");
		numStudents = i.nextInt();
		
		File f = new File(fileName + ".txt");
		FileWriter out;
		BufferedWriter writeF;
		FileReader in;
		BufferedReader readF;
		
		try 
		{
			out = new FileWriter(f);
			writeF = new BufferedWriter(out);
			in = new FileReader(f);
			readF = new BufferedReader(in);
			
			for (int o = 0; o < numStudents; o++)
			{
				System.out.print("Enter student's first name: ");
				fName = i.next();
				
				System.out.print("Enter student's last name: ");
				lName = i.next();
				System.out.println("");
				
				writeF.write(fName + " " + lName);
				writeF.newLine();
			}			
		
			System.out.println("Data written to file!");
			writeF.close();
			out.close();
			
			System.out.println("\nClass List: ");
			while ((n = readF.readLine()) != null)
			{
				System.out.println(n);			
			}
				
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) 
	{
		File();
	}

}
