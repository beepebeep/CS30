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
	
	/*
	 * Create a new timer
	 */
	public DistanceTimer()
	{
		timer.scheduleAtFixedRate(this, 1000, 1000);
	}
	
	/*
	 * Set the label based on the number of the counter
	 */
	public void run()
	{
		System.out.println(counter);
		counter += 66.666666666;
		
		if (counter == 100)
		{
			timer.cancel();
		}
	}
	
}
