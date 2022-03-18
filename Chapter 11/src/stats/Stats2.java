package stats;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Stats2 {

	static File f = new File("test2.dat");
	static FileReader in;
	static FileWriter out;
	static BufferedReader readF;
	static BufferedWriter writeF;
	private static int i = 0;
	private static double average, g1, g2, g3, g4, max, min, grade;
	private static String[] info = new String[20]; 
	private static Double[] scores = new Double[20];
	private static String n, student;
	private static Scanner s = new Scanner(System.in);	
	private static DecimalFormat dc = new DecimalFormat("0.00");
	
	
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
				
				System.out.print("Enter Score: ");
				grade = s.nextDouble();
				
				writeF.write(student);
				writeF.newLine();
				writeF.write(dc.format(grade));
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
					System.out.println("Score: " + dc.format(Double.parseDouble(info[o])) + "%");
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
		int u = 0;
		
		while (info[o] != null)
		{
			if(o % 2 == 0)
			{
				o++;
			}
			else
			{
				average += Double.parseDouble(info[o]);
				scores[u] = Double.parseDouble(info[o]);
				System.out.println(Array.getDouble(scores, u));
				u++;
				o++;
			}
		}
		average = average / i;
		
		System.out.println("\nAverage = " + dc.format(average) + "%");
		
		high();
	}
	
	public static void high()
	{
		for (int o = 0; o < i; o++)
		{
			System.out.println(scores[o]);
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
