
public class BusinessAcct extends Account
{
	double minBal = 500;
	double penalty = 10;

	public BusinessAcct(double bal) 
	{
		super(100, null, null, null, null, null, null);
		bal = super.getBalance();
			
		if (bal < minBal)
		{
			bal = bal - penalty;
		}
	}

}
