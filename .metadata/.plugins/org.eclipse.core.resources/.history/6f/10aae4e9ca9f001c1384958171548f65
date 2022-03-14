package vehicle;

public class Truck extends Vehicle{

	/**
	 * Create a truck object 
	 * 
	 * @param fECity
	 * @param fEHwy
	 * @param seating
	 * @param cargo
	 */
	public Truck(int fECity, int fEHwy, int seating, double cargo) 
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
		String carDesc = (" Trucks are typically used for towing or carrying large loads. \nHowever, they are also very comfortable, making them good vehicles for long distance driving.");
		return carDesc;
	}
	
	
	/*
	 * Return a string detailing all the info of the vehicle
	 */
	public String toString()
	{
		String truckString;
		
		truckString = "Fuel Economy: " + super.getFECity() + " City, " + super.getFEHwy() + " Highway. \n";
		truckString += "Seating: " + super.getSeating() + "\n";
		truckString += cargoContainer();
		truckString += description();
		
		return truckString;
	}

}
