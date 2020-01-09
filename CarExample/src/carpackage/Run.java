package carpackage;

public class Run {

	
	
	
	
	public static void main(String[] args) {
		Car myCar = new Car("toyota",1980,4,"red");
		print(myCar.getDoor_count());
		Car myCar2 = new Car("red");
		print(myCar);
		print(myCar2);
	}
	
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
