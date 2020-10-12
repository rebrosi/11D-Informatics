package uti;

import java.util.Scanner;

public class NoneZeroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		final int arrayLength = 5;
		int[] array = new int[arrayLength]; 
		
		for (int i = 0; i < arrayLength; i++){
			System.out.print("Enter the " + (i + 1) + " elements of the array ");
			array[i] = sc.nextInt();
		}
		
		for (int j = 0; j < arrayLength - 1; j++){
			for (int i = 0; i < arrayLength - 1 - j; i++){
				if(array[i] == 0){
					int swap = array[i];
					array[i] = array[i+1];
					array[i+1] = swap;
				}
			}
		}
		
		System.out.print("Sorted: ");
		for (int i = 0; i < arrayLength; i++){
			System.out.print(array[i] + " ");
		}
		
	}

}
