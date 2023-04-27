/*Authors: Salvador Medina-Ruiz and Marshall Figgins
 * Monopoly Junior Project 1
 * 10/16/21
 * COSC 221: A class where we code stuff and sometimes it works.
 */

import java.util.Random;
import java.util.ArrayList;

public class Monopoly_Jr {
	
	private static int currentPlayer; //decides who's turn it is
	
	private static ArrayList<Player> fourPlayers= new ArrayList<>(); //creates a new ArrayList of Players
	
	private static Die newDie= new Die();
	
	public static GameBoard newGame;
	
	public Monopoly_Jr(){
		
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the game of Monopoly JR!");
		
		fourPlayers.add(new Player ("Toy Boat", 16, 0, false, 0)); //Player 0
		fourPlayers.add(new Player ("Toy Car", 16, 0, false, 1)); //Player 1
		fourPlayers.add(new Player ("Little Hazel", 16, 0, false, 2)); //Player 2
		fourPlayers.add(new Player ("Little Scottie", 16, 0, false, 3)); //Player 3
		
		newGame = new GameBoard();
		
		
		Random rand = new Random();
		int randomStart= rand.nextInt(4); //decides what player gets to go first
		if (randomStart==0) {
			currentPlayer=0; //Player is Toy Boat
		}
		else if (randomStart==1) {
			currentPlayer=1; //Player is Toy Car
		}
		else if (randomStart == 2) {
			currentPlayer=2; //Player is Little Hazel
		}
		else if(randomStart == 3) {
			currentPlayer=3; //Player is Little Scottie
		}
		
		
		do {
			//roll die
			newDie.roll();
			System.out.println(fourPlayers.get(currentPlayer).getPlayerName() + " Rolled a: " + newDie.getFaceValue()); //Says who rolled and what they got
			
			//handle space player lands on
			fourPlayers.get(currentPlayer).changeCurrentPosition(newDie.getFaceValue()); //changes current position with current die face value
			newGame.boardSpace.get(fourPlayers.get(currentPlayer).getCurrentPosition()).onLanding(fourPlayers.get(currentPlayer), fourPlayers); //takes the current player and their current position, and goes the corresponding boardSpace array value
			
	
			//FIX BOTTOM CODE
			if(fourPlayers.get(currentPlayer).getCurrentCash()<=0) { //check if the current Player is bankrupt and ends the game if yes
				break;
			}
			
			
			currentPlayer+=1; //Updates the current Player
			if (currentPlayer > 3) { // if currentPlayer if bigger than 3, then it loops back to Toy Boat's turn
				currentPlayer=0;
			//
			}
			
		}while(fourPlayers.get(currentPlayer).getCurrentCash()>0);
		
		int max = Math.max(Math.max(fourPlayers.get(0).getCurrentCash(), fourPlayers.get(1).getCurrentCash()), Math.max(fourPlayers.get(2).getCurrentCash(), fourPlayers.get(3).getCurrentCash()));
		
		System.out.println("Game is over!");
		
		if (fourPlayers.get(0).getCurrentCash()==max) {
			System.out.println("The player who won is: " + fourPlayers.get(0).getPlayerName());
		}
		else if(fourPlayers.get(1).getCurrentCash()==max) {
			System.out.println("The player who won is: " + fourPlayers.get(1).getPlayerName());
		}
		else if(fourPlayers.get(2).getCurrentCash()==max) {
			System.out.println("The player who won is: " + fourPlayers.get(2).getPlayerName());
		}
		else{
			System.out.println("The player who won is: " + fourPlayers.get(3).getPlayerName());
		}

		System.out.println("Cash amounts: \n" + fourPlayers.get(0).getPlayerName() + " finished the game with $" + fourPlayers.get(0).getCurrentCash());
		System.out.println("\n" + fourPlayers.get(1).getPlayerName() + " finished the game with $" + fourPlayers.get(1).getCurrentCash());
		System.out.println("\n" + fourPlayers.get(2).getPlayerName() + " finished the game with $" + fourPlayers.get(2).getCurrentCash());
		System.out.println("\n" + fourPlayers.get(3).getPlayerName() + " finished the game with $" + fourPlayers.get(3).getCurrentCash());
		
	}
}
