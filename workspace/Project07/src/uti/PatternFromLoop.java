package uti;

public class PatternFromLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int rows = 7; rows > 0; rows--) {
			for (int element = 0; element < rows; element++) {
				while(element < 7 - rows) {
					System.out.print(" ");
					element++;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
