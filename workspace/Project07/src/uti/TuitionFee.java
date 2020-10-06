package uti;

import java.util.Scanner;

public class TuitionFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double tuition = 10_000;
		int totalCost = 0;
		
		for(int i = 0; i < 14; i++) {
			tuition *= 1.06;
			if (i > 9) {
				totalCost += tuition;
			}
		}
		
		System.out.println("The total cost of four years’ worth of tuition after the tenth year is " + totalCost);
	}

}
