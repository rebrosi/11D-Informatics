package uti;

import java.util.Scanner;

public class MultiPlanetaryWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("What\'s your weight on planet Earth?");
		int weight = sc.nextInt();
		System.out.println("Choose a planet and write it down: \nMercury\nVenus\nMars\nJupiter\nSaturn\nUranus\nNeptune");;
		String planet = sc.next();
		switch (planet){
		case "Mercury":
			weight *= 0.38;
			System.out.println("Your weight on " + planet + " is " + weight + "kg.");
			break;
		case "Venus":
			weight *= 0.91;
			System.out.println("Your weight on " + planet + " is " + weight + "kg.");
			break;
		case "Mars":
			weight *= 0.38;
			System.out.println("Your weight on " + planet + " is " + weight + "kg.");
			break;
		case "Jupiter":
			weight *= 2.36;
			System.out.println("Your weight on " + planet + " is " + weight + "kg.");
			break;
		case "Saturn":
			weight *= 0.92;
			System.out.println("Your weight on " + planet + " is " + weight + "kg.");
			break;
		case "Uranus":
			weight *= 0.89;
			System.out.println("Your weight on " + planet + " is " + weight + "kg.");
			break;
		case "Neptune":	
			weight *= 1.13;
			System.out.println("Your weight on " + planet + " is " + weight + "kg.");
			break;
		}
	}

}
