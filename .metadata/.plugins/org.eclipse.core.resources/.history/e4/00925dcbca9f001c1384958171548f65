package vehicle;

public class Minivan extends Vehicle{
	
	/**
	 * Create a minivan object
	 * 
	 * @param fECity
	 * @param fEHwy
	 * @param seating
	 * @param cargo
	 */
	public Minivan(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	/*
	 * Create a string for the cargo 
	 */
	@Override
	String cargoContainer() 
	{
		String cargoString = ("Cargo container type: Bed, with a capacity of: " + super.getCargoVolume() + "L.");
		return (cargoString);
	}
	
	
	/*
	 * Create a string for the description of the vehicle
	 */
	@Override
	String description() 
	{
		String carDesc = (" Vans are typically used for hauling around people and their stuff. \nWith up to 8 seats, and a roomy interior, they're great for families with many or even few children.");
		return carDesc;
	}
	
	
	/*
	 * Return a string detailing all the info of the vehicle
	 */
	public String toString()
	{
		String vanString;
		
		vanString = "Fuel Economy: " + super.getFECity() + " City, " + super.getFEHwy() + " Highway. \n";
		vanString += "Seating: " + super.getSeating() + "\n";
		vanString += cargoContainer();
		vanString += description();
		
		return vanString;
	}

}
