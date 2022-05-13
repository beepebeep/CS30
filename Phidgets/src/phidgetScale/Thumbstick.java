package phidgetScale;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.phidget22.VoltageRatioInput;

import java.awt.Color;

public class Thumbstick {

	private JFrame frame;
	public JLabel circle = new JLabel("");
	

	/**
	 * Create the application.
	 */
	public Thumbstick(){
		initialize();
	}

	
	public void moveThumbstick() throws Exception
	{
		circle.setBounds(150, 150, 100, 100);
		
		 VoltageRatioInput vAxis = new VoltageRatioInput(); 
	     VoltageRatioInput hAxis = new VoltageRatioInput();
	     
	     vAxis.setChannel(0);
	     hAxis.setChannel(1);
	     
	     vAxis.open(5000);
	     hAxis.open(5000);
	     
	     while(true)
	     {
	    	 double verticalAxis = vAxis.getVoltageRatio();
	          
	         double horizontalAxis = hAxis.getVoltageRatio();
	        
	         int yPosition = (int) verticalAxis * 400;
	         
	         int xPosition = (int) horizontalAxis * 400;
	         
	         if(Math.abs(verticalAxis) > 0.01 || Math.abs(horizontalAxis) > 0.01)
	         {
	        	 circle.setBounds(xPosition, yPosition, 100, 100);
	         }
	         else
	         {
	        	 circle.setBounds(150, 150, 100, 100);
	         }
	     }
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 529, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(50, 22, 400, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		circle.setBounds(150, 150, 100, 100);
		circle.setIcon(new ImageIcon("C:\\Users\\904188001\\git\\CS30\\Phidgets\\circle.jpg"));
		circle.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(circle);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thumbstick window = new Thumbstick();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
