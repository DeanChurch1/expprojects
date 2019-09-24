package cmdparams;
import java.util.Scanner;

public class ParamTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		/*
		if (args.length > 0) {
			System.out.println("Paramater 1:" + args[0]);
		}
		if (args.length >1) {
			System.out.println("Paramater 2:" + args[1]);
		}
		if (args.length >2) {
			System.out.println("Paramater 3:" + args[2]);
		}
		*/
		
		int i = 0;
		while(i < args.length) {
			System.out.println("Parameter "+ i + ":" + args[i]);
			i++;
		}
		System.out.println("enter your Name");
		String name = input.nextLine();
		System.out.println("Thanks");
		
		System.out.println("enter your age");
		int age = input.nextInt();
		System.out.println("Thanks");
		
		System.out.println("enter your graduation year");
		int gradyear = input.nextInt();
		System.out.println("Thanks");
		
		System.out.println("enter your favorite food");
		
		String fav_food = input.nextLine();
		System.out.println("Thanks");
		
		System.out.println("enter your phone #");
		
		String phone_number = input.nextLine();
		System.out.println("Thanks");
		
		System.out.println("enter your ssn");
		
		String ssn = input.nextLine();
		System.out.println("Thanks");
		
		System.out.println("enter your ccn");
		
		String credit_card_num = input.nextLine();

		
		//String maiden;
		//float bank_baleance;
		
		
		System.out.println("hello " + name);
		System.out.println("age: " + age);
		System.out.println("graduation year: " + gradyear);
		System.out.println("Favorite food " + fav_food);
		System.out.println("Phone number " + phone_number);
		System.out.println("Social Security # " + ssn);
		System.out.println("Credit card # " + credit_card_num);
		//System.out.println("hello " + name);
		//System.out.println("hello " + name);
		
		input.close();
		
		
		
		
	}

}
