import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		int counter = 0, constant;
		String choice;
		
		
		Double[] grades = new Double[10];
		constant = 10 - 1;
		
		for(int i = 0; i < 10; i++)
		{
			grades[i] = (double) Math.round((Math.random() * 100 + 1));
		}
		
		System.out.println(Arrays.toString(grades));
		
		
		System.out.println("Enter 'i' to insert a number into the array or any other key to quit.");
		choice = input.next();
		
		while (choice.equals("i"))
		{
				while(counter != constant)
				{
					grades[constant - counter] = grades[(constant - counter) - 1];
					counter++;
				}
				counter = 0;
				
				grades[0] = (double) Math.round((Math.random() * 100 + 1));
				
				System.out.println(Arrays.toString(grades));
				System.out.println("Enter 'i' to insert a number into the array or any other key to quit.");
				choice = input.next();
		}
		input.close();
	}
		
	

		//System.out.println(Arrays.toString(grades));
	}

