
public class Hockey {

	

	public static void main(String[] args) 
	{
		Puck ice = new Puck(4.3);
		Puck puck1 = new Puck(5.3);
		Puck puck2 = new Puck(3.8);
		
		System.out.println("Puck weight: " + ice.getWeight());
		System.out.println("Puck Division: " + ice.getDivision());
		
		
		if (puck1.equals(puck2))
		{
			System.out.println("The objects are equal");
		}
		else
		{
			System.out.println("The objects are not equal");
		}
		
		if (puck1.compareTo(puck2) == 0)
		{
			System.out.println("The weight of the two objects is the same");
		}
		else if (puck1.compareTo(puck2) < 0)
		{
			System.out.println("puck 1 is lighter than puck 2");
		}
		else
		{
			System.out.println("puck 1 is heavier than puck 2");
		}
		
		System.out.println(puck1);
		System.out.println(puck2);
	}

}

/*
Output:

Puck weight: 4.3
Puck Division: a youth division puck
The objects are not equal
puck 1 is heavier than puck 2
The puck has a weight of 5.3 and therefore, is a standard division puck.
The puck has a weight of 3.8 and therefore, is not a youth puck or a standard puck.

*/