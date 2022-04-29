package phidgetsRover;

	//Add Phidgets Library
	import com.phidget22.*;

	public class PhidgetsRoverSquare {
		
		
		
        
	    public static void main(String[] args) throws Exception {

	        //Connect to wireless rover
	        Net.addServer("", "192.168.100.1", 5661, "", 0);

	        DCMotor rightMotors = new DCMotor();
	        DCMotor leftMotors = new DCMotor();
	        DistanceSensor sonar = new DistanceSensor();

	        //Address
	        leftMotors.setChannel(0);
	        rightMotors.setChannel(1);

	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        sonar.open(5000);
	        
	        
	        
	        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
	        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
	        
	        DistanceTimer timer = new DistanceTimer();
	        leftMotors.setTargetVelocity(1);
	        timer.run();
	        
	        if(timer.counter.equals(100))
	        {
	        	leftMotors.setTargetVelocity(0);
	        }
	        
	        
	        
	        
	        
	        
	            
	    }
	}
