package debugging;

public class Debugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int numerator = 14;
		   int denominator1 = 3 + 4;   // do some math
		   int denominator2 = 7;

		  int result = numerator / (denominator1 - denominator2);   
		  System.out.println("result is: " + result);
		}
		catch(Exception e) {
			System.out.println("dkfjd");
			System.out.println(e);
			String message = e.getMessage();
			System.out.println(message);
			if (message.contentEquals("/ by zero")) {
				message = "go back to 4th grade";
			}
			System.out.println(message);
		}
		System.out.println("ran this far");
		
		try {
			String username = "elemer";
			char firstLetter = username.charAt(-1);
			System.out.println("First char: " + firstLetter);
		}	
		catch(Exception ex) {
			String mes = ex.getMessage();
			if (mes.contains("index")) {
				System.out.println("must choose a number in the range of ");
			}
		}
		
		try {
		String myString = null;
		    int length = myString.length();
		    System.out.println("String length = " + length);
		}
		catch(Exception x) {
			
		}
		
	}

}
