package uti;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class SecondFrame extends JFrame{
	//public second() {
	public static void main(String[] args) {
		JFrame frame2 = new JFrame();
		frame2.setSize(400, 100);
		
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame2.add(panel);
		
		SpringLayout layout = new SpringLayout();
		panel.setLayout(layout);
		
		//creating and specifying the constraints for the greeting label
		JLabel greetingLabel = new JLabel("we have the results and ...\n"
				+ "at least you are beautiful on the inside");
		greetingLabel.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.NORTH, greetingLabel,
                5,
                SpringLayout.NORTH, frame2);
		layout.putConstraint(SpringLayout.WEST, greetingLabel,
                5,
                SpringLayout.WEST, frame2);
		panel.add(greetingLabel);
		
		//creating and specifying the constraints for the thanks button
		JButton thanksButton = new JButton("ooh thanks");
		thanksButton.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, thanksButton,
                50,
                SpringLayout.WEST, frame2);
		layout.putConstraint(SpringLayout.NORTH, thanksButton,
                30,
                SpringLayout.NORTH, frame2);
		panel.add(thanksButton);
		
		//creating and specifying the constraints for the final results button
		JButton finalResultsButton = new JButton("i still want them though");
		finalResultsButton.setBounds(10, 20, 80, 25);
		layout.putConstraint(SpringLayout.WEST, finalResultsButton,
                10,
                SpringLayout.EAST, thanksButton);
		layout.putConstraint(SpringLayout.NORTH, finalResultsButton,
                30,
                SpringLayout.NORTH, frame2);
		panel.add(finalResultsButton);
		
		frame2.setVisible(true);
	}
}
