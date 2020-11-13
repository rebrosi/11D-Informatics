package uti;

public class MyInteger {
	private int value;
	public MyInteger() {
		
	}
	public MyInteger(int value) {
		this.value = value;
	}
	
	public boolean isEven () {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
	public boolean isOdd () {
		if (value % 2 != 0) {
			return true;
		}
		return false;
	}
	public boolean isPrime () {
		for(int i = 2; i <= Math.sqrt(value); ++i){
		      if(value % i == 0){
		          return false;
		      }
		 }
		return true;
	}
	public boolean isEven (int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
	public boolean isOdd (int value) {
		if (value % 2 != 0) {
			return true;
		}
		return false;
	}
	public boolean isPrime (int value) {
		for(int i = 2; i <= Math.sqrt(value); ++i){
		      if(value % i == 0){
		          return false;
		      }
		 }
		return true;
	}
	
	public static boolean isEven (MyInteger integer) {
		if (integer.value % 2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isOdd (MyInteger integer) {
		if (integer.value % 2 != 0) {
			return true;
		}
		return false;
	}
	public static boolean isPrime (MyInteger integer) {
		for(int i = 2; i <= Math.sqrt(integer.value); ++i){
		      if((integer.value) % i == 0){
		          return false;
		      }
		 }
		return true;
	}
	
	public boolean equals (int value) {
		if (this.value == value) {
			return true;
		}
		return false;
	}
	public boolean equals (MyInteger integer) {
		if (value == integer.getValue()) {
			return true;
		}
		return false;
	}
	
	public static int parseInt (char [] array) {
		int result = 0;
	    int length = array.length - 1;

	    for (int i = 0; i <= length; i++)
	    {
	         int digit = array[i]; 
	         result *= 10;
	         result += digit;
	    }
	    return result;
	}
	
	public static int parseInt (String array) {
		int i = Integer.parseInt(array);
		return i;
	}
	
	public int getValue() {
		return value;
	}
}
