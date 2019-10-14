package flow;

import java.util.Scanner;

public class flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Relational operators
		// < > <= >= == !=
		Scanner input = new Scanner(System.in);
		
		
		String user_name = "hello";
		int password = 12345;
		
		System.out.println("enter your username");
		String x = input.nextLine();
		
		System.out.println("enter in your pin number");
		int y = input.nextInt();
		
		if (x.equals(user_name) && y == password) {
			System.out.println("you got in");
		}
		else if (x.equals(user_name)) {
			System.out.println("That is not the right password");
		}
			
		else if (y == password) {
			System.out.println("That is not the right username");
		}
		else {
			System.out.println("your not in");
			
		}
		System.out.println("thanks for trying my program");
		
	}

}
