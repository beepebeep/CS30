import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

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
		
		
		System.out.println("Enter 'i' to delete a number from the array or any other key to quit.");
		choice = input.next();
		
		while (choice.equals("i"))
		{
				while(counter != constant)
				{
					grades[counter] = grades[counter + 1];
					counter++;
					if(counter == constant)
					{
						grades[counter] = null;
					}
				}
				counter = 0;
				
				System.out.println(Arrays.toString(grades));
				System.out.println("Enter 'i' to delete a number from the array or any other key to quit.");
				choice = input.next();
		}
		input.close();
	}
		
	

		//System.out.println(Arrays.toString(grades));
	}

