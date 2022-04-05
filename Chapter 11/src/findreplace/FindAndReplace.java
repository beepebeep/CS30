/*
 * Purpose: Create a FindAndReplace application that prompts the user for a file name, search word/phrase and a replacement word/phrase.
 * 			The application searches the specified file for all occurrences of the search word and replaces them with the replacement word.
 */
package findreplace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindAndReplace {

	/*Initialize variables*/
	private static String fileName, find, replace, n;
	private static Scanner i = new Scanner(System.in);	
	static FileReader in;
	static FileWriter out;
	static BufferedReader readF;
	static BufferedWriter writeF;
	

	public static void main(String[] args) 
	{
		/*Get info*/
		System.out.print("Enter the file name: ");
		fileName = i.next();
		
		System.out.print("Enter a search word or phrase: ");
		find = i.next();
		
		System.out.print("Enter a replacement word or phrase: ");
		replace = i.next();

		
		File f = new File(fileName);		//create file

		try 
		{
			in = new FileReader(f);
			readF = new BufferedReader(in);		
			
			fileName = fileName.replace(".", "NEW."); //creates a file name for the new file
			File f2 = new File(fileName);		//create a new file for the new text
			out = new FileWriter(f2);
			writeF = new BufferedWriter(out);
			
			
			while((n = readF.readLine()) != null)
			{	
				n = n.replaceAll(find, replace);
				
				writeF.write(n);
				writeF.newLine();
			}
			
			System.out.println("Replaced! " + fileName + (" created!"));
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

/* Screen Dump:
 * 
 * 		Enter the file name: Words.txt
		Enter a search word or phrase: the
		Enter a replacement word or phrase: yup
		Replaced! WordsNEW.txt created!
 * 
 */
 
