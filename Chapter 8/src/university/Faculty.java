/*
 * Purpose: Create a Faculty class that inherits UEmployee and returns the department name.
 */
package university;

public class Faculty extends UEmployee 
{
	/*
	 * Declare variables
	 */
	String departmentName;
	
	/*
	 * Create a new Faculty object
	 */
	public Faculty(String depName, String n, Double s)
	{
		super(n, s);
		departmentName = depName;
	}
	
	/*
	 * Return the department name
	 */
	public String getDepName()
	{
		return departmentName;
	}
	
	/*
	 * Return the info as a string
	 */
	public String toString()
	{
		String facultyString;
		
		facultyString = super.toString();
		facultyString += " They are a faculty employee and part of the " + getDepName() + " department.";
		
		return facultyString;
	}
	
}
