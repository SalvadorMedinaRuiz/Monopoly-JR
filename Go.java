/*Authors: Salvador Medina-Ruiz and Marshall Figgins
 * Monopoly Junior Project 1
 * 10/16/21
 * COSC 221: A class where we code stuff and sometimes it works.
 */

import java.util.ArrayList;

public class Go extends BoardSpace {
		
		String currentGoSpace;
		
	public Go(String currentGoSpace) {
		this.currentGoSpace=currentGoSpace;
	}
	
	public void onLanding(Player currentPlayer, ArrayList <Player> fourPlayers) {
		System.out.println(currentPlayer.getPlayerName() + " has landed or passed GO." + currentPlayer.getPlayerName() + " gets $2");
		currentPlayer.addCash(2);
	}
}
