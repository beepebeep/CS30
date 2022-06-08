package phidgetsRover;

import com.phidget22.*;


public class Humidity 
{

	public static void main(String[] args) throws Exception
	{
		Net.addServer("", "192.168.100.1", 5661, "", 0);
		
		//Create 
        DigitalInput redButton = new DigitalInput();
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        VoltageRatioInput vAxis = new VoltageRatioInput(); 
        VoltageRatioInput hAxis = new VoltageRatioInput();
        DigitalOutput pump = new DigitalOutput();
        
        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);
        vAxis.setChannel(1);
        hAxis.setChannel(0);
        pump.setIsHubPortDevice(true);
        pump.setHubPort(1);

        //Open 
        redButton.open(1000);
        leftMotors.open(5000);
        rightMotors.open(5000);
        vAxis.open(5000);
        hAxis.open(5000);
        pump.open(1000);

        //Increase acceleration
        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
        
        //Use your Phidgets 
        while(true){
            System.out.println("Button State: " + redButton.getState());
          //Get data from vertical axis (value between -1 and 1)
        	double verticalAxis = vAxis.getVoltageRatio();
		          
        	double horizontalAxis = hAxis.getVoltageRatio();
		            
        	//Use thumbstick data to figure how each side of rover should move
	        double leftMotorsSpeed = verticalAxis - horizontalAxis;
	        double rightMotorsSpeed = verticalAxis + horizontalAxis;

	        //Limit values to between -1 and 1
	        if(leftMotorsSpeed > 1) leftMotorsSpeed = 1;
	        if(leftMotorsSpeed < -1) leftMotorsSpeed = -1;
	        if(rightMotorsSpeed > 1) rightMotorsSpeed = 1;
	        if(rightMotorsSpeed < -1) rightMotorsSpeed = -1;

	        //Apply values 
	        leftMotors.setTargetVelocity(leftMotorsSpeed);
	        rightMotors.setTargetVelocity(rightMotorsSpeed);
	        
	        if (redButton.getState() == true)
	        {
	        	pump.setState(true);
	        }
	        else
	        {
	        	pump.setState(false);
	        }
            Thread.sleep(150);
        }
    }
}
