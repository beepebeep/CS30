package bank;

public class BusinessAcct extends Account
{
	private double minBal = 500;
	private double balance;

	public BusinessAcct(double bal, String fName, String lName, String str, String city, String prov, String pst) 
	{
		super(bal, fName, lName, str, city, prov, pst);
		balance = bal;
		
	}
	
	public void checkBal()
	{
		if (balance < minBal)
		{
			super.withdrawal(10);
		}
	}

}
