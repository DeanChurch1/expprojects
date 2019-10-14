package dchurch_exampleprojects;

import java.util.Scanner;

public class B_day_guess {
	
	public B_day_guess() {
	
	
		String set1 = " 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 ";
		String set2 = " 2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
		String set3 = " 4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31";
		String set4 = " 8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
		String set5 = " 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
		
		String set6 = " 1 3 5 7 9 11";
		String set7 = " 2 3 6 7 10 11";
		String set8 = " 4 5 6 7 12";
		String set9 = " 8 9 10 11 12";
		
		String set10 = " 2001 2003 2005 2007 2009 2011";
		String set11 = " 2002 2003 2006 2007 2010 2011";
		String set12 = " 2004 2005 2006 2007 2012";
		String set13 = " 2008 2009 2010 2011 2012 ";
		
		int year = 2000;
		int month = 0;
		int day = 0;
		Scanner input = new Scanner(System.in);
		

		/*11111000110 1990
		11111000111 1991
		11111001000 1992
		11111001001 1993
		11111001010 1994
		11111001011 1995
		11111001100 1996
		11111001101 1997
		11111001110 1998
		11111001111 1999
		11111010000 2000
		11111010001 2001
		11111010010 2002
		11111010011 2003
		11111010100 2004
		11111010101 2005
		11111010110 2006
		11111010111 2007
		11111011000 2008
		11111011001 2009 
		11111011010 2010
		11111011011 2011
		11111011100 2012
		*/
		
		//Year
		
		System.out.println("is your birth year in this set of numbers?      ");
		System.out.println(set10);
		System.out.println("enter n for No and y for yes");
		char answer = input.next().charAt(0);
		
		if (answer == 'y') {
			year += 1 ;
		}
		
		System.out.println("is your birth year in this set of numbers?      ");
		System.out.println(set11);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			year +=  2;
		}
		System.out.println("is your birth year in this set of numbers?      ");
		System.out.println(set12);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			year += 4 ;
		}
		System.out.println("is your birth year in this set of numbers?      ");
		System.out.println(set13);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			year += 8 ;
			
			

		}
		System.out.println("");
		System.out.println("Your birth year is "+ year);
		


		
		//Month
		System.out.println("is your month in this set of numbers?      ");
		System.out.println(set6);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			month += 1;
		}
		
		System.out.println("is your month in this set of numbers?      ");
		System.out.println(set7);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			month += 2;
		}
		
		
		System.out.println("is your month in this set of numbers?      ");
		System.out.println(set8);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			month += 4;
		}
		
		
		System.out.println("is your month in this set of numbers?      ");
		System.out.println(set9);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			month += 8;
		}
		
		System.out.println("Your birthday month is " + month);	
		System.out.println("");
		System.out.println("");
		System.out.println("");
	
		
		
		
		
		//day
		System.out.println("is your birth day in this set of number?      ");
		System.out.println(set1);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			day += 1;
		}
		
		System.out.println("is your birth day in this set of number?      ");
		System.out.println(set2);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			day += 2;
		}
		
		System.out.println("is your birth day in this set of number?      ");
		System.out.println(set3);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			day += 4;
		}
		
		System.out.println("is your birth day in this set of number?      ");
		System.out.println(set4);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			day += 8;
		}
		
		System.out.println("is your birth day in this set of number?      ");
		System.out.println(set5);
		System.out.println("enter n for No and y for yes");
		answer = input.next().charAt(0);
		
		if (answer == 'y') {
			day += 16;
	}
	System.out.println("");
	System.out.println("");
	System.out.println("");
	
	System.out.println("Your birthday month is " + month  +" and your birthday day is " + day);
	System.out.println(month+"/"+day+"/"+year);
	}

	public static void main(String[] args) {
		new B_day_guess();

	}

}



