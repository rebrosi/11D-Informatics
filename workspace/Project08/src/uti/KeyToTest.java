package uti;

import java.util.Scanner;

public class KeyToTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] answersOfStudents = new String[8][10];
		String[] key = new String[10];
		
		System.out.println("Enter the answers of the students:");
		for(int i = 0; i < answersOfStudents.length; i++) {
    		System.out.print("Student " + (i + 1) + ": ");
	    	for(int j = 0; j < answersOfStudents[i].length; j++) {
				answersOfStudents[i][j] = sc.next();
	    	}
	    }
		
		System.out.println("Enter the right answers:");
		for(int i = 0; i < key.length; i++) {
			key[i] = sc.next();
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
