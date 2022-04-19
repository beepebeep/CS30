/*
 * Purpose: Create a squares application that stores the square of an element's index in an integer array. The 
 * 			application then displays the value of each index in the array. 
 */
package squares;

import java.util.Scanner;

public class Squares {
	
	private static Scanner i = new Scanner(System.in);	
	private static int num;
	
	
	/*
	 * Main method
	 */
	public static void main(String[] args) 
	{
		System.out.print("How many indexes in the array?: ");
		num = i.nextInt();		//store number of indexes
		
		int[] squares = new int[num];		//create array with number of indexes
		
		/*for all indexes of the array, square the index number and store the value in the corresponding index*/
		for(int i = 0; i < num; i++)
		{
			squares[i] = i * i;
			System.out.println("Index " + i + " = " + squares[i]);
		}
		
	}

}

/* Screen Dump:
 * 
 * 		How many indexes in the array?: 
		10
		Index 0 = 0
		Index 1 = 1
		Index 2 = 4
		Index 3 = 9
		Index 4 = 16
		Index 5 = 25
		Index 6 = 36
		Index 7 = 49
		Index 8 = 64
		Index 9 = 81
 */
