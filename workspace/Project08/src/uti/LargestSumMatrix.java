package uti;

import java.util.Scanner;

public class LargestSumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		int sum = 0, maxSum = 0, maxSumRow = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Enter the element on position " + (i + 1) + " " + (j + 1) + " ");
				matrix[i][j] = sc.nextInt();
				sum += matrix[i][j];
			}
			if (maxSum < sum) {
				maxSum = sum;
				maxSumRow = i;
			}
		}
		
		System.out.println("On row number " + (maxSumRow + 1) + " the elements have the biggest sum of " + maxSum);
		
		
	}

}
