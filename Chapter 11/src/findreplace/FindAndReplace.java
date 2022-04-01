package findreplace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindAndReplace {

	private static String fileName, find, replace, n, o;
	private static Scanner i = new Scanner(System.in);	
	static FileReader in;
	static FileWriter out;
	static BufferedReader readF;
	static BufferedWriter writeF;
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the file name: ");
		fileName = i.next();
		
		System.out.print("Enter a search word or phrase: ");
		find = i.next();
		
		System.out.print("Enter a replacement word or phrase: ");
		replace = i.next();

		
		File f = new File(fileName);

		
	
		
		try 
		{
			in = new FileReader(f);
			readF = new BufferedReader(in);			
			fileName = fileName.replace(".", "NEW."); //creates a file name for the new file
			File f2 = new File(fileName);
			out = new FileWriter(f2);
			writeF = new BufferedWriter(out);
			
			
			
			while((n = readF.readLine()) != null)
			{	
				n =  n.replaceAll(find, replace);
				
				writeF.write(n);
				writeF.newLine();
			
			}
		
			readF.close();
			in.close();
			writeF.close();
			out.close();
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		
		
		
	}

}
