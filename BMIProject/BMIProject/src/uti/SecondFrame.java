package uti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class SecondFrame extends JFrame implements ActionListener{
	// creating the variables that are going to be used
	// to collect the height and weight from the first frame
	double heightInNumber;
	double weightInNumber;
	public SecondFrame(double height, double weight) {
		this.setSize(310, 110);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		this.add(panel);

		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);

		// creating and specifying the constraints for the greeting label
		//<html> and <br> are added in order to make greetingLabel on two separate lines
		// &nbsp; is for space, because the normal space isn't working when it comes to labels
		JLabel greetingLabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "we have the results and...<br>at least you are beautiful on the inside</html>");
		greetingLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, greetingLabel,
                0,
                SpringLayout.HORIZONTAL_CENTER, panel);
//		layout.putConstraint(SpringLayout.WEST, greetingLabel,
//                5,
//                SpringLayout.WEST, this);
		panel.add(greetingLabel);
		
		// creating and specifying the constraints for the thanks button
		JButton thanksButton = new JButton("ooh thanks");
		thanksButton.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, thanksButton,
                10,
                SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, thanksButton,
                40,
                SpringLayout.NORTH, panel);
		// setting the functionality of the button
		thanksButton.addActionListener (this);
		// setting an action command in order to distinguish 
		// the two actions for the two buttons
		thanksButton.setActionCommand("thanks");
		panel.add(thanksButton);
		
		// creating and specifying the constraints for the final results button
		JButton finalResultsButton = new JButton("i still want them though");
		finalResultsButton.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, finalResultsButton,
                10,
                SpringLayout.EAST, thanksButton);
		layout.putConstraint(SpringLayout.NORTH, finalResultsButton,
                40,
                SpringLayout.NORTH, panel);
		// setting the functionality of the button
		finalResultsButton.addActionListener(this);
		// saving the values of the height and the weight on the variables we
		// created earlier (we got the original values from the first frame)
		heightInNumber = height;
		weightInNumber = weight;
		panel.add(finalResultsButton);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		// checking which action is needed
		if (e.getActionCommand().equals("thanks")) {
			this.setVisible(false);
		} else {
			
			double result = weightInNumber / (heightInNumber / 100 * heightInNumber / 100);
			String message = "your BMI is: " + Math.round(result * 100.0) / 100.0;
			JOptionPane.showMessageDialog(this,
	                message,
	                "Not bad. Not bad at all.",
	                1);
			this.setVisible(false);
			
		}
	}
	
	
}

