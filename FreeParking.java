/*Authors: Salvador Medina-Ruiz and Marshall Figgins
 * Monopoly Junior Project 1
 * 10/16/21
 * COSC 221: A class where we code stuff and sometimes it works.
 */

import java.util.ArrayList;

public class FreeParking extends BoardSpace{
	
	public FreeParking() {
		
	}
	
	public void onLanding(Player currentPlayer, ArrayList <Player> fourPlayers) {
		System.out.println("Welcome " + currentPlayer.getPlayerName() + ", go ahead and park for free!");
	}
}
