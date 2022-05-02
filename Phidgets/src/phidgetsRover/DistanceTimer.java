/*
 * Purpose: Animate the loading dots
 */

package phidgetsRover;

import java.util.Timer;
import java.util.TimerTask;

import com.phidget22.PhidgetException;


public class DistanceTimer extends TimerTask
{
	/*Declare Variables*/
	Double counter = 0.00;
	Timer timer = new Timer();
	//PhidgetsRoverSquare rover = new PhidgetsRoverSquare();
	
	/*
	 * Create a new timer
	 */
	public DistanceTimer()
	{
		timer.scheduleAtFixedRate(this, 1000, 1);
	}
	
	/*
	 * Set the label based on the number of the counter
	 */
	public void run()
	{
		
	}
	
}
