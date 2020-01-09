package doghouse;

import java.util.Scanner;

public class Car implements IDrive {
	int gear = 0;
	IRadio radio = new Radio();

	@Override
	public void turnLeft() {
		print("turn Left");
		
	}

	@Override
	public void turnRight() {
		print("turn right");
		
	}

	@Override
	public void SpeedUp() {
		print("Speeding up");
		
	}

	@Override
	public void SpeedDown() {
		print("Slowing down");
		
	}

	@Override
	public void reverse() {
		print("Going backwards");
		
	}

	@Override
	public void shiftGears() {
		Scanner input = new Scanner(System.in);
		String shift = input.nextLine();
		print("upshift press u downshift press d");
		if (shift.equals("u")) {
			this.gear++;
		}
		else if(shift.equals("d")) {
			this.gear--;
		}
		print(this.gear);
		
	}
 
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
