package phidgetsRover;

import com.phidget22.*;

public class PhidgetsPlant {

	public static void main(String[] args) throws Exception {
		 
		
		//Create
        DigitalOutput pump = new DigitalOutput();
        VoltageRatioInput soil = new VoltageRatioInput();
        
        //Address
        pump.setHubPort(1);
        pump.setIsHubPortDevice(true);
        
        //Open
        pump.open(1000);
        soil.open(1000);
        
        //Use your Phidgets
        double S;

        while(true)
        {
        	
        	S = soil.getVoltageRatio();
        	
        	if (S < 0.700)
        	{
        		
            	pump.setState(true);
            	Thread.sleep(5000);
            	pump.setState(false);
            }
        	
        	Thread.sleep(500);	
        }
        
        
	}

}
