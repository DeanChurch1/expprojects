package jbPlayers;

public class Kingpin extends abstractGamePiece {

	@Override
	public boolean canMoveToLocation(int targetRow, int targetCol) {
		System.out.println("testing this method from Kingpin");
		return false;
	}
	
	public boolean hasEscaped() {
		
		return true;		
	}
	
	@Override
	public boolean isCaptured() {
		System.out.println("is captured works");
		return false;
	}
	
	@Override
	public boolean isCaptured(String x) {
		System.out.println("is captured works"+x);
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.myName.equals(this.myName)) {
			
			return true;
		}
		
		
		
	}

}
