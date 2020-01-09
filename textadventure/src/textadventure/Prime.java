package textadventure;

import java.util.Scanner;
import java.math.RoundingMode;



public class Prime {
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		print("enter a number");
		double test = input.nextDouble();
		
		
		if (isPrime(test)) {
			print("That is a prime number");			
		}

			print("That is not a prime number");
		}
		
	

	public static boolean isPrime(double number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    

	}

}
