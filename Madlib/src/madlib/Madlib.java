package madlib;

import java.util.Scanner;

public class Madlib {

	public Madlib() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter a verb");
		String verb = input.nextLine();
		System.out.println("Thanks");
		
		System.out.println("enter an adjective");
		int adj1 = input.nextInt();
		System.out.println("Thanks");
		
		System.out.println("enter an adjective");
		int adj2 = input.nextInt();
		System.out.println("Thanks");
		
		System.out.println("enter a plural noun");
		
		String plural_noun = input.nextLine();
		System.out.println("Thanks");
		
		System.out.println("enter another plural noun");
		
		String plural_noun2 = input.nextLine();
		System.out.println("Thanks");
		
		System.out.println("enter noun");
		
		String noun = input.nextLine();
		System.out.println("Thanks");
		
		System.out.println("enter adjective");
		
		String adj3 = input.nextLine();
		
		
		
		
		System.out.println("Halloween is the best time to "+verb);
		System.out.println("The weather is "+adj1+"and"+adj2+ 
				"and you go door to door saying 'Trick or Treat'");
		System.out.println("And people give you "+plural_noun+"and"+plural_noun2+ "to eat");
		System.out.println("This year, I will dress up as a "+ noun + ""+""+"");
		System.out.println("Or maybe a " + "");
		
		input.close();

	}

}
