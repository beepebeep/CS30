package vehicle;

public class Car extends Vehicle
{

	/**
	 * Create a Car object
	 * 
	 * @param fECity
	 * @param fEHwy
	 * @param seating
	 * @param cargo
	 */
	public Car(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	

	/*
	 * Create a string for the cargo 
	 */
	@Override
	String cargoContainer() 
	{
		String cargoString = ("Cargo container type: Trunk, with a capacity of: " + super.getCargoVolume() + "L.");
		return (cargoString);
	}

	/*
	 * Create a string for the description of the vehicle
	 */
	@Override
	String description() 
	{
		String carDesc = (" Cars are typically used for point-point driving and daily use, as they are small, fuel efficient and depending on the brand, reliable.");
		return carDesc;
	}
	
	/*
	 * Return a string detailing all the info of the vehicle
	 */
	public String toString()
	{
		String carString;
		
		carString = "Fuel Economy: " + super.getFECity() + " City, " + super.getFEHwy() + " Highway. \n";
		carString += "Seating: " + super.getSeating() + "\n";
		carString += cargoContainer();
		carString += description();
		
		return carString;
	}

}
