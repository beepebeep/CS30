package roster;

import java.io.Serializable;

public class StuName implements Serializable
{
	private String fName, lName;
	
	
	public StuName(String first, String last)
	{
		fName = first;
		lName = last;
	}
	
	public String toString()
	{
		String stuString;
		
		stuString = fName + " " + lName;
		
		return (stuString);
	}

}
