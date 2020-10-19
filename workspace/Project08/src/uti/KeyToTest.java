package uti;

import java.util.Scanner;

public class KeyToTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[][] answersOfStudents = new char[8][10];
		char[] key = new char[10];
		
		System.out.println("Enter the answers of the students:");
		for(int i = 0; i < answersOfStudents.length; i++) {
    		System.out.print("Student " + (i + 1) + ": ");
	    	for(int j = 0; j < answersOfStudents[i].length; j++) {
				answersOfStudents[i][j] = sc.nextLine().charAt(0);
	    	}
	    }
		
		System.out.println("Enter the right answers:");
		for(int i = 0; i < key.length; i++) {
			key[i] = sc.nextLine().charAt(0);
		}
		
		for(int i = 0; i < answersOfStudents.length; i++) {
			System.out.print("Student " + (i + 1) + " has ");
			int points = 0;
			for(int j = 0; j < answersOfStudents[i].length; j++) {
				if(key[i] == answersOfStudents[i][j]) {
					points++;
				}
			}
			System.out.print(points + " points.\n");
		}
		
	}

}