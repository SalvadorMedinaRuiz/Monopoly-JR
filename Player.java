/*Authors: Salvador Medina-Ruiz and Marshall Figgins
 * Monopoly Junior Project 1
 * 10/16/21
 * COSC 221: A class where we code stuff and sometimes it works.
 */

public class Player extends Property{
	
	private String name;
	private int cash;
	private int playerLocation;
	boolean getOutOfJailCard;
	
	private int oldPosition;
	
	private int ownerID;
	
	//creates color ids to keep track of owned properties of color
	private int brownColorID;
	private int lightBlueColorID;
	private int pinkColorID;
	private int orangeColorID;
	private int redColorID;
	private int yellowColorID;
	private int greenColorID;
	private int blueColorID;
	
	public Player(String name, int cash, int playerLocation, boolean getOutOfJailCard, int ownerID) { //integer from 0-24, does own get from jail card (boolean)
		super("p", "p", 0);
		this.name=name;
		this.cash=cash;
		this.playerLocation=playerLocation;
		this.getOutOfJailCard=getOutOfJailCard;
		
		this.ownerID=ownerID;
		
		this.oldPosition=0;
		
		brownColorID=0;
		lightBlueColorID=0;
		pinkColorID=0;
		orangeColorID=0;
		redColorID=0;
		yellowColorID=0;
		greenColorID=0;
		blueColorID=0;
	}
	
	public String getPlayerName() { //gets the players name
		return name;
	}
	
	public int getCurrentCash() { //gets the Player's cash
		return cash;
	}
	
	public void addCash(int cashAmount) { //adds cash to player's amount
		cash+= cashAmount;
	}
	
	public void subtractCash(int cashAmount) { //takes away cash from player's amount
		cash-= cashAmount;
	}
	
	public void changeCurrentPosition(int currentDieValue) { //changes current player's position in the board
		oldPosition= getCurrentPosition();
		playerLocation = (playerLocation + currentDieValue)%24;
		
		if(playerLocation<oldPosition) {
			System.out.println(getPlayerName() + " has passed Go. They get $2!");
			addCash(2);
		}
	}
	
	public int getCurrentPosition() { //gets the current Player's current position
		return playerLocation;
	}
	
	public int getPlayerID() {
		return ownerID;
	}
	
	public void transferMoney(Player currentPlayerPays, Player playerWhoGetsPaid, int cost) {
		currentPlayerPays.subtractCash(cost);
		playerWhoGetsPaid.addCash(cost);
	}
	
	
	public void changeJailCardStatus(boolean changeJailCardStatus) { //changes the getOutOfJailCard status to either true (player has the card) or false (player does not)
		getOutOfJailCard=changeJailCardStatus;
	}
	
	public boolean getJailCardStatus() { //returns the current status of the player having a getOutOfJailCard. 
		return getOutOfJailCard;
	}
	
	public void changeColorId(String color) { //changes colorid count based on the color
		switch (color) {
		case "Brown":
			brownColorID+=1;
			break;
		case "Light Blue":
			lightBlueColorID+=1;
			break;
		case "Pink":
			pinkColorID+=1;
			break;
		case "Orange":
			orangeColorID+=1;
			break;
		case "Red":
			redColorID+=1;
			break;
		case "Yellow":
			yellowColorID+=1;
			break;
		case "Green":
			greenColorID+=1;
			break;
		case "Blue":
			blueColorID+=1;
			break;
		}
	}
	
	//return colorid
	public int getBrownColorID() {
		return brownColorID;
	}
	
	public int getLBColorID(){
		return lightBlueColorID;
	}
	
	public int getPinkColorID() {
		return pinkColorID;
	}
	
	public int getOrangeColorID(){
		return orangeColorID;
	}
	
	public int getRedColorID() {
		return redColorID;
	}
	
	public int getYellowColorID(){
		return yellowColorID;
	}
	
	public int getGreenColorID() {
		return greenColorID;
	}
	
	public int getBlueColorID() {
		return blueColorID;
	}
}