package jbgame;

import jbPlayers.Deputy;
import jbPlayers.Kingpin;
import jbPlayers.abstractGamePiece;

public class Game {

	public static void main(String[] args) {
		Deputy piece = new Deputy();
		piece.myAbbreviation = "D";
		piece.myName = "Deputy";
		piece.row = 1;
		piece.col = 7;
		System.out.println(piece.myName + " created at row " + piece.row + ", col " + piece.col);
		System.out.println("canMoveToLocation() returns: "+ piece.canMoveToLocation(0,0));

		
		Kingpin piece3 = new Kingpin();
		piece3.myAbbreviation = "K";
		piece3.myName = "Kingpin";
		piece3.row = 4;
		piece3.col = 4;
		System.out.println(piece3.myName + " created at row " + piece3.row + ", col " + piece3.col);
		System.out.println("canMoveToLocation() returns: "+ piece3.canMoveToLocation(0,0));
		System.out.println("canMoveToLocation() returned: "+ piece3.hasEscaped());
		
		Deputy[] deputies = new Deputy[16];
		deputies[0] = piece;
		
		abstractGamePiece[] alltokens = new abstractGamePiece[25];
		alltokens[0] = piece3;
		alltokens[0] = piece;
		
		deputies[0].isCaptured();
		alltokens[0].isCaptured("testing");    
	}

}
