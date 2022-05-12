package phidgetScale;

import com.phidget22.*;

public class TumbstickTest {

	public static void main(String[] args) throws Exception
	{
		Thumbstick t = new Thumbstick();

		t.main(args);
		
		 VoltageRatioInput vAxis = new VoltageRatioInput(); 
	     VoltageRatioInput hAxis = new VoltageRatioInput();
	     
	     vAxis.setChannel(0);
	     hAxis.setChannel(1);
	     
	     vAxis.open(5000);
	     hAxis.open(5000);
	     
	     while(true)
	     {
	    	 double verticalAxis = vAxis.getVoltageRatio();
	          
	         double horizontalAxis = hAxis.getVoltageRatio();
	        
	         double yPosition = verticalAxis * 400;
	         
	         double xPosition = horizontalAxis * 400;
	         
	         if(Math.abs(verticalAxis) > 0.01 || Math.abs(horizontalAxis) > 0.01)
	         {
	        	 t.circle.setAlignmentX((float) xPosition);
	        	 t.circle.setAlignmentY((float) yPosition);
	         }
	         else
	         {
	        	 t.circle.setAlignmentX(150);
	        	 t.circle.setAlignmentY(150);
	         }
	     }
	}

}
