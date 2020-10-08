package uti;

import java.util.Scanner;

public class AnagramFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two words:");
		String firstWord = sc.nextLine();
		String secondWord = sc.nextLine();
		int lengthOfFirstWord = firstWord.length();
		int lengthOfSecondWord = secondWord.length();
		boolean AreTheyAnagrams = true;
		String newFirstWord = "";
		String newSecondWord = "";
		
		for(int i = 0; i < lengthOfFirstWord; i++){
			if ((firstWord.charAt(i) >= 65 && firstWord.charAt(i) <= 90 ||  firstWord.charAt(i) >= 97 && firstWord.charAt(i) <= 122)){
//				newFirstWord = firstWord.replace(firstWord.charAt(i), '\0');
//				lengthOfFirstWord = newFirstWord.length();
				newFirstWord += firstWord.charAt(i);
			}
		}
		
		System.out.print(newFirstWord);
		
		for(int i = 0; i < lengthOfSecondWord; i++){
			if (!(secondWord.charAt(i) >= 65 && secondWord.charAt(i) <= 90 ||  secondWord.charAt(i) >= 97 && secondWord.charAt(i) <= 122)){
				newSecondWord = secondWord.replace(secondWord.charAt(i), '\0');
				lengthOfSecondWord = newSecondWord.length();
			}
		}
		
		if (lengthOfFirstWord == lengthOfSecondWord){
			for(int i = 0; i < lengthOfFirstWord; i++){
				int index = newSecondWord.indexOf(newFirstWord.charAt(i));
				if (index== -1){
					AreTheyAnagrams = false;
					break;
				}else{
					newSecondWord = newSecondWord.substring(0, index) + newSecondWord.substring(index + 1);
				}
			}
			
		} else {
			AreTheyAnagrams = false;
		}
		
		if(AreTheyAnagrams){
			System.out.println("They are anagrams!");
		} else {
			System.out.println("They are not anagrams!");
		}
		
	}

}
