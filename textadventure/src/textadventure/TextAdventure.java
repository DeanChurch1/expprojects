package textadventure;
import java.util.Scanner;
import java.util.Random;

public class TextAdventure {

	public TextAdventure() {
		print("Welcome to my Text Based Adventure Game.......");
		print("You awake to find your self lying in a bed. You're in a room with a door and dresser.");
		print("The dresser has 3 shelves.");
		Scanner input = new Scanner(System.in);
		
		String choice = input.nextLine();
		
		if(choice.contentEquals("open door")) {
			choice1();			
		}
		else if(choice.contentEquals("open dresser")) {
			choice2();
		}
		else {
			print("Sorry don't know what that means");
			
		}
	}
	
	public void choice1() {
		print("The door is locked");
		
	}
	
	public void choice2() {
		Scanner input = new Scanner(System.in);
		print("what drawer?");
		String choice = input.nextLine();
		if (choice.contentEquals("top drawer")) {
			print("There is nothing in this drawer");
		}
		else if(choice.contentEquals("middle drawer")) {
			print("Theres a hammer");
			
		}
		else if(choice.contentEquals("bottom drawer")) {
			
		}
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new TextAdventure();
		
	}
	
	
}
