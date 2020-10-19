package uti;

import java.util.Random;

public class Craps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = RollingDice();
	}
	public static int RollingDice(){
		Random rand = new Random();
		int value1 = rand.nextInt(6);
		value1++;
		int value2 = rand.nextInt(6);
		value2++;
		System.out.println("You rolled " + value1 + " + " + value2 + " = " + (value1 + value2));
		return value1 + value2;
	}
	
}
