package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Stats {

	static File f = new File("test1.dat");
	static FileReader in;
	static BufferedReader readF;
	//private int sum, average;
	private static String[] info = new String[8];
	private static String n;
	private static int i = 0;

	public static void getInfo()
	{
		try {
			in = new FileReader(f);
			readF = new BufferedReader(in);
			
			while((n = readF.readLine()) != null)
			{
				info[i] = n;
				i+= 1;
			}
		}
		catch (IOException e)
		{
			System.out.println("Error");
		}
		System.out.println(Arrays.toString(info));
	} 
	
	
	public static void main(String[] args) 
	{
		getInfo();
	}

}
