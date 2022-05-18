package phidgetsRover;

	import java.text.DecimalFormat;

//Add Phidgets Library
	import com.phidget22.*;

	public class PhidgetsSpatial {
	    public static void main(String[] args) throws Exception {
	    	
	    	DecimalFormat dc = new DecimalFormat("0.00");
	    	
	        //Connect to wireless rover
	        Net.addServer("", "192.168.100.1", 5661, "", 0);
	        
	        //Create
	        Spatial spatial = new Spatial();
	        DCMotor leftMotors = new DCMotor();
	        DCMotor rightMotors = new DCMotor();
	        VoltageRatioInput vAxis = new VoltageRatioInput(); 
	        VoltageRatioInput hAxis = new VoltageRatioInput();
	        
	        
	      //Spatial Event
	        spatial.addSpatialDataListener(new SpatialSpatialDataListener() {
	            public void onSpatialData(SpatialSpatialDataEvent e) {                    
	                double[] acceleration = e.getAcceleration();
	                double[] angularRate = e.getAngularRate();
	                double[] magneticField = e.getMagneticField();
	                double timestamp = e.getTimestamp();

	                System.out.println("Acceleration: " + dc.format(acceleration[0] * 10) + "," + dc.format(acceleration[1] * 10) + "," + dc.format(acceleration[2] * 10));
	                System.out.println("Angular Rate: " + dc.format(angularRate[0]) + "," + dc.format(angularRate[1]) + "," + dc.format(angularRate[2]));
	                System.out.println("Magnetic Field: " + dc.format(magneticField[0]) + "," + dc.format(magneticField[1]) + "," + dc.format(magneticField[2]));
	                System.out.println("Timestamp: " + dc.format(timestamp) + "\n");       
	            }
	       });
	        
	        
	        //Address
	        leftMotors.setChannel(0);
	        rightMotors.setChannel(1);
	        vAxis.setChannel(1);
	        hAxis.setChannel(0);
	        
	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        vAxis.open(5000);
	        hAxis.open(5000);
	        
	        //Increase acceleration
	        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
	        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
	        
	        while(true)
	        {
	        	spatial.open(1000);
	        	
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
				          
	        }
	        
	   }
	}

