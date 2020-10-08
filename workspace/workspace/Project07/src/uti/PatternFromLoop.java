package uti;

public class PatternFromLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spaces = 0;
		for (int rows = 7; rows > 0; rows--) {
			int elements = rows;
			for(int i = 7 - elements;i > 0 ;i--){
				System.out.print(" ");
			}
			while(elements > 0){
				System.out.print("*");
				elements--;
			}
			spaces++;
			System.out.println();
		}
	}

}
