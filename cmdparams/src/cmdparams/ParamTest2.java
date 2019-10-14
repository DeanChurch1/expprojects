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
		
		/*int i = 0;
		while(i < args.length) {
			System.out.println("Parameter "+ i + ":" + args[i]);
			i++;
		*/
		

		
		
		//String maiden;
		//float bank_baleance;
		
		
		String first;
		String last;
		String ssn;
		String birthdate;
		double num;
		
		System.out.println("Enter your first and last name, ssn, birthday");
		
		first = input.next();
		last = input.next();
		ssn = input.next();
		birthdate = input.next();
		num = input.nextInt();
		
		System.out.println("hello " + first +" "+ last);
		System.out.println("SSN = "+ssn);
		System.out.println("Birthday = "+birthdate);
		
		input.close();
		
		
		
		
	}

}
