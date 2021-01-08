package uti;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FirstFrame extends JFrame{
	public static void main(String[] args) {
	//public first(){	
		JFrame frame1 = new JFrame("BMI calculator");
		frame1.setSize(280, 170);
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame1.add(panel);
		
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		//creating and specifying the constraints for the title
		JLabel titleLabel = new JLabel("BMI calculator");
		titleLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, titleLabel,
                5,
                SpringLayout.WEST, frame1);
		panel.add(titleLabel);
		
		//creating and specifying the constraints for the sex label
		JLabel sexLabel = new JLabel ("sex");
		sexLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.NORTH, sexLabel,
                7,
                SpringLayout.SOUTH, titleLabel);
		layout.putConstraint(SpringLayout.WEST, sexLabel,
                10,
                SpringLayout.WEST, frame1);
		panel.add(sexLabel);
		
		//creating and specifying the constraints for the choices for sex
		String[] sexStrings = { "female", "male", "helicopter", "other"};
		JComboBox sexChoice = new JComboBox(sexStrings);
		layout.putConstraint(SpringLayout.WEST, sexChoice,
                23,
                SpringLayout.EAST, sexLabel);
		layout.putConstraint(SpringLayout.NORTH, sexChoice,
                5,
                SpringLayout.SOUTH, titleLabel);
		panel.add(sexChoice);
		
		//creating and specifying the constraints for the height label
		JLabel heightLabel = new JLabel("height");
		heightLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.NORTH, heightLabel, 
				12, 
				SpringLayout.SOUTH, sexLabel);
		layout.putConstraint(SpringLayout.WEST, heightLabel,
				10,
				SpringLayout.WEST, frame1);
		panel.add(heightLabel);
		
		//creating and specifying the constraints for the height text field
		JTextField heightText = new JTextField(9);
		heightText.setBounds(100, 20, 165, 25);
		layout.putConstraint(SpringLayout.WEST, heightText,
                8,
                SpringLayout.EAST, heightLabel);
		layout.putConstraint(SpringLayout.NORTH, heightText,
                5,
                SpringLayout.SOUTH, sexChoice);
		panel.add(heightText);
		
		//creating and specifying the constraints for the weight label
		JLabel weightLabel = new JLabel("weight");
		weightLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.NORTH, weightLabel, 
				12, 
				SpringLayout.SOUTH, heightLabel);
		layout.putConstraint(SpringLayout.WEST, weightLabel,
				10,
				SpringLayout.WEST, frame1);
		panel.add(weightLabel);
		
		//creating and specifying the constraints for the weight text field
		JTextField weightText = new JTextField(9);
		weightText.setBounds(100, 20, 165, 25);
		layout.putConstraint(SpringLayout.WEST, weightText,
                5,
                SpringLayout.EAST, weightLabel);
		layout.putConstraint(SpringLayout.NORTH, weightText,
                5,
                SpringLayout.SOUTH, heightText);
		panel.add(weightText);
		
		//creating and specifying the constraints for the result button
		JButton resultsButton = new JButton("show me my BMI");
		resultsButton.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, resultsButton,
                20,
                SpringLayout.WEST, weightLabel);
		layout.putConstraint(SpringLayout.NORTH, resultsButton,
                50,
                SpringLayout.NORTH, heightText);
		panel.add(resultsButton);
		
		//frame1.pack();
		frame1.setVisible(true);
	}
}
