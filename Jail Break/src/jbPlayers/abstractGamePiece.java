package jbPlayers;

public abstract class abstractGamePiece {
	static public final int PLAYER_OUTLAWS = 0;
	static public final int PLAYER_POSSE = 1;
	
	public int row;
	public int col;
	
	public int myPlayerType;
	public String myAbbreviation;
	public String myName;
	
	
	abstract public boolean canMoveToLocation(int targetRow, int targetCol);
	
	public boolean isCaptured() {
		System.out.println("is captured works");
		return false;
	}

	public boolean isCaptured(String x) {
		// TODO Auto-generated method stub
		return false;
	}

}
