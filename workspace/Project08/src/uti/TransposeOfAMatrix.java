package uti;

import java.util.Scanner;

public class TransposeOfAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows and columns of the matrix ");
		int rows=sc.nextInt();
	    int columns=sc.nextInt();
	    int[][] matrix = new int[rows][columns];
	    
	    for(int i = 0; i < matrix.length; i++) {
	    	for(int j = 0; j < matrix[i].length; j++) {
	    		System.out.print("Enter the element on position " + (i + 1) + " " + (j + 1) + " ");
				matrix[i][j] = sc.nextInt();
	    	}
	    }
	    int[][] newMatrix = new int[columns][rows];
	    for (int i = 0; i < newMatrix.length; i++) { 
			for (int j = 0; j < newMatrix[i].length; j++) { 
				 newMatrix[i][j] = matrix[j][i];
			} 
		}
	    
	    System.out.print("Transpose:\n");
		for (int i = 0; i < newMatrix.length; i++) { 
			for (int j = 0; j < newMatrix[i].length; j++) { 
				System.out.print(newMatrix[i][j] + " ");
			} 
			System.out.println();
		}
	}

}
