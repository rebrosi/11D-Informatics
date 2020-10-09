package uti;

import java.util.Scanner;
import java.util.Random;

public class ArrayShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		int [] randomNumberArray = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.print("Enter a number ");
			randomNumberArray[rand.nextInt(10)] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++){
			System.out.println(randomNumberArray[i]);
		}
	}

}
