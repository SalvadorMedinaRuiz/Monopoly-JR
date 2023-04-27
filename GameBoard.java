/*Authors: Salvador Medina-Ruiz and Marshall Figgins
 * Monopoly Junior Project 1
 * 10/16/21
 * COSC 221: A class where we code stuff and sometimes it works.
 */

import java.util.ArrayList;
import java.util.Random;

public class GameBoard{
		ArrayList<BoardSpace> boardSpace; //array of objects
    	
	
	public GameBoard() {
		boardSpace = new ArrayList<BoardSpace>();
		boardSpace.add(new Go("1")); //constructor Space 0
		boardSpace.add(new Property("Burger Joint", "Brown", 1)); //Space 1
		boardSpace.add(new Property("Pizza House", "Brown", 1)); //Space 2

		
		boardSpace.add(new Chance(3)); //Space 3
		boardSpace.add(new Property("Candy Store", "Light Blue", 2)); //Space 4
		boardSpace.add(new Property("Ice Cream Parlor", "Light Blue", 2)); //Space 5
		boardSpace.add(new Jail("1")); //FIX LATER YOU MORON!!! Space 6
		boardSpace.add(new Property("Museum", "Pink", 2)); //Space 7
		boardSpace.add(new Property("Library", "Pink", 2)); //Space 8
		
		boardSpace.add(new Chance(9)); //Space 9
		boardSpace.add(new Property("Skate Park", "Orange", 3)); //Space 10
		boardSpace.add(new Property("Swimming Pool", "Orange", 3)); //Space 11
		boardSpace.add(new FreeParking()); //Space 12
		boardSpace.add(new Property("Video Game Arcade", "Red", 3)); //Space 13
		boardSpace.add(new Property("Movie Theater", "Red", 3)); //Space 14
		
		boardSpace.add(new Chance(15)); //Space 15
		boardSpace.add(new Property("Toy Store", "Yellow", 3)); //Space 16
		boardSpace.add(new Property("Pet Store", "Yellow", 3)); //Space 17
		boardSpace.add(new Jail("Go To Jail")); //Space 18
		boardSpace.add(new Property("Bowling Alley", "Green", 4)); //Space 19
		boardSpace.add(new Property("The Zoo", "Green", 4)); //Space 20
		
		boardSpace.add(new Chance(21)); //Space 21
		boardSpace.add(new Property("Park place", "Blue", 5)); //Space 22
		boardSpace.add(new Property("Broadwalk", "Blue", 5)); //Space 23
		
	}	
	
	public ArrayList<BoardSpace> getboardspaces(){
        return boardSpace;
    }
}

