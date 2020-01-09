package doghouse;

public class Drive {

	public static void main(String[] args) {
		Car car1 = new Car();
		IDrive car2 = new Car();
		IDrive ride1 = new horse();
		
		car1.turnLeft();
		car2.turnLeft();
		car1.turnRight();
		car2.turnRight();
		car1.reverse();
		car2.reverse();
		car1.radio.power_on_off();
		car1.radio.vUp();
		car1.radio.vUp();
		car1.radio.vUp();
		car1.radio.vUp();
		car1.radio.vUp();
		car1.radio.vUp();
		car1.radio.vUp();
		car1.radio.getvol();
		
		ride1.shiftGears();
	}

}
