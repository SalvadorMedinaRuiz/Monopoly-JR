/*Authors: Salvador Medina-Ruiz and Marshall Figgins
 * Monopoly Junior Project 1
 * 10/16/21
 * COSC 221: A class where we code stuff and sometimes it works.
 */

import java.util.ArrayList;

public class Jail extends BoardSpace{
	
	String currentJail;
	
	public Jail(String currentJail) {
		this.currentJail=currentJail;
	}
	
	public void onLanding(Player currentPlayer, ArrayList <Player> fourPlayers) {
		System.out.println("Go to Jail Do not Collect 2 Dollars");
		currentPlayer.changeCurrentPosition(12);
		if(currentPlayer.getOutOfJailCard == true) {
			currentPlayer.changeJailCardStatus(false);
		}
		else {
			currentPlayer.subtractCash(1);
		}
		
	}
}