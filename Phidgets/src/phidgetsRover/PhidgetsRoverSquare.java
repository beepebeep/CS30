package phidgetsRover;

	//Add Phidgets Library
	import com.phidget22.*;

	public class PhidgetsRoverSquare {
	
		public static void move() throws Exception
		{
			DistanceTimer timer = new DistanceTimer();
			DCMotor rightMotors = new DCMotor();
		    DCMotor leftMotors = new DCMotor();
			//Connect to wireless rover
	        Net.addServer("", "192.168.100.1", 5661, "", 0);

	       
	        DistanceSensor sonar = new DistanceSensor();

	        //Address
	        leftMotors.setChannel(0);
	        rightMotors.setChannel(1);

	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        sonar.open(5000);
	        
	       
	        timer.run();
	        
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
	        
	        timer.cancel();
		}
	    public static void main(String[] args) throws Exception {

	        move();
	        
	    }
	}
