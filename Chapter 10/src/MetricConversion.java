/*
 * Create an application that allows the user to select a type of conversion from
 * a combo box and then the corresponding formula is displayed.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion {

	/**
	 * Initialize variables
	 */
	private JFrame frmMetricconversion;	
	public String[] conversions = {"Select a conversion","in to cm", "ft to m","gal to L","lbs to kg"};
	
	DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>(conversions);
	JComboBox<String> comboBox = new JComboBox<String>(comboModel);
	
	public JLabel dispLabel = new JLabel("");
	public int choiceNum;
	
	
	/**
	 * Get the choice from the combo box and display the corresponding conversion
	 */
	public void choice()
	{
		String choice = (String)comboBox.getSelectedItem();
		
		if (choice == "Select a conversion")
		{
			dispLabel.setText("");
		}
		else if (choice == "in to cm")
		{
			dispLabel.setText("1 inch = 2.54 centimeters");
		}
		else if (choice == "ft to m")
		{
			dispLabel.setText("1 foot = 0.3048 meters");
		}
		else if (choice == "gal to L")
		{
			dispLabel.setText("1 gallon = 4.5461 litres");
		}
		else if (choice == "lbs to kg")
		{
			dispLabel.setText("1 pound = 0.4536 kilograms");
		}
	}


	/**
	 * Create the application.
	 */
	public MetricConversion() 
	{
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmMetricconversion = new JFrame();
		frmMetricconversion.setTitle("MetricConversion");
		frmMetricconversion.setBounds(100, 100, 450, 300);
		frmMetricconversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetricconversion.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frmMetricconversion.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a conversion:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 394, 23);
		panel.add(lblNewLabel);
		
		
		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				choice();		//run the choice method
			}
		});
		
		comboBox.setBounds(123, 45, 167, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 68, 394, 141);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		dispLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dispLabel.setBounds(10, 11, 374, 28);
		panel_1.add(dispLabel);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
					window.frmMetricconversion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
