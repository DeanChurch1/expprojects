package doghouse;

import java.util.Scanner;

public class Dog {
	
	
	
	// declare and initialize private member variables here	
	   private int numTimesFed = 0;
	   private boolean sleeping = false;
	   private String name = "Ruffer";
	   
	   public Dog(String name) {
		   print("What is your dog's name");
		   this.name = name;
		   print("you named your dog " + getName());

	   }
	   
	   public Dog() {
		   Scanner input = new Scanner(System.in);
		   print("What is your dog's name");
		   this.name = input.nextLine();
		   print("you named your dog " + getName());
		   this.sleeping = true;
		   print(this.sleeping);
		   wakeUp();
	   }
	   
	   public Dog(int fed) {
		   Scanner input = new Scanner(System.in);
		   print("What is your dog's name");
		   this.name = input.nextLine();
		   print("you named your dog " + getName());
		   this.sleeping = true;
		   print(this.sleeping);
		   wakeUp();
	   }
	   

	   public String getName(){
		   return name;
	   }

	   public void wakeUp(){
		   print("Waking up");
		   sleeping = false;
		   numTimesFed = 0;
	   }

	   public void sleep(){
		   sleeping = true;
		   print("sleeping");
	   }

	   public void hear(String sound){
		   if(sleeping == true) {
			   return;
		   }
		   if(sound.equals(name)) {
			   print("Wag Tail");
		   }
		   else if (sound.contentEquals("ding-dong")) {
			   print("bark");
		   }
		   else {
			   print("Nothing happened");
		   }
	   }

	   public void feed(){
		   if(sleeping == true) {
			   return;
		   }
		   numTimesFed += 1;
		   if(numTimesFed>2) {
			   print("yawn");
		   }
		   else {
			   print("Yummy");
		   }
	   }
	   
	   public static void print(Object o) {
			System.out.println(o.toString());
		}
}
