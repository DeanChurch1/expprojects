 package jbPlayers;

public class Deputy extends abstractGamePiece {

	@Override
	public boolean canMoveToLocation(int targetRow, int targetCol) {
		System.out.println("testing this method from deputy");
		return false;
	}

}
