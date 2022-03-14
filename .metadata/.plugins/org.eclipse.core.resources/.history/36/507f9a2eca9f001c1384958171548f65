package hockey;

public class Puck extends Disk
{

	private double weight;
	private boolean standard;
	private boolean youth;
	
	private double minStandard = 5;
	private double maxStandard = 5.5;
	private double minYouth = 4;
	private double maxYouth = 4.5;
	
		
	public Puck(double w) 
	{
		super(w, 1.5);
		weight = w;
		
		if (w >= minStandard && w <= maxStandard)
		{
			standard = true;
		}
		else if (w >= minYouth && w <= maxYouth)
		{
			youth = true;
		}
	}
	
	
	public double getWeight()
	{
		return weight;
	}
	
	
	public String getDivision()
	{
		if (standard == true)
		{
			return ("a standard division puck");
		}
		else if(youth == true)
		{
			return ("a youth division puck");
		}
		else 
		{
			return("not a youth puck or a standard puck");
		}
			
	}

	
	
	public boolean equals(Object obj) {
		Puck testObj = (Puck)obj;
		
	 	if (testObj.getDivision() == getDivision() && 
	 		testObj.getWeight() == weight) {
			return(true);
		} else {
			return(false);
		}
	}
	
	
	
	public String toString()
	{
		String puckString;
		
		puckString = "The puck has a weight of " + weight + " and therefore, is " + getDivision() + ".";
		
		return puckString;
	}
	
	public int compareTo(Object p)
	{
		Puck testPuck = (Puck)p;
		
		if (weight < testPuck.getWeight())
		{
			return -1;
		}
		else if (weight == testPuck.getWeight())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
}
