package uti;

import java.util.Random;
import java.util.Scanner; 

public class RandomElements20Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		int [] randomNumberArray = new int[20];
		for(int i = 0; i < 20; i++){
			randomNumberArray[i] = rand.nextInt(1000);
		}
		for(int i = 0; i < 20; i++){
			System.out.println(randomNumberArray[i]);
		}
	}
}
