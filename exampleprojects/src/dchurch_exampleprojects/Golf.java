package dchurch_exampleprojects;

import java.util.Scanner;

public class Golf {

	public void GPA() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in GPA and press enter");
		
		double gpa = input.nextDouble();
		input.nextLine();
		
		System.out.println("Your GPA is "+gpa);
		
		input.close();
		
	}
	public static void main(String[] args)
	   {
		new GPA();
		
		
		
		
		
	   }
	}					

