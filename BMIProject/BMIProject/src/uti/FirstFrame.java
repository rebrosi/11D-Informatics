package uti;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FirstFrame extends JFrame implements ActionListener{
	JButton resultsButton = new JButton("show me my BMI");
	JTextField heightText = new JTextField(7);
	JTextField weightText = new JTextField(7);
	public FirstFrame(){	
		this.setSize(230, 170);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		this.add(panel);
		
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		// creating and specifying the constraints for the title
		JLabel titleLabel = new JLabel("BMI calculator");
		titleLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, titleLabel,
                0,
                SpringLayout.HORIZONTAL_CENTER, panel);
		panel.add(titleLabel);
		
		// creating and specifying the constraints for the sex label
		JLabel sexLabel = new JLabel ("sex");
		sexLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, sexLabel,
                40,
                SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, sexLabel,
                15,
                SpringLayout.BASELINE, titleLabel);
		panel.add(sexLabel);
		
		// creating and specifying the constraints for the choices for sex
		String[] sexStrings = {"female", "male", "helicopter", "other"};
		JComboBox sexChoice = new JComboBox(sexStrings);
		layout.putConstraint(SpringLayout.WEST, sexChoice,
                90,
                SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.SOUTH, sexChoice,
                5,
                SpringLayout.SOUTH, sexLabel);
		panel.add(sexChoice);
		
		// creating and specifying the constraints for the height label
		JLabel heightLabel = new JLabel("height (cm)");
		heightLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.NORTH, heightLabel, 
				12, 
				SpringLayout.BASELINE, sexLabel);
		layout.putConstraint(SpringLayout.WEST, heightLabel,
				40,
				SpringLayout.WEST, panel);
		panel.add(heightLabel);
		
		// specifying the constraints for the height text field
		heightText.setBounds(100, 20, 165, 25);
		layout.putConstraint(SpringLayout.SOUTH, heightText,
                5,
                SpringLayout.SOUTH, heightLabel);
		layout.putConstraint(SpringLayout.WEST, heightText,
                110,
                SpringLayout.WEST, panel);
		panel.add(heightText);
		
		// creating and specifying the constraints for the weight label
		JLabel weightLabel = new JLabel("weight (kg)");
		weightLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.NORTH, weightLabel, 
				12, 
				SpringLayout.BASELINE, heightLabel);
		layout.putConstraint(SpringLayout.WEST, weightLabel,
				40,
				SpringLayout.WEST, panel);
		panel.add(weightLabel);
		
		// specifying the constraints for the weight text field
		weightText.setBounds(100, 20, 165, 25);
		layout.putConstraint(SpringLayout.WEST, weightText,
                110,
                SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, weightText,
                5,
                SpringLayout.SOUTH, heightText);
		panel.add(weightText);
		
		// specifying the constraints for the result button
		resultsButton.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, resultsButton,
                0,
                SpringLayout.HORIZONTAL_CENTER, panel);
		layout.putConstraint(SpringLayout.NORTH, resultsButton,
                50,
                SpringLayout.NORTH, heightText);
		resultsButton.addActionListener(this);
		panel.add(resultsButton);
		
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		// checking if the entered values are numbers and are there even entered values
		try {
			double heightInNumber = Double.parseDouble(heightText.getText());
			double weightInNumber = Double.parseDouble(weightText.getText());
			// creating the second frame and giving the info that we collected
			// from the first one as parameters so it be used to calculate the result
			SecondFrame second = new SecondFrame(heightInNumber, weightInNumber);
			this.setVisible(false);
		} catch (Exception NumberFormatException) {
			String NotNumberAlert = "Please enter numerical answer";
			JOptionPane.showMessageDialog(this,
	                NotNumberAlert,
	                "Oops",
	                0);
		}

	}
}
