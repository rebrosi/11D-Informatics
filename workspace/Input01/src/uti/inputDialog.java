package uti;

import javax.swing.JOptionPane;

public class inputDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] desserts = {"Icecream", "Cake", "Chocolate"};
		String input = (String) JOptionPane.showInputDialog(
				null, 
				"Choose a dessert",
				"Desserts",
				3,
				null,
				desserts,
				desserts[0]);
		System.out.println(input);
	}

}
