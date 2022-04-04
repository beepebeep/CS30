/*
 * Purpose: Create a stats application that reads names and scores from the 'test1.dat' file and 
 * 			displays each name and score. The average, highest and lowest scores are then displayed.
 */
package stats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Stats1 {

	/*Initialize variables*/
	static File f = new File("test1.dat");
	static FileReader in;
	static BufferedReader readF;
	private static int i = 0;
	private static double average, g1, g2, g3, g4, max, min;
	private static String[] info = new String[8];
	private static String n;
	
	/*
	 * Get the student info from the file
	 */
	public static void getInfo()
	{
		try 
		{
			in = new FileReader(f);
			readF = new BufferedReader(in);
			
			while((n = readF.readLine()) != null)		//reads each line of the file until the end of the file
			{
				info[i] = n;		//store each piece of info in an array
				i += 1;
			}
		}
		catch (IOException e)
		{
			System.out.println("Error");
		}
		
		/*Display the formatted info*/
		System.out.println(info[0].toString() + "\n Grade: " + info[1].toString() + "%");
		System.out.println("\n" + info[2].toString() + "\n Grade: " + info[3].toString() + "%");
		System.out.println("\n" + info[4].toString() + "\n Grade: " + info[5].toString() + "%");
		System.out.println("\n" + info[6].toString() + "\n Grade: " + info[7].toString() + "%");
		
		calculateAve();
	} 
	
	/*
	 * Calculate the average
	 */
	public static void calculateAve()
	{
		g1 = Double.parseDouble(info[1].toString());
		g2 = Double.parseDouble(info[3].toString());
		g3 = Double.parseDouble(info[5].toString());
		g4 = Double.parseDouble(info[7].toString());
		
		average =  (g1 + g2 + g3 + g4) / 4;
		
		System.out.println("\nAverage = " + average + "%");
		
		high();
	}
	
	/*
	 * Find the highest grade and display it
	 */
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
	
	/*
	 * Find the lowest grade and display it
	 */
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
		getInfo();
	}

}

/* Screen Dump:
 * 
 * 		Spongebob Squarepants
 *		Grade: 85%
 *
 *		Patrick Star
 *		Grade: 15%
 *
 *		Sandy Cheeks
 *		Grade: 99%
 *
 *		Plankton
 *		Grade: 90%
 *
 *		Average = 72.25%
 *		Highest Grade = 99.0%
 *		Lowest Grade = 15.0%
 *
 */
