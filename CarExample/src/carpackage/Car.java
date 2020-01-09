package carpackage;

import java.util.Scanner;

public class Car {
	private String brand;
	private int year;
	private String body_style;
	private String make;
	private int door_count;
	String color;
	
	public Car() {
		Scanner input = new Scanner(System.in);
		print("what brand of car do you have");
		brand = input.nextLine();

		print("what kind of body style is your car");
		body_style = input.nextLine();
		
		print("what make of car do you drive");
		make = input.nextLine();

		print("What color is your car");
		color= input.nextLine();

		print("how many doors on your car");
		door_count = input.nextInt();
		
		print("what year is your car");
		year = input.nextInt();	
	}
	
	public Car(String brandx, int yearx, int doorsx, String colorx) {
		brand = brandx;
		year = yearx;
		door_count = doorsx;
		color = colorx;
		
	}
	
	
	
	
	public Car(String color) {
		super();
		
		this.brand ="toyota";
		this.year = 2;
		this.body_style = "boat";
		this.make = "idk";
		this.door_count = 2;
		this.color = color;
	}

	public Car(String brand, int year, String body_style, String make, int door_count, String color) {
		super();
		this.brand = brand;
		this.year = year;
		this.body_style = body_style;
		this.make = make;
		this.door_count = door_count;
		this.color = color;
	}

	public void drive() {
		
	}
	
	public void start() {
		
	}
	
	public void stop() {
		
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}



	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getYear() {
		return year;

		
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String getBody_style() {
		return body_style;
	}



	public void setBody_style(String body_style) {
		this.body_style = body_style;
	}



	public int getDoor_count() {
		return door_count;
	}



	public void setDoor_count(int door_count) {
		this.door_count = door_count;
	}




	
}
