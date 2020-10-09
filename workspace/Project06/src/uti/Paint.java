package uti;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What\'s the height of the room?");
		int height = sc.nextInt();
		System.out.println("What\'s the length of the room?");
		int length = sc.nextInt();
		System.out.println("What\'s the width of the room?");
		int width = sc.nextInt();
		int size = length * width * (height - 1);
		int bucket5 = 0, bucket1 = 0;
		bucket5 = Math.round(size/140);
		bucket1 = Math.round(size / 30);
		if (bucket1 * 4 < bucket5 * 15){
			bucket5 = 0;
		}else {
			bucket1 = Math.round((size - bucket5*140) / 30);
		}
		System.out.println("You need to purchase " + bucket5 + " 5-Liter buckets and " + bucket1 + 
				" 1-Liter buckets.");
		sc.close();
	}

}