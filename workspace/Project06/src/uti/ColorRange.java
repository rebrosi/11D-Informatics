package uti;

import java.util.Scanner;

public class ColorRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a wavelength");
		double wavelength = sc.nextDouble();
		String colour = null;
		if (wavelength >= 380 && wavelength < 450){
			colour = "Violet";
		} else if (wavelength >= 450 && wavelength < 495){
			colour = "Blue";
		}else if (wavelength >= 495 && wavelength < 570){
			colour = "Green";
		}else if (wavelength >= 570 && wavelength < 590){
			colour = "Yellow";
		}else if (wavelength >= 590 && wavelength < 620){
			colour = "Orange";
		}else if (wavelength >= 620 && wavelength < 750){
			colour = "Red";
		}else {
			System.out.println("The entered wavelength is not a part of the visible spectrum");
		}
		System.out.println("The color is " + colour);
	}

}
