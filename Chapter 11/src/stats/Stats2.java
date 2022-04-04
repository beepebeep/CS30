/*
 * Purpose: Create a Stats application that allows the user to enter the names and grades of the students
 * 			then creates a file 
 */
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

	/*Initialize variables*/
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
	
	/*
	 * Main method, prompt user for the name of the file
	 */
	public static void main(String[] args) 
	{
		System.out.print("What do you want to name the file?: ");
		String fileName = s.next(); 
		File f = new File(fileName);
		write(f);
	}
	
	/*
	 * Ask for the number of students, the name and score of each student and then write all info to files
	 */
	public static void write(File file)
	{
		
		try
		{
			out = new FileWriter(file);
			writeF = new BufferedWriter(out);
			
			System.out.print("How many students' info do you want to enter? (max 20): ");
			i = s.nextInt();
			
			for (int o = 0; o < i; o++)		//Ask name and score for the number of students requested
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
		
		getInfo(file);
	}
	
	/*
	 * Read the info from the newly created file
	 */
	public static void getInfo(File file)
	{
		try 
		{
			in = new FileReader(file);
			readF = new BufferedReader(in);
			int o = 0;
			
			while((n = readF.readLine()) != null)		//read all lines of the file until the end of the file and save to array
			{
				info[o] = n;
				
				if (o % 2 == 0)		//If the counter is even display the name, and if it is odd display the score
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
	
	/*
	 * Calculate the average of all the scores
	 */
	public static void calculateAve()
	{	
		int o = 0;
		int u = 0;
		
		while (info[o] != null)		//reads each index of the array until the end of the array
		{
			if(o % 2 == 0)		//get the scores from the general info array and save them to an array just for the scores
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
	
	/*
	 * Find the highest score
	 */
	public static void high()
	{
		int o = 0;
		max = scores[0];		//max value set to the value of the first index of the array
		
		/*Compare max value to each index. If the index > max, the index becomes the new max and the loop continues until the end of the array*/
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
	
	/*
	 * Find the lowest score
	 */
	public static void low()
	{
		int o = 0;
		min = scores[0];		//min value set to the value of the first index of the array
		
		/*Compare min value to each index. If the index < min, the index becomes the new min and the loop continues until the end of the array*/
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
	
	
	
	/*
	 * Screen Dump:
	 * 
	 *  	What do you want to name the file?: Testing.dat
			How many students' info do you want to enter? (max 20): 2
			Enter student name: a
			Enter Score: 55
			Enter student name: b
			Enter Score: 95
			Data written to file
			
			a
			Score: 55.00%
			b
			Score: 95.00%
			
			Average = 75.00%
			Highest Grade = 95.00%
			Lowest Grade = 55.00%
	 */

}
