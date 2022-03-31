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
		
		//System.out.print("Enter a replacement word or phrase: ");
		//replace = i.next();

		try 
		{
			File f = new File(fileName);
			in = new FileReader(f);
			readF = new BufferedReader(in);
			//out = new FileWriter(f);
			//writeF = new BufferedWriter(out);
			
			while((n = readF.readLine()) != null)
			{	
				o += n;
				if(n.contains(find))
				{
					System.out.println("True");
					//n.replace(find, replace);
					//writeF.
				}
				else
				{
					System.out.println("False");
				}
			}
			
			System.out.println(o);
			
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		
		
		
	}

}
