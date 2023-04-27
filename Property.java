/*Authors: Salvador Medina-Ruiz and Marshall Figgins
 * Monopoly Junior Project 1
 * 10/16/21
 * COSC 221: A class where we code stuff and sometimes it works.
 */

import java.util.ArrayList;

public class Property extends BoardSpace{
	
	private String color;
	private int cost;
	
	private Player isOwner; //The player who currently owns the property
	private boolean currentlyOwned; //Checks if the property is currently owned
	private int ownerID=-99; //placeholder owner ID of the property
	
	String currentProperty; //just helps with telling me where I am
	
	public Property(String currentProperty, String color, int cost) {
		this.currentProperty=currentProperty;
		this.color=color;
		this.cost=cost;
	}
	
	public void onLanding(Player currentPlayer, ArrayList <Player> fourPlayers) {
		if(isOwner!=null) {
			if(isOwner.getBrownColorID()==2 || isOwner.getLBColorID()==2 || isOwner.getPinkColorID()==2 || isOwner.getOrangeColorID()==2 || isOwner.getRedColorID()==2 || isOwner.getYellowColorID()==2 || isOwner.getGreenColorID()==2 || isOwner.getBlueColorID() == 2) {
				cost = cost * 2;
			}
			if(currentPlayer.getPlayerID()!=ownerID && currentlyOwned==true) { //If the current players ownerID does not match the property ownerID AND is the property is currently owned, pay rent.
				currentPlayer.transferMoney(currentPlayer, isOwner, cost); //transfers the cost from the current player to the owner of the property
				System.out.println(currentPlayer.getPlayerName() + " has payed the rent of the property of " + currentProperty + " from " + isOwner.getPlayerName() + " for: $" + cost);
			}
			else if (currentPlayer.getPlayerID()==ownerID) { //if the owner id of the current player and the owner id of the current property match, go ahead and do nothing
				System.out.println(currentPlayer.getPlayerName() + " is the owner, so enjoy yourself!");
			}
		}
		else if(isOwner==null) {
		
		 //if property is not owned, then sets the current player to be the owner.
			setCurrentOwner(currentPlayer);
			currentPlayer.subtractCash(cost);
			System.out.println(currentPlayer.getPlayerName() + " has purchased " + currentProperty + " for: $" + cost);
		
		}
		
	}
	
	public void setCurrentOwner(Player currentPlayer) { //sets the current player to be the owner, sets their id to match the owner id in the property and sets currentlyowned to true.
		ownerID= currentPlayer.getPlayerID();
		isOwner=currentPlayer;
		currentPlayer.changeColorId(color);
		currentlyOwned=true;
	}
	
	public boolean getOwnership() {
		return currentlyOwned;
	}
	
	public Player getOwner() {
        return isOwner;
    }
	
	public String getColor() { //returns color
		return color;
	}
	
	public int getCost() { //returns cost
		return cost;
	}
}
