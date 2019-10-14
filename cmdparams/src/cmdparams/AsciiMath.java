 package cmdparams;

import java.util.Scanner;

public class AsciiMath {

	public static void main(String[] args) {
		  
		  

		Scanner input = new Scanner(System.in);
		  
		  

		//Volume of a cube


		    //declare variables
				int side_length = 0;
				int volume;
				String units;
				
		    //Getting the info for the units
				System.out.println("Enter a unit of measurment");
				units = input.nextLine();
				
		    //Getting info for the side length
				System.out.println("What is the side length of your cube?");
		    
		    //If statement for checking if its a number or not
				if (input.hasNextInt()) {
					side_length = input.nextInt();
				}
				else {
					side_length = 0;
					System.out.println("Error in code defaulting to 0");
					
				
				}
				input.nextLine();
		    //Does the math
				volume = side_length*3;
				
		    //Ascii art
				System.out.println("Your volume is "+ volume + units);
				System.out.println("    _______            \r\n" + 
						"  /\\       \\           \r\n" + 
						" /  \\       \\          \r\n" + 
						"/    \\_______\\         \r\n" + 
						"\\    /       /         \r\n" + 
						" \\  /       /          \r\n" + 
						"  \\/_______/  ");

		  
		  
		  
		  
		  
		  
		  
		  
		  	
		
		//Circumfrence of a circle

				double radius;
				String cunit;
				
		   //For inputing any measurment you'd like
				System.out.println("Please input your measurment of choice: ");
				if (input.hasNextLine())
				{
				cunit = input.nextLine();
				}
				
				
				else
				{
				cunit = "ft";
				};
		    
			 //Radius so the math will work
				System.out.println("Please input your radius of the circle: ");
		    
		   //This if statement is so people cant break it with a string
				if (input.hasNextDouble())
				{
				radius = input.nextDouble();
				}
				
				
				else
				{
				radius = 0;
				}
				input.nextLine();
		   //Quick maths
				double circum = 2*3.14*radius;
				
			 //ASCII art of circle
				String circle = String.format("     OOOOOOOOO     \r\n" + 
						"   OO         OO   \r\n" + 
						" OO             OO \r\n" + 
						"O                 O\r\n" + 
						"O                 O\r\n" + 
						"O                 O\r\n" + 
						"O                 O\r\n" + 
						" OO             OO \r\n" + 
						"   OO         OO   \r\n" + 
						"     OOOOOOOOO %1$s %2$s    \n\n", circum, cunit );
				
				System.out.println(circle);
		    
		    
		    
		//Area of a triangle
				
		String t_unit;
		double base;
		double height;
		
		System.out.print("Area of a Triangle Calculator");
		System.out.println("");
		
		System.out.print("Enter unit then press Enter: ");
        t_unit = input.nextLine();
        //asks the user to input their unit
        
 
      //base measurement input 
        System.out.print("Enter base measurement:  ");
        if (input.hasNextDouble())
        { base = input.nextDouble(); 
        	input.nextLine(); }
        //if statement checks to make sure input is a double		
        
        else
        { base = 0;
          System.out.println("Invalid input");  
          input.nextLine();  }
        //if the input is not a double then it tells the user that they entered an invalid input
        
        //height measurement input
        System.out.print("Enter height measurement: ");
        if (input.hasNextDouble())
        { height = input.nextDouble(); 
        	input.nextLine();  }
        //if statement checks to make sure input is a double		
        
        else
        { height = 0;
        	System.out.println("Invalid input"); 
        	input.nextLine();  } 
       //if the input is not a double then it tells the user that they entered an invalid input        
        
       double tri_area = base * height * 0.5;
       //calculates the area using the given inputs
       
       String tri_area2 = String.format("%.2f", tri_area);
       //formats the area to only have two decimal points
    		   
       
       String triangle = String.format("          AAA               \r\n" + 
				"         A   A              \r\n" + 
				"        A     A             \r\n" + 
				"       A       A            \r\n" + 
				"      A         A           \r\n" + 
				"     A           A          \r\n" + 
				"    A             A         \r\n" + 
				"   A               A        \r\n" + 
				"  A                 A       \r\n" + 
				" AAAAAAAAAAAAAAAAAAAAA  %1$s  \n\n", tri_area2 + t_unit );
       //puts the result into an Ascii Art to display results
       
       System.out.println(triangle);
       
      
       
     //Area and perimeter of a square


	    double side, peri, area;//States side, peri, area as variables
	    
	    	System.out.println("Enter Measurement : ");//Prints text
	    	String Measurement = input.nextLine();// Creates variable
			
	        System.out.print("Enter Side Length of Square : ");//Prints out text
	        if (input.hasNextDouble())
			{
			side = input.nextDouble();
			}
			
			
			else
			{
			side = 0;
			input.nextLine();
			}// places the side number


	        
	        area = side*side;// Multiplies sides
	        peri = 4*side;// Multiplies sides by 4
			
	        System.out.println("Area = " +area+Measurement ); // Prints area + Measurement
			
	        System.out.println("\nPerimeter = " +peri+Measurement);// Prints peri + Measurement
	        
	        String square = String.format(".------"+side+Measurement+"------. \r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
		""+side+Measurement+"          "+side+Measurement+"\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
			"'------"+side+Measurement+"------' Area: %1$s %2$s Perimiter: %3$s %2$s       \n\n", area, Measurement, peri);
		System.out.println(square);// Prints out square and additional measurements along with the area and peri
			
	    
	    
       
       input.close();


			}

		
}
