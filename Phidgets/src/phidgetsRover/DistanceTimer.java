/*
 * Purpose: Animate the loading dots
 */

package phidgetsRover;

import java.util.Timer;
import java.util.TimerTask;


public class DistanceTimer extends TimerTask 
{
	/*Declare Variables*/
	Double counter = 0.00;
	Timer timer = new Timer();
	PhidgetsRoverSquare rover = new PhidgetsRoverSquare();
	
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
		
		System.out.println(counter);
		counter += 0.0496694491;
		
	}
	
}
