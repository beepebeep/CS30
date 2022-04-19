package findName;


/*
 * Search.java
 */
 
 public class Search {

	/**
	 * Returns the index of the element numToFind in array array.
	 * -1 returned if element not found.
	 * pre: none
	 * post: index of numToFind has been returned. -1 has been
	 * returned if element not found.
	 */
	public static int linear(int[] array, int numToFind) 
	{
		int index = 0;
		
		while ((array[index] != numToFind) && (index < array.length - 1)) {
			index += 1;
		}
		
		if (array[index] == numToFind) {
			return(index);
		} else {
			return(-1);
		}
	}
	
	public static int linear(String[] sArray, String stringToFind)
	{
		int i = 0;
		
		while (!(sArray[i].equals(stringToFind)) && (i < sArray.length - 1)) {
			i += 1;
		}
		
		if (sArray[i].equals(stringToFind)) {
			return(i);
		} else {
			return(-1);
		}
	}
		
}