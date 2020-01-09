package doghouse;

public class horse implements IDrive{

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
		// TODO Auto-generated method stub
		
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
