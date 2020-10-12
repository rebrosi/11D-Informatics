package uti;

import java.util.Scanner;

public class MoveOnePositionToTheLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		final int arrayLength = 10;
		int[] array = new int[10];
		
		for(int i = 0; i < arrayLength; i++){
			System.out.println("Enter the " + (1 + i) + " element of the array: ");
			array[i] = sc.nextInt();
		}
		
		int firstElement = array[0];
		for(int i = 0; i < arrayLength - 1; i++){
			array[i] = array[i+1];
		}
		array[arrayLength-1] = firstElement;
		
		for(int i : array){
			System.out.println(i);
		}
	}

}
