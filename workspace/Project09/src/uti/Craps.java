package uti;

import java.util.Random;

public class Craps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = RollingDice();
		boolean gameResult = true;
		if (point == 2 || point == 3 || point == 12) {
			gameResult = false;
		} else if (point == 7 || point == 11) {
			gameResult = true;
		} else {
			int newResult = 0;
			do {
				newResult = RollingDice();
				gameResult = true;
				if (newResult == 7) {
					gameResult = false;
					break;
				}
			} while (newResult != point);
		}
		System.out.println(gameResult ? "You win" : "You lose");
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
