package stats;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Stats2 {

	static File f = new File("test2.dat");
	static FileReader in;
	static FileWriter out;
	static BufferedReader readF;
	static BufferedWriter writeF;
	private static int i = 0;
	private static double average, max, min, grade;
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
			
			System.out.print("How many students' info do you want to enter? (max 20): ");
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
			TimeUnit.SECONDS.sleep(2);
		}
		catch(IOException | InterruptedException e)
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
		int o = 0;
		max = scores[0];
		
		while (scores[o] != null)
		{
			if (scores[o] > max)
			{
				max = scores[o];
			}
			o++;
		}
		
		System.out.println("Highest Grade = " + dc.format(max) + "%");
		
		low();
	}
	
	public static void low()
	{
		int o = 0;
		min = scores[0];
		
		while (scores[o] != null)
		{
			if (scores[o] < min)
			{
				min = scores[o];
			}
			o++;
		}
		
		System.out.println("Lowest Grade = " + dc.format(min) + "%");
	}
	
	public static void main(String[] args) 
	{
		write();
	}
	
	
	
	/*
	 * Screen Dump:
	 * 
	 *  	How many students' info do you want to enter?: 5
	 *		Enter student name: a
	 *		Enter Score: 43
	 *		Enter student name: b
	 *		Enter Score: 43
	 *		Enter student name: c
	 *		Enter Score: 66
	 *		Enter student name: d
	 *		Enter Score: 98
	 *		Enter student name: e
	 *		Enter Score: 76
	 *		Data written to file
	 *	
	 *		a
	 *		Score: 43.00%
	 *		b
	 *		Score: 43.00%
	 *		c
	 *		Score: 66.00%
	 *		d
	 *		Score: 98.00%
	 *		e
	 *		Score: 76.00%
	 *	
	 *		Average = 65.20%
	 *		Highest Grade = 98.00%
	 *		Lowest Grade = 43.00%
	 */

}
