package phitgetScale;

import com.phidget22.*;

public class PhitgetScale {
	
	public static void main(String[] args) throws Exception
	{
		VoltageRatioInput scale = new VoltageRatioInput();
		scale.open(1000);
		double offsetValue = 0;
		int i = 0;
	
		
		while(i < 64)
		{
			System.out.println("Calculating average offset value...");
			Thread.sleep(2000);
			
			while(i < 64)
			{
				offsetValue += scale.getVoltageRatio();
				i++;
			}
			
		}
		
		offsetValue /= 64;
		
		while(true)
		{
			double weight = 23844 * (scale.getVoltageRatio() - offsetValue);
			
			//weight *= 1000;
			
			System.out.println(String.format("%.3f kg", weight));
			
			Thread.sleep(250);
		}
	}
}
