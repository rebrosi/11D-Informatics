package uti;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FirstFrame extends JFrame implements ActionListener{
	JButton resultsButton = new JButton("show me my BMI");
	JTextField heightText = new JTextField(9);
	JTextField weightText = new JTextField(9);
	public FirstFrame(){	
		this.setSize(280, 170);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		this.add(panel);
		
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		//creating and specifying the constraints for the title
		JLabel titleLabel = new JLabel("BMI calculator");
		titleLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, titleLabel,
                5,
                SpringLayout.WEST, this);
		panel.add(titleLabel);
		
		//creating and specifying the constraints for the sex label
		JLabel sexLabel = new JLabel ("sex");
		sexLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.NORTH, sexLabel,
                7,
                SpringLayout.SOUTH, titleLabel);
		layout.putConstraint(SpringLayout.WEST, sexLabel,
                10,
                SpringLayout.WEST, this);
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
				SpringLayout.WEST, this);
		panel.add(heightLabel);
		
		//creating and specifying the constraints for the height text field
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
				SpringLayout.WEST, this);
		panel.add(weightLabel);
		
		//creating and specifying the constraints for the weight text field
		weightText.setBounds(100, 20, 165, 25);
		layout.putConstraint(SpringLayout.WEST, weightText,
                5,
                SpringLayout.EAST, weightLabel);
		layout.putConstraint(SpringLayout.NORTH, weightText,
                5,
                SpringLayout.SOUTH, heightText);
		panel.add(weightText);
		
		//creating and specifying the constraints for the result button
		resultsButton.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, resultsButton,
                20,
                SpringLayout.WEST, weightLabel);
		layout.putConstraint(SpringLayout.NORTH, resultsButton,
                50,
                SpringLayout.NORTH, heightText);
		resultsButton.addActionListener(this);
		panel.add(resultsButton);
		
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//creating the second frame and giving the info that we collected
		//from the first one as parameters so it be used to calculate the result
		SecondFrame second = new SecondFrame(heightText.getText(), weightText.getText());
		this.setVisible(false);
		
	}
}
