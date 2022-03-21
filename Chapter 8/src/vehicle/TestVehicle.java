/*
 * Purpose: create a new TestVehicle application to display info for different types of vehicles
 */
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

/* Screen Dump:
 * 
 * 		Enter '1' for Car, '2' for Truck, '3' for minivan: 1
		Fuel Economy: 9 City, 8 Highway. 
		Seating: 5
		Cargo container type: Trunk, with a capacity of: 360.0L. Cars are typically used for point-point driving and daily use, as they are small, fuel efficient and depending on the brand, reliable.
	
	or:
	
		Enter '1' for Car, '2' for Truck, '3' for minivan: 2
		Fuel Economy: 14 City, 12 Highway. 
		Seating: 5
		Cargo container type: Bed, with a capacity of: 1500.0L. Trucks are typically used for towing or carrying large loads. 
		However, they are also very comfortable, making them good vehicles for long distance driving.
		
	or:
	
		Enter '1' for Car, '2' for Truck, '3' for minivan: 3
		Fuel Economy: 13 City, 12 Highway. 
		Seating: 8
		Cargo container type: Bed, with a capacity of: 948.6L. Vans are typically used for hauling around people and their stuff. 
		With up to 8 seats, and a roomy interior, they're great for families with many or even few children.
*/
