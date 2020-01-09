package oop;
import java.util.Scanner;


public class Human {
	String eyeColor;
	String hairColor;
	String hairLen;
	String height;
	String nat;
	String skinColor;
	int lbs;
	int iq;
	String fName;
	String lName;
	String midName;
	String gender;
	int age;
	
	
	
	public Human() {
		Scanner input = new Scanner(System.in);
		print("first name ?");
		fName = input.nextLine();
		print("Middle Name ?");
		midName = input.nextLine();
		print("Last name ?");
		lName = input.nextLine();
		print("eyecolor ?");
		eyeColor = input.nextLine();
		print("Hair Length ?");
		hairLen = input.nextLine();
		print("Height ?");
		height = input.nextLine();
		print("Nationality ?");
		nat = input.nextLine();
		print("Skin Color ?");
		skinColor = input.nextLine();
		print("eyecolor ?");
		lbs = input.nextInt();
		
		
		eyeColor = input.nextLine();
		
	}
	
	
	public void intro() {
		print("Hi, my first name is "+fName);
		print("My middle name is "+midName);
		print("And my last name is "+lName);
		print("My eyes are "+eyeColor);
		print("My hair length is "+hairLen);
		print("I am "+height+" tall");
		print("I was born in "+ nat);
		print("My skincolor is "+skinColor);
		print("My weight is"+lbs);
		print("My iq is "+ iq);
		print("My gender is "+gender);
		print("I am "+age+"years old");
		
		
		
		
		

	}
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	

	
	

}
