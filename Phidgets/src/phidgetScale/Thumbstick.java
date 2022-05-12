package phidgetScale;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


import java.awt.Color;

public class Thumbstick {

	private JFrame frame;
	JLabel circle = new JLabel("");
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

	public void moveThumstick() throws Exception
	{
	
	}

	/**
	 * Create the application.
	 */
	public Thumbstick() {
		initialize();
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
