package cmdparams;

import java.util.Scanner;

public class Geometry {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int side_length = 0;
		int volume;
		String units;
		
		System.out.println("Enter a unit");
		units = input.nextLine();
		
		System.out.println("What is the side length of your square?");
		if (input.hasNextInt()) {
			side_length = input.nextInt();
		}
		else {
			System.out.println("RESTART THE PROGRAM AND ENTER A NUMBER");
		
		}
		
		volume = side_length*3;
		
		System.out.println("Your volume is "+ volume + units);
		System.out.println("    _______            \r\n" + 
				"  /\\       \\           \r\n" + 
				" /  \\       \\          \r\n" + 
				"/    \\_______\\         \r\n" + 
				"\\    /       /         \r\n" + 
				" \\  /       /          \r\n" + 
				"  \\/_______/  ");
		
		input.close();

		
	}
}
