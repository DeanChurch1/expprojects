package textadventure;
import java.util.Scanner;
import java.util.Random;

public class TextAdventure {
	static int hammer = 0;
	static int key = 0;
	
	public TextAdventure() {
		print("Welcome to my Text Based Adventure Game.......");
		print("You awake to find your self lying in a bed. You're in a room with a door and dresser.");
		print("Enter 1 to go to the door ");
		print("Enter 2 to go to the dresser");
		main();
}

		
	public void main() {
		Scanner input = new Scanner(System.in);

		
		int choice = input.nextInt();
		int option = 0;
		while (option != 10) {
		
			switch (choice) {
	        case 1:
	            choice1();
	            break;
	        case 2:
	            choice2();
	            break;
	
	        default:
	            print("Not a choice");
	            main();
			}
		}
	}
	
	
	
	public void choicedoor() {
		Scanner input = new Scanner(System.in);
		
		String choice = input.nextLine();
		
		if(choice.contentEquals("open door")) {
			choice1();			
		}
		else if(choice.contentEquals("open dresser")) {
			choice2();
		}
		else {
			print("sorry don't know what that means");
		}
			
}
	
	
	
	
	public void choice1() {
		Scanner input = new Scanner(System.in);
		print("The door is locked");
		main();
		
		
	}
	
	public void choice2() {
		Scanner input = new Scanner(System.in);
		print("There is three drawers, top, middle, and bottom. Which one do you want to open?");
		String choice = input.nextLine();
		if (choice.contentEquals("top")) {
			print("There is nothing in this drawer");
			choice2();
		}
		if(choice.contentEquals("middle")) {
			print("Theres a hammer");
			String take = input.nextLine();
			if (take.contentEquals("take hammer")) {
				print("You have taken the hammer");
				hammer = 1;
				choice2();
			}

						
		}
		if(choice.contentEquals("bottom")) {
			print("An imp is in this drawer.");
			if (hammer == 1) {
				print("attack the imp with the hammer");
				print("The imp is dead");
				
			}
			else {
				print("The imp jumps up and cuts your face off");
				print("Game Over");
				System.exit(0);
				
			}
		}
		else {
			print("I don't know what that means");
			choice2();
		}
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	public static void main(String[] args) {
		new TextAdventure();
		
	}
	
	
}
