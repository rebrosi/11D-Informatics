package uti;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
		System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("X: "   +x     +", Y: "  +y      );
        sc.close();
	}

}
