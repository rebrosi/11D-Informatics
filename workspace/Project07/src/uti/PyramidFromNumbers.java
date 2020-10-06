package uti;

import java.util.Scanner;

public class PyramidFromNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of lines: ");
		int lines = sc.nextInt();
		for (int i = lines; i > 0; i--) {
			for (int j = lines * 2 - 1; j > 0; j--) {
				if(j - lines + 1 > 0) {
					int number = j - lines + 1;
					System.out.print(number + " ");					
				} else {
					int number = lines - j + 1;
					System.out.print(number + " ");
				}
			}
			lines--;
			System.out.println();
		}
	}

}
