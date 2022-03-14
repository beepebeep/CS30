package vehicle;

import java.util.Scanner;

public class TestVehicle {
	
	/*
	 * Declare variables
	 */
	private static int choice;
	private static Scanner i = new Scanner(System.in);	
	private static Car c = new Car(9, 8, 5, 360);
	private static Truck t = new Truck(14, 12, 5, 1500);
	private static Minivan m = new Minivan(13, 12, 8, 948.6);
	
	
	/*
	 * Display the info for the type of vehicle selected.
	 */
	public static void disp()
	{
		System.out.print("Enter '1' for Car, '2' for Truck, '3' for minivan: ");
		choice = i.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println(c.toString());		//car
				break;
			}
			case 2: 
			{
				System.out.println(t.toString());		//truck
				break;
			}
			case 3:
			{
				System.out.println(m.toString());		//minivan
				break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		disp();
		i.close();
	}

}
