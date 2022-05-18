package phidgetsRover;

import com.phidget22.*;

public class PhidgetsPlant {

	public static void main(String[] args) throws Exception {
		 
        //Create
        VoltageRatioInput soil = new VoltageRatioInput();
        
        //Open
        soil.open(1000);
        
        //Use your Phidgets
        while(true){
            System.out.println("Soil Moisture Level: " + soil.getVoltageRatio());
            Thread.sleep(100);
        }

	}

}
