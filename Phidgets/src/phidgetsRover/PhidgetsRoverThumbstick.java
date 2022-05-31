package phidgetsRover;


	//Add Phidgets Library
	import com.phidget22.*;

	public class PhidgetsRoverThumbstick 
	{
	
		public static void main(String[] args) throws Exception
		{
			//Connect to wireless rover
			Net.addServer("", "192.168.100.1", 5661, "", 0);
	
			//Create
	        DCMotor leftMotors = new DCMotor();
	        DCMotor rightMotors = new DCMotor();
	        VoltageRatioInput vAxis = new VoltageRatioInput(); 
	        VoltageRatioInput hAxis = new VoltageRatioInput();
	        DistanceSensor sonar = new DistanceSensor();
	        DigitalInput button = new DigitalInput();
	        DigitalOutput pump = new DigitalOutput();
	        
	        //Address
	        leftMotors.setChannel(0);
	        rightMotors.setChannel(1);
	        vAxis.setChannel(1);
	        hAxis.setChannel(0);
	        button.setHubPort(0);
	        pump.setHubPort(1);
	        pump.setIsHubPortDevice(true);
	
	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        vAxis.open(5000);
	        hAxis.open(5000);
	        sonar.open(5000);
	        button.open(5000);
	        pump.open(1000);
	
	        //Increase acceleration
	        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
	        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
	
			        
	        while(true)
	        {
	        	
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
			            
		        //Wait 100 milliseconds
		        Thread.sleep(100);
				            
		       /* if (sonar.getDistance() < 300)
		        {
		        	//Object detected! Stop motors
		        	leftMotors.setTargetVelocity(0);
		        	rightMotors.setTargetVelocity(0);
				              
		        	Thread.sleep(500);
				                
		        	leftMotors.setTargetVelocity(1);
		        	rightMotors.setTargetVelocity(1);
				                
		        	Thread.sleep(500);
		        } */
		        
		        if (button.getState())
		        {
		        	pump.setState(true);
		        }
		        else
		        {
		        	pump.setState(false);
		        }
				          
	        }
		}
	
	}


