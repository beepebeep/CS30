package phidgetsRover;

	//Add Phidgets Library
	import com.phidget22.*;

	public class PhidgetsRover {
	    public static void main(String[] args) throws Exception {

	    	int distanceCounter = 0;
	    	
	        //Connect to wireless rover
	        Net.addServer("", "192.168.100.1", 5661, "", 0);

	        //Create
	        DCMotor leftMotors = new DCMotor();
	        DCMotor rightMotors = new DCMotor();
	        DistanceSensor sonar = new DistanceSensor();

	        //Address
	        leftMotors.setChannel(0);
	        leftMotors.setHubPort(5);
	        rightMotors.setChannel(1);
	        rightMotors.setHubPort(5);

	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        sonar.open(5000);
	        
	        while (distanceCounter <= 100)
	        {
	        	leftMotors.setTargetVelocity(-1);
		        rightMotors.setTargetVelocity(-1);
		        
		        Thread.sleep(2000);
	        }
	       
	        
	        
	        //Thread.sleep(1000);
	        
	       /* while (true) {

	            System.out.println("Distance: " + sonar.getDistance() + " mm");
	            
	            if (sonar.getDistance() < 250) {
	                //Object detected! Stop motors
	                leftMotors.setTargetVelocity(0);
	                rightMotors.setTargetVelocity(0);
	                
	                Thread.sleep(1000);
	                
	                leftMotors.setTargetVelocity(1);
	                rightMotors.setTargetVelocity(1);
	                
	                Thread.sleep(500);
	                
	                leftMotors.setTargetVelocity(-1);
	                rightMotors.setTargetVelocity(1);
	                
	                Thread.sleep(500);
	                
	                leftMotors.setTargetVelocity(0);
	                rightMotors.setTargetVelocity(0);
	                
	                Thread.sleep(1000);
	                
	            } else {
	                //Move forward slowly (25% max speed)
	                leftMotors.setTargetVelocity(-0.5);
	                rightMotors.setTargetVelocity(-0.5);
	            }

	            //Wait for 100 milliseconds
	            Thread.sleep(100); */
	    }
	   }

