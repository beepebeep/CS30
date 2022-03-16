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
	private static double average, g1, g2, g3, g4, max, min , w1, w2, w3 , w4;
	private static String[] info = new String[8];
	private static String n, s1, s2, s3, s4;
	private static Scanner s = new Scanner(System.in);	
	
	
	public static void write()
	{
		
		try
		{
			out = new FileWriter(f);
			writeF = new BufferedWriter(out);
			
			System.out.print("Enter the name of the first student: ");
			s1 = s.nextLine();
			
			
			System.out.print("Enter their grade: ");
			w1 = s.nextDouble();
			
			
			System.out.print("\nEnter the name of the second student: ");
			s1 = s.nextLine();
			
			
			System.out.print("Enter their grade: ");
			w2 = s.nextDouble();
			
			
			System.out.print("\nEnter the name of the third student: ");
			s1 = s.nextLine();

			
			System.out.print("Enter their grade: ");
			w3 = s.nextDouble();
			
			
			System.out.print("\nEnter the name of the fourth student: ");
			s1 = s.nextLine();
			
			
			System.out.print("Enter their grade: ");
			w4 = s.nextDouble();
			
			
			System.out.println(s1 + " " + w1 + " " + s2 + " " + w2 + " " + s3 + " " + w3 + " " + s4 + " " + w4);
			
			/*writeF.write(s1);
			writeF.newLine();
			writeF.write(String.valueOf(w1));
			writeF.newLine();
			
			writeF.write(s2);
			writeF.newLine();
			writeF.write(String.valueOf(w2));
			writeF.newLine();
			
			writeF.write(s3);
			writeF.newLine();
			writeF.write(String.valueOf(w3));
			writeF.newLine();
			
			writeF.write(s4);
			writeF.newLine();
			writeF.write(String.valueOf(w4));*/
			
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		
		
		
		//getInfo();
	}
	
	public static void getInfo()
	{
		try 
		{
			in = new FileReader(f);
			readF = new BufferedReader(in);
			
			while((n = readF.readLine()) != null)
			{
				info[i] = n;
				i += 1;
			}
		}
		catch (IOException e)
		{
			System.out.println("Error");
		}
		
		
		System.out.println(info[0].toString() + "\n Grade: " + info[1].toString() + "%");
		System.out.println("\n" + info[2].toString() + "\n Grade: " + info[3].toString() + "%");
		System.out.println("\n" + info[4].toString() + "\n Grade: " + info[5].toString() + "%");
		System.out.println("\n" + info[6].toString() + "\n Grade: " + info[7].toString() + "%");
		
		calculateAve();
	} 
	
	
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
