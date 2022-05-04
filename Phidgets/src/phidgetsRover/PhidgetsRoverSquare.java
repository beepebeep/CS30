package phidgetsRover;

	//Add Phidgets Library
	import com.phidget22.*;

	public class PhidgetsRoverSquare {
	        
	       
	    public static void main(String[] args) throws Exception 
	    {
	    	Net.addServer("", "192.168.100.1", 5661, "", 0);
	    	
	    	DCMotor leftMotors = new DCMotor();
        	DCMotor rightMotors = new DCMotor();
        	
        	leftMotors.setChannel(0);
 	        rightMotors.setChannel(1);
 	        
 	        leftMotors.open(5000);
 		    rightMotors.open(5000);
        	
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(-1);
	        
	        Thread.sleep(1800);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(250);
	        
	        leftMotors.setTargetVelocity(0.5);
	        rightMotors.setTargetVelocity(-0.5);
	        
	        Thread.sleep(1300);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(1000);
	        
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(-1);
	        
	        Thread.sleep(1800);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(250);
	        
	        leftMotors.setTargetVelocity(0.5);
	        rightMotors.setTargetVelocity(-0.5);
	        
	        Thread.sleep(1300);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(1000);
	        
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(-1);
	        
	        Thread.sleep(1800);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(250);
	        
	        leftMotors.setTargetVelocity(0.5);
	        rightMotors.setTargetVelocity(-0.5);
	        
	        Thread.sleep(1300);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(1000);
	        
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(-1);
	        
	        Thread.sleep(1800);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(250); 
	    }
	}
