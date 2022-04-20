/*
 * Purpose: Animate the loading dots
 */

package highestGrade;

import java.util.Timer;
import java.util.TimerTask;


public class Dots extends TimerTask 
{
	/*Declare Variables*/
	int counter = 1;
	Timer timer = new Timer();
	
	/*
	 * Create a new timer
	 */
	public Dots()
	{
		timer.scheduleAtFixedRate(this, 1000, 1000);
	}
	
	/*
	 * Set the label based on the number of the counter
	 */
	public void run()
	{
		System.out.println(counter);
	
		switch (counter)
		{
			case 1: 
			{
				HighestGrade.gradeLabel.setText("Calculating..");
				break;
			}
			
			case 2:
			{
				HighestGrade.gradeLabel.setText("Calculating...");
				break;
			}
			
			case 3:
			{
				HighestGrade.gradeLabel.setText("Calculating.");
				break;
			}
			case 4:
			{
				HighestGrade.gradeLabel.setText("Calculating..");
				break;
			}
			case 5:
			{
				HighestGrade.gradeLabel.setText("Calculating...");
				break;
			}
			case 6:
			{
				HighestGrade.gradeLabel.setText("");
				timer.cancel();
				HighestGrade.calculate();
				break;
			}
			default:
			{
				break;
			}
		
		}
		counter++;
	}
	
}
