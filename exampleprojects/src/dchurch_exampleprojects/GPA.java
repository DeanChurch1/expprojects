package dchurch_exampleprojects;

import java.util.Scanner;

public class GPA {


	public GPA() {
	
		Scanner input = new Scanner(System.in);
		double gpa = 0;
	
		System.out.println("Type in GPA and press enter: ");
		if (input.hasNextDouble()) {
			gpa = input.nextDouble();
		}
		else {
			String error = input.next();
			System.out.println("Try again");
		}
		
		input.nextLine();
	
		System.out.println("Your GPA is "+ gpa);
	
		input.close();
	
}
	public static void main(String[] args)
   {
		new GPA();
	
	
	
	
	
   }
}				