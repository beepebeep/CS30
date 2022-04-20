/*
 * Purpose: Create a HighestGrade application that prompts the user for a number of grades,
 * 			and stores them in an array. After that, the application then traverses the array
 * 			to find and display the highest grade.
 */
package highestGrade;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.awt.event.ActionEvent;


public class HighestGrade {

	/*Declare variables*/
	private JFrame frmHighestgrade;
	private JTextField numText;
	private JTextField gradeText;
	public static JLabel gradeLabel = new JLabel("Enter the first grade:");
	private static JLabel highLabel = new JLabel("The Highest Grade is: ");
	private JButton enterGrade = new JButton("Enter");
	private JButton enterNum = new JButton("Enter");
	private int numOfGrades, counter = 0;
	static double[] grades = new double[50];
	private static DecimalFormat dc = new DecimalFormat("0.00");
	
	/*
	 * Ask user how many grades to enter
	 */
	public void getNumOfGrades()
	{
		numOfGrades = Integer.parseInt(numText.getText());
		numText.setEnabled(false);
		enterNum.setEnabled(false);
		disp();
	}
	
	/*
	 * Make the next tools visible
	 */
	public void disp()
	{
		gradeLabel.setVisible(true);
		enterGrade.setVisible(true);
		gradeText.setVisible(true);
	}
	
	/*
	 * Enter the grades into the array
	 */
	public void enterGrades()
	{
		System.out.println("counter: " + counter);
		grades[counter] = Double.parseDouble(gradeText.getText());
		
		gradeText.setText("");
		
		counter++;
	
			if (counter == 0)
			{
				gradeLabel.setText("Enter the first grade:");
			}
			else if ((counter > 0) && (counter < numOfGrades - 1))
			{
				gradeLabel.setText("Enter the next grade");
			}
			else if (counter == numOfGrades - 1)
			{
				gradeLabel.setText("Enter the last grade:");
			}
			else if (counter == numOfGrades)
			{
				gradeText.setVisible(false);
				enterGrade.setVisible(false);
				flex();
			}
	}
				
	/*
	 * Make the dots dance
	 */
	public void flex()
	{
		gradeLabel.setText("Calculating.");
		new Dots();
	}
	
	/*
	 * Calculate and display the highest grade
	 */
	public static void calculate()
	{
		Arrays.sort(grades);
		highLabel.setText("The highest grade is: " + dc.format(grades[grades.length - 1]) + "%");
		highLabel.setVisible(true);
		
	}
	
	/**
	 * Create the application.
	 */
	public HighestGrade() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHighestgrade = new JFrame();
		frmHighestgrade.setTitle("HighestGrade");
		frmHighestgrade.setBounds(100, 100, 666, 406);
		frmHighestgrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHighestgrade.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 630, 345);
		frmHighestgrade.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How many grades do you want to enter? (max: 50)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 610, 20);
		panel.add(lblNewLabel);
		
		numText = new JTextField();
		numText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				getNumOfGrades();
			}
		});
		numText.setBounds(197, 42, 120, 23);
		panel.add(numText);
		numText.setColumns(10);
		
		
		enterNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				getNumOfGrades();
			}
		});
		enterNum.setBounds(341, 42, 89, 23);
		panel.add(enterNum);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color(255, 175, 175));
		lblNewLabel_1.setBounds(440, 46, 180, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.YELLOW);
		lblNewLabel_1_1.setBackground(Color.YELLOW);
		lblNewLabel_1_1.setBounds(10, 46, 180, 14);
		panel.add(lblNewLabel_1_1);
		
		gradeText = new JTextField();
		gradeText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				enterGrades();
			}
		});
		gradeText.setBounds(10, 190, 610, 20);
		panel.add(gradeText);
		gradeText.setColumns(10);
		gradeText.setVisible(false);
		
		
		gradeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gradeLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		gradeLabel.setBounds(10, 159, 610, 20);
		panel.add(gradeLabel);
		gradeLabel.setVisible(false);
		enterGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				enterGrades();
			}
		});
		
		
		enterGrade.setBounds(271, 221, 89, 30);
		panel.add(enterGrade);
		enterGrade.setVisible(false);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBackground(Color.PINK);
		lblNewLabel_1_2.setBounds(380, 225, 240, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setBackground(Color.PINK);
		lblNewLabel_1_2_1.setBounds(10, 225, 240, 14);
		panel.add(lblNewLabel_1_2_1);
		
		
		highLabel.setHorizontalAlignment(SwingConstants.CENTER);
		highLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		highLabel.setBounds(10, 302, 610, 20);
		panel.add(highLabel);
		highLabel.setVisible(false);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HighestGrade window = new HighestGrade();
					window.frmHighestgrade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
}
