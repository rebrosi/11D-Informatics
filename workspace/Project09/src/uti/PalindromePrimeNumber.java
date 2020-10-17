package uti;

public class PalindromePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberCount = 0;
		for (int i = 1; numberCount < 120; i++) {
			if(isPalindrome(i) && isPrime(i)) {
				numberCount++;
				System.out.print(i + " ");
				if (numberCount % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
	
	public static boolean isPalindrome(int number) {
		int digitCounter = number, reversedNumber = 0, digit;
		while (digitCounter != 0) {
			digit = digitCounter % 10;
			reversedNumber = reversedNumber * 10 + digit;
			digitCounter /= 10;
		}
		if (number == reversedNumber) {
			//System.out.print("it is pali"); 
			return true;
		} else {
			//System.out.print("it is not pali"); 
			return false;
		}
	}
	
	public static boolean isPrime (int number) {
		for(int i = 2; i <= Math.sqrt(number); i++){
		      if(number % i == 0){
		    	  //System.out.print("it is not prime"); 
		         return false;
		      }
		}
		//System.out.print("it is prime"); 
		return true;
	}
}
