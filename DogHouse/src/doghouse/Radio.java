package doghouse;

public class Radio implements IRadio {
	int vol = 0;
	double chan = 89.0;
	boolean power = false;
	double pchan;
	
	public Radio() {
		vol = 20;
		chan = 106.7;
		
	}
	public void getvol() {
		print(this.vol);
	}
	
	
	@Override
	public void vUp() {
		if(power) {
			this.vol ++;
			if (this.vol > 100) {
				this.vol = 100;
			}
		}
		
	}

	@Override
	public void vDown() {
		if(power) {
			this.vol --;
			if (this.vol < 0) {
				this.vol = 0;
			}
		}

	}

	@Override
	public void lTuner() {
		if(power) {
			chan -= .10;
			if (chan < 89.0) {
				chan = 109.0;
			}
		}

	}

	@Override
	public void rTuner() {
		if(power) {
			chan += .10;
			if (chan < 109.0) {
				chan = 89.0;
			} 
		}

		
	}

	@Override
	public void power_on_off() {
		if(power == true) {
			power = false;
		}
		else {
			power = true;
		}
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
