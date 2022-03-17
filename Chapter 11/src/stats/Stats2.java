package stats;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stats2 {

	static File f = new File("test2.dat");
	static FileReader in;
	static FileWriter out;
	static BufferedReader readF;
	static BufferedWriter writeF;
	private static int i = 0;
	private static double average, g1, g2, g3, g4, max, min, grade;
	private static String[] info = new String[8]; 
	private static String n, student;
	private static Scanner s = new Scanner(System.in);	
	
	
	public static void write()
	{
		
		try
		{
			out = new FileWriter(f);
			writeF = new BufferedWriter(out);
			
			System.out.print("How many students' info do you want to enter?: ");
			i = s.nextInt();
			
			for (int o = 0; o < i; o++)
			{
				System.out.print("Enter student name: ");
				student = s.next();
				
				System.out.print("Enter grade: ");
				grade = s.nextDouble();
				
				writeF.write(student);
				writeF.newLine();
				writeF.write(Double.toString(grade));
				writeF.newLine();
			}
			
			writeF.close();
			out.close();
			System.out.println("Data written to file\n");
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		
		getInfo();
	}
	
	public static void getInfo()
	{
		try 
		{
			in = new FileReader(f);
			readF = new BufferedReader(in);
			int o = 0;
			while((n = readF.readLine()) != null)
			{
				info[o] = n;
				
				if (o % 2 == 0)
				{
					System.out.println(info[o].toString());
				}
				else
				{
					System.out.println("Grade: " + info[o].toString() + "%");
				}
				o += 1;
			}
		}
		catch (IOException e)
		{
			System.out.println("Error");
		}		
		
		calculateAve();
	} 
	
	
	public static void calculateAve()
	{	
		int o = 0;
		while (o % 2 == 0 )
		System.out.println(info[1]);
		System.out.println(info[3]);
		System.out.println(info[5]);
		System.out.println("average: " + average);
		average = average / i;
		
		System.out.println("\nAverage = " + average + "%");
		
		//high();
	}
	
	public static void high()
	{
		
		if (g1 > g2 && g1 > g3 && g1 > g4)
		{
			max = g1;
		}
		else if(g2 > g1 && g2 > g3 && g2 > g4)
		{
			max = g2;
		}
		else if(g3 > g1 && g3 > g2 && g3 > g4)
		{
			max = g3;
		}
		else if(g4 > g1 && g4 > g2 && g4 > g3)
		{
			max = g4;
		}
		
		System.out.println("Highest Grade = " + max + "%");
		
		low();
	}
	
	public static void low()
	{
		if (g1 < g2 && g1 < g3 && g1 < g4)
		{
			min = g1;
		}
		else if(g2 < g1 && g2 < g3 && g2 < g4)
		{
			min = g2;
		}
		else if(g3 < g1 && g3 < g2 && g3 < g4)
		{
			min = g3;
		}
		else if(g4 < g1 && g4 < g2 && g4 < g3)
		{
			min = g4;
		}
		
		System.out.println("Lowest Grade = " + min + "%");
	}
	
	public static void main(String[] args) 
	{
		write();
	}

}
