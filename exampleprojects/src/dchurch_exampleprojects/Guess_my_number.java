package dchurch_exampleprojects;

import static java.lang.System.out;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Guess_my_number {
	
	public Guess_my_number() {
		/*roll_dice();
		int random_num = (int)(System.currentTimeMillis()%10);
		print(random_num);
		
		double random_num2 = (int)(Math.random()*10);
		print(random_num2);
		
		int random_num4 = ThreadLocalRandom.current().nextInt(1,100);
		print(random_num4);
		
		flip_coin();
	*/	Scanner input = new Scanner(System.in);
		int option = 0;
		while (option != 10) {
			print("Welcome to the Guess my number game");
			print("please select the loop style you would like to use");
			print("press 1 for a for loop");
			print("press 2 for a while loop");
			print("press 3 for a do loop");
			print("press 4 to flip a coin");
			print("press 5 to roll some dice");
			option = input.nextInt();
			switch(option) {
			case 1: 
				print("for loop");
				for_loop_guess(input);
				break;
			case 2: 
				print("while loop");
				while_loop_guess();
				
				break;
			case 3: 
				print("do loop");
				do_guess();
				break;
			case 4: 
				print("coin");
				flip_coin();
				break;
			case 5: 
				print("dice");
				roll_dice();
				break;
			case 6: 
				print("quit");
				option = 10;
				break;
				
			case 7:
				print("computer guess");
				com_guess();
				break;
				
			default:
				print("That's not an option");
				option = 0;
				
			}
		}

	}
	
	public void flip_coin() {
		int coin = ThreadLocalRandom.current().nextInt(1,3);
		if (coin == 1) {
			print("Heads");
		}
		else {
			print("tails");
		}
	}
	public void roll_dice() {
		int die1;
		int die2;
		
		die1 = (int)(Math.random()*10);
		die2 = (int)(Math.random()*10);
		
		print(die1);
		print(die2);
	}
	
	public void while_loop_guess() {
		Scanner input = new Scanner(System.in);
		print("pick a number between 1 and 10. You get 3 tries.");
		
		int guess = input.nextInt();
		int random_num2 = (int)(Math.random()*10)+1;
		int trys = 0;
		int max_trys = 1;
		
		while(guess != random_num2 && trys <= max_trys) {

				print("Try again.\n");
				trys++;
				print("pick a number between 1 and 10");
				guess = input.nextInt();
				
				
		
		}
		if (guess == random_num2) {
			print("you got it right\n");
		}
		else {
			print("You lost");
			print("The number was " + random_num2+" \n");
		} 
		
		
	
		
		
	}
	
	public void for_loop_guess(Scanner input) {
		print("pick a number between 1 and 10");
		int guess = input.nextInt();
		int trys = 0;
		int max_trys = 1;
		int random_num2 = (int)(Math.random()*10)+1;
		
		for(trys = 0;trys<3 && guess != random_num2 ; trys++) {
			print("nope try again");
			print("pick a number 1-10");
			guess = input.nextInt();
		}
			if (guess == random_num2) {
				print("you got it right\n");
			}
			else {
				print("You lost");
				print("The number was " + random_num2+" \n");
			} 
			
		}
	
	public void do_guess() {
		Scanner input = new Scanner(System.in);
		int random_num2 = (int)(Math.random()*10)+1;
		
		print("pick a number between 1 and 10. You get 3 tries.");
		print(random_num2);
		
		int guess = input.nextInt();
		int trys = 0;
		int max_trys = 1;


		
		do {
				
				
				print("Try again.\n");
				trys++;
				print("pick a number between 1 and 10");
				guess = input.nextInt();

				
		}
		while(guess != random_num2 && trys <= max_trys);
		if (guess == random_num2) {
			print("you got it right\n");
		}
		else {
			print("You lost");
			print("The number was " + random_num2+" \n");
		} 
		
		
	
		
		
	}
	
	public void com_guess() {
		Scanner input = new Scanner(System.in);
		
		int max = 10;
		int min = 0;
		
		int random = (int)(Math.random() * 10) + 1;

		
		
		print("The computer will guess your number");
		print("Think of a number the computer will guess it");

		int num = input.nextInt();

		while(num != random) {

				print("The computer guesses " + random );
				print("Is this number right (y/n)");
				String q = input.next();
				if (q == "y") {
					print("The computer guessed your number");
					break;
				}
				if (q == "n") {
					print("The computer will try again");
					break;
				}
				else {
					print("enter a valid answer");
				}
				
				
		
		}

		
		
		
		
		
	}
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	

		

	public static void main(String[] args) {
		new Guess_my_number();
		
	}

}
