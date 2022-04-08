package findName;

import java.util.Arrays;
import java.util.Scanner;

public class FindName 
{

	private static Scanner s = new Scanner(System.in);
	private static int numNames, location;
	private static String name, searchName;
	
	public static void main(String[] args) 
	{
		System.out.print("How many names do you want to enter?: ");
		numNames = s.nextInt();
		String[] names = new String[numNames];
		
		
		for (int i = 0; i < numNames; i++)
		{
			System.out.print("Enter name: ");
			name = s.next();
			names[i] = name;
		}
		
		System.out.print("Enter a name to search for: ");
		searchName = s.next();
		
		location = Search.linear(names, searchName);
		System.out.println(location);
		
		/*
		if (location == -1)
		{
			System.out.println("Name not found in array");
		}
		else
		{
			System.out.println("The name is in index: " + location);
		}*/
		
		s.close();
		//System.out.println(Arrays.toString(names));
	}

}
