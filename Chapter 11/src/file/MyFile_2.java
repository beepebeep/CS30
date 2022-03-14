package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile_2 {
	
	private static String fileName = "zzz.txt";
	private static int choice;
	private static Scanner i = new Scanner(System.in);	
	static File f = new File(fileName);
	
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
