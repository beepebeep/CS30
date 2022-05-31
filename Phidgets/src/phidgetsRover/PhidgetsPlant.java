package phidgetsRover;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.phidget22.*;

public class PhidgetsPlant 
{

	public static void main(String[] args) throws Exception 
	{
		Net.addServer("", "192.168.100.1", 5661, "", 0);
		
		//Create
        DigitalOutput pump = new DigitalOutput();
        VoltageRatioInput soil = new VoltageRatioInput();
        
        //Address
        pump.setHubPort(1);
        pump.setIsHubPortDevice(true);
        
        //Open
        pump.open(1000);
        soil.open(1000);
        
        //Set date format
        SimpleDateFormat timeSet = new SimpleDateFormat("HH:mm");
        
        //Use Phidgets
        while(true)
        {
        	Date date = new Date();
        	double S = soil.getVoltageRatio();
        	String time = timeSet.format(date), waterTime = "11:11";
        	
        	System.out.print(time + " - ");

        	if (S<0.355) 
            {
    			System.out.println("Plant Status: Dry AF");          	          
            }
      	    else 
            {
      	    	System.out.println("Plant Status: Wet");	
            } 
        	
        	if(time.equals(waterTime))
        	{    	          
        		if (S<0.355) 
	            {
        			System.out.println("Plant Status: Dry AF");
	            		
	    	    	pump.setState(true);
	          	    Thread.sleep(2000);
	          	    pump.setState(false);
	          	          
	            }
	      	    else 
	            {
	      	    	System.out.println("Plant Status: Wet");	
	            } 
	        }
        	
        	Thread.sleep(500);	
        }
	}

}
