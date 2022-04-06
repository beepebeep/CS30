package squares;

public class Squares {

	private static int[] squares = new int[5]; 
	
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5; i++)
		{
			squares[i] = i * i;
			System.out.println("Index " + i + " = " + squares[i]);
		}
		
	}

}

/* Screen Dump:
 * 
 * 		Index 0 = 0
		Index 1 = 1
		Index 2 = 4
		Index 3 = 9
		Index 4 = 16
 */
