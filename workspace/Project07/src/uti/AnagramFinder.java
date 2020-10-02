package uti;

import java.util.Scanner;

public class AnagramFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter to words:");
		String firstWord = sc.nextLine();
		String secondWord = sc.nextLine();
		int lengthOfFirstWord = firstWord.length();
		int lengthOfSecondWord = secondWord.length();
		boolean AreTheyAnagrams = true;
		for(int i = 0; i < lengthOfFirstWord; i++){
			if (!(secondWord.contains(firstWord.substring(i, i + 1)))){
				AreTheyAnagrams = false;
				break;
			}
		}
		if(AreTheyAnagrams){
			System.out.println("They are anagrams!");
		} else {
			System.out.println("They are not anagrams!");
		}
		
	}

}
