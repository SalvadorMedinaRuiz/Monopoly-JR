/*Authors: Salvador Medina-Ruiz and Marshall Figgins
 * Monopoly Junior Project 1
 * 10/16/21
 * COSC 221: A class where we code stuff and sometimes it works.
 */

import java.util.*;
public class Chance extends BoardSpace{
	private int currentcard; 
	private int currentposition;
	Scanner kb = new Scanner(System.in);
	Player Owner;
	//Chance chance = new Chance();
	// need to access gameboard to check get ownership
	public Chance() {
		
	}
	public Chance(int currentposition) {
	this.currentposition = currentposition;
	}
	public void shuffledeck(){ // draws a random number between 1 and 19 which is then read in the switch statement as various cases
		currentcard = (int)(Math.random()*15);
		//return currentcard;
	}
	public int positiononboard(int currentposition) {
	this.currentposition = currentposition;
	return currentposition;
	}
	@Override
	public void onLanding(Player CurrentPlayer, ArrayList<Player> fourPlayers) { 
		System.out.println("Draw a Chance Card");
		shuffledeck();
		switch (currentcard) {
		case 0: 
			System.out.println("Move Forward 5 Spaces");
			CurrentPlayer.changeCurrentPosition(5); // moves player forward 5 spaces
			break;
		case 1: 
			System.out.println("You did your homework collect 2 dollars");
			CurrentPlayer.addCash(2); // adds two dollars to the players cash
			break;
		case 2:
			System.out.println("You ate too many sweets pay $2 to the bank");
			CurrentPlayer.subtractCash(2); // takes away two dollars
			break;
		case 3:
			System.out.println("Gain a get out of jail free card");
			CurrentPlayer.changeJailCardStatus(true); // gives the player a get out of jail free card
			break;
		case 4: System.out.println("Go to the nearest red or light blue space if unowned get it for free if none are unowned "
				+ "advance to nearest blue or redspace and pay rent to the owner");
		if(currentposition ==3) { //checks to see which chance place the player is on to know where to send a player 
			Property Candy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(4));
			if(Candy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(1); //changes the players location based on which is the closest
				Candy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property IceCream_Parlor  = (Property)(Monopoly_Jr.newGame.boardSpace.get(5));
			if(IceCream_Parlor.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(2);
				IceCream_Parlor.setCurrentOwner(CurrentPlayer);
			}
			Property VideoGame_Arcade = (Property)(Monopoly_Jr.newGame.boardSpace.get(13));
			if(VideoGame_Arcade.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(10);
				VideoGame_Arcade.setCurrentOwner(CurrentPlayer);
			}
			Property Movie_Theatre = (Property)(Monopoly_Jr.newGame.boardSpace.get(14));
			if(Movie_Theatre.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(11);
				Movie_Theatre.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(1);
				Player Owner = Candy_Store.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 2);
				}
			}
			
			
		}
		if(currentposition == 9) {
			Property VideoGame_Arcade = (Property)(Monopoly_Jr.newGame.boardSpace.get(13));
			if(VideoGame_Arcade.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(5);
				VideoGame_Arcade.setCurrentOwner(CurrentPlayer);
			}
			Property Movie_Theatre = (Property)(Monopoly_Jr.newGame.boardSpace.get(14));
			if(Movie_Theatre.getOwnership()){
				CurrentPlayer.changeCurrentPosition(6);
				Movie_Theatre.setCurrentOwner(CurrentPlayer);
			}
			Property Candy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(4));
			if(Candy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(19);
				Candy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property IceCream_Parlor  = (Property)(Monopoly_Jr.newGame.boardSpace.get(5));
			if(IceCream_Parlor.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(20);
				IceCream_Parlor.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(5);
				Player Owner = VideoGame_Arcade.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
			}
			
			
		}
		if (currentposition == 15) {
			Property Candy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(4));
			if(Candy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(13); //changes the players location based on which is the closest
				Candy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property IceCream_Parlor  = (Property)(Monopoly_Jr.newGame.boardSpace.get(5));
			if(IceCream_Parlor.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(14);
				IceCream_Parlor.setCurrentOwner(CurrentPlayer);
			}
			Property VideoGame_Arcade = (Property)(Monopoly_Jr.newGame.boardSpace.get(13));
			if(VideoGame_Arcade.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(22);
				VideoGame_Arcade.setCurrentOwner(CurrentPlayer);
			}
			Property Movie_Theatre = (Property)(Monopoly_Jr.newGame.boardSpace.get(14));
			if(Movie_Theatre.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(23);
				Movie_Theatre.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(13);
				Player Owner = Candy_Store.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 2);
				}
			}
			
		}
		if(currentposition == 21) {
			Property Candy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(4));
			if(Candy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(7); //changes the players location based on which is the closest
				Candy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property IceCream_Parlor  = (Property)(Monopoly_Jr.newGame.boardSpace.get(5));
			if(IceCream_Parlor.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(8);
				IceCream_Parlor.setCurrentOwner(CurrentPlayer);
			}
			Property VideoGame_Arcade = (Property)(Monopoly_Jr.newGame.boardSpace.get(13));
			if(VideoGame_Arcade.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(16);
				VideoGame_Arcade.setCurrentOwner(CurrentPlayer);
			}
			Property Movie_Theatre = (Property)(Monopoly_Jr.newGame.boardSpace.get(14));
			if(Movie_Theatre.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(17);
				Movie_Theatre.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(1);
				Player Owner = Candy_Store.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 2);
				}
			}
			
			
		}
		break;
		case 5: System.out.println("Go to the nearest orange or green space if unowned get it for free if none are unowned "
				+ "advance to nearest blue or redspace and pay rent to the owner");
		if(currentposition ==3) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(7); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
			Property Swimming_Pool  = (Property)(Monopoly_Jr.newGame.boardSpace.get(11));
			if(Swimming_Pool.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(8);
				Swimming_Pool.setCurrentOwner(CurrentPlayer);
			}
			Property Bowling_Alley = (Property)(Monopoly_Jr.newGame.boardSpace.get(19));
			if(Bowling_Alley.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(16);
				Bowling_Alley.setCurrentOwner(CurrentPlayer);
			}
			Property Zoo = (Property)(Monopoly_Jr.newGame.boardSpace.get(20));
			if(Zoo.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(17);
				Zoo.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(7);
				Player Owner = Skate_Park.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
			}
			
		}
		if(currentposition == 9) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(1); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
			Property Swimming_Pool  = (Property)(Monopoly_Jr.newGame.boardSpace.get(11));
			if(Swimming_Pool.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(2);
				Swimming_Pool.setCurrentOwner(CurrentPlayer);
			}
			Property Bowling_Alley = (Property)(Monopoly_Jr.newGame.boardSpace.get(19));
			if(Bowling_Alley.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(10);
				Bowling_Alley.setCurrentOwner(CurrentPlayer);
			}
			Property Zoo = (Property)(Monopoly_Jr.newGame.boardSpace.get(20));
			if(Zoo.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(11);
				Zoo.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(7);
				Player Owner = Skate_Park.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
			}
			
		}
		if (currentposition == 15) {
			Property Bowling_Alley = (Property)(Monopoly_Jr.newGame.boardSpace.get(19));
			if(Bowling_Alley.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(4); //changes the players location based on which is the closest
				Bowling_Alley.setCurrentOwner(CurrentPlayer);
			}
			Property Zoo  = (Property)(Monopoly_Jr.newGame.boardSpace.get(20));
			if(Zoo.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(5);
				Zoo.setCurrentOwner(CurrentPlayer);
			}
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if (Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(19);
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
			Property Swimming_Pool = (Property)(Monopoly_Jr.newGame.boardSpace.get(11));
			if(Swimming_Pool.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(20);
				Swimming_Pool.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(4);
				Player Owner = Bowling_Alley.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
			}
			
		}
		if(currentposition == 21) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(13); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
			Property Swimming_Pool  = (Property)(Monopoly_Jr.newGame.boardSpace.get(11));
			if(Swimming_Pool.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(14);
				Swimming_Pool.setCurrentOwner(CurrentPlayer);
			}
			Property Bowling_Alley = (Property)(Monopoly_Jr.newGame.boardSpace.get(19));
			if(Bowling_Alley.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(22);
				Bowling_Alley.setCurrentOwner(CurrentPlayer);
			}
			Property Zoo = (Property)(Monopoly_Jr.newGame.boardSpace.get(20));
			if(Zoo.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(23);
				Zoo.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(13);
				Player Owner = Skate_Park.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
			}
			
		}
		break;
		case 6: System.out.println("Go to the nearest pink or dark blue space if unowned get it for free if none are unowned "
				+ "advance to nearest blue or redspace and pay rent to the owner");
		if(currentposition ==3) {
			Property Museum = (Property)(Monopoly_Jr.newGame.boardSpace.get(7));
			if(Museum.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(4); //changes the players location based on which is the closest
				Museum.setCurrentOwner(CurrentPlayer);
			}
			Property Library  = (Property)(Monopoly_Jr.newGame.boardSpace.get(8));
			if(Library.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(5);
				Library.setCurrentOwner(CurrentPlayer);
			}
			Property Park_Place = (Property)(Monopoly_Jr.newGame.boardSpace.get(22));
			if(Park_Place.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(19);
				Park_Place.setCurrentOwner(CurrentPlayer);
			}
			Property Broadwalk = (Property)(Monopoly_Jr.newGame.boardSpace.get(23));
			if(Broadwalk.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(20);
				Broadwalk.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(4);
				Player Owner = Museum.getOwner();
				if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 2);
				}
				
			}	
	
		}
			
	 if(currentposition == 9) {
			Property Park_Place = (Property)(Monopoly_Jr.newGame.boardSpace.get(22));
			if(Park_Place.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(13); //changes the players location based on which is the closest
				Park_Place.setCurrentOwner(CurrentPlayer);
			}
			Property Broadwalk  = (Property)(Monopoly_Jr.newGame.boardSpace.get(23));
			if(Broadwalk.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(5);
				Broadwalk.setCurrentOwner(CurrentPlayer);
			}
			Property Museum = (Property)(Monopoly_Jr.newGame.boardSpace.get(7));
			if(Museum.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(19);
				Museum.setCurrentOwner(CurrentPlayer);
			}
			Property Library = (Property)(Monopoly_Jr.newGame.boardSpace.get(8));
			if(Library.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(20);
				Library.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(13);
				Player Owner = Park_Place.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 5);
				}
			}	
		}
	 if (currentposition == 15) {
			Property Park_Place = (Property)(Monopoly_Jr.newGame.boardSpace.get(22));
			if(Park_Place.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(7); //changes the players location based on which is the closest
				Park_Place.setCurrentOwner(CurrentPlayer);
			}
			Property Broadwalk  = (Property)(Monopoly_Jr.newGame.boardSpace.get(23));
			if(Broadwalk.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(8);
				Broadwalk.setCurrentOwner(CurrentPlayer);
			}
			Property Museum = (Property)(Monopoly_Jr.newGame.boardSpace.get(7));
			if(Museum.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(16);
				Museum.setCurrentOwner(CurrentPlayer);
			}
			Property Library = (Property)(Monopoly_Jr.newGame.boardSpace.get(8));
			if(Library.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(17);
				Library.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(7);
				Player Owner = Park_Place.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 5);
				}
			}	
		}
	if(currentposition == 21) {
		Property Park_Place = (Property)(Monopoly_Jr.newGame.boardSpace.get(22));
		if(Park_Place.getOwnership()) {
			CurrentPlayer.changeCurrentPosition(1); //changes the players location based on which is the closest
			Park_Place.setCurrentOwner(CurrentPlayer);
		}
		Property Broadwalk  = (Property)(Monopoly_Jr.newGame.boardSpace.get(23));
		if(Broadwalk.getOwnership()) {
			CurrentPlayer.changeCurrentPosition(2);
			Broadwalk.setCurrentOwner(CurrentPlayer);
		}
		Property Museum = (Property)(Monopoly_Jr.newGame.boardSpace.get(7));
		if(Museum.getOwnership()) {
			CurrentPlayer.changeCurrentPosition(10);
			Museum.setCurrentOwner(CurrentPlayer);
		}
		Property Library = (Property)(Monopoly_Jr.newGame.boardSpace.get(8));
		if(Library.getOwnership()) {
			CurrentPlayer.changeCurrentPosition(11);
			Library.setCurrentOwner(CurrentPlayer);
		}
		else {
			CurrentPlayer.changeCurrentPosition(1);
			Player Owner = Park_Place.getOwner();
			if (Owner!=null) {
			CurrentPlayer.transferMoney(CurrentPlayer, Owner, 5);
			}
		}	
		}
	break;
		case 7: System.out.println("Advance to a red space. If one is unowned, get it for FREE! If none is unowned,"
				+ " advance to the closest red space and PAY rent to the owner");
		if(currentposition ==3) {//checks to see which chance place the player is on to know where to send a player 
			Property VideoGame_Arcade = (Property)(Monopoly_Jr.newGame.boardSpace.get(13));
			if(VideoGame_Arcade.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(10);
				VideoGame_Arcade.setCurrentOwner(CurrentPlayer);
			}
			Property Movie_Theatre = (Property)(Monopoly_Jr.newGame.boardSpace.get(14));
			if(Movie_Theatre.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(11);
			}
			else {
				CurrentPlayer.changeCurrentPosition(10);
				Player Owner = VideoGame_Arcade.getOwner();
				if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
				
			}
		}
		    if(currentposition == 9) {
			Property VideoGame_Arcade = (Property)(Monopoly_Jr.newGame.boardSpace.get(13));
			if(VideoGame_Arcade.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(4);
				VideoGame_Arcade.setCurrentOwner(CurrentPlayer);
			}
			Property Movie_Theatre = (Property)(Monopoly_Jr.newGame.boardSpace.get(14));
			if(Movie_Theatre.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(5);
			}
			else {
				CurrentPlayer.changeCurrentPosition(4);
				Player Owner = VideoGame_Arcade.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
			}
		}
		    if (currentposition == 15) {
			Property VideoGame_Arcade = (Property)(Monopoly_Jr.newGame.boardSpace.get(13));
			if(VideoGame_Arcade.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(22);
				VideoGame_Arcade.setCurrentOwner(CurrentPlayer);
			}
			Property Movie_Theatre = (Property)(Monopoly_Jr.newGame.boardSpace.get(14));
			if(Movie_Theatre.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(23);
			}
			else {
				CurrentPlayer.changeCurrentPosition(22);
				Player Owner = VideoGame_Arcade.getOwner();
				if (Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
			}
		}
		    if(currentposition == 21) {
		    	
				Property VideoGame_Arcade = (Property)(Monopoly_Jr.newGame.boardSpace.get(13));
				if(VideoGame_Arcade.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(16);
					VideoGame_Arcade.setCurrentOwner(CurrentPlayer);
				}
				Property Movie_Theatre = (Property)(Monopoly_Jr.newGame.boardSpace.get(14));
				if(Movie_Theatre.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(17);
				}
				else {
					CurrentPlayer.changeCurrentPosition(4);
					Player Owner = VideoGame_Arcade.getOwner();
					if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
					}
				}
			}
		    break;
		case 8: System.out.println("Advance to a light blue space. If one is unowned, get it for FREE! If none is unowned,"
				+ " advance to the closest light blue space and PAY rent to the owner.");
		if(currentposition ==3) {
			Property Candy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(4));
			if(Candy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(1); //changes the players location based on which is the closest
				Candy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property IceCream_Parlor  = (Property)(Monopoly_Jr.newGame.boardSpace.get(5));
			if(IceCream_Parlor.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(2);
				IceCream_Parlor.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(1);
				Player Owner = Candy_Store.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 2);
				}
			}
		}
	    if(currentposition == 9) {
			Property Candy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(4));
			if(Candy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(19);
				Candy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property IceCream_Parlor  = (Property)(Monopoly_Jr.newGame.boardSpace.get(5));
			if(IceCream_Parlor.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(20);
				IceCream_Parlor.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(19);
				Player Owner = Candy_Store.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner,  Candy_Store.getCost());
				}
			}
		}
	    if (currentposition == 15) {
			Property Candy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(4));
			if(Candy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(13); //changes the players location based on which is the closest
				Candy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property IceCream_Parlor  = (Property)(Monopoly_Jr.newGame.boardSpace.get(5));
			if(IceCream_Parlor.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(14);
				IceCream_Parlor.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(13);
				Player Owner = Candy_Store.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 2);
				}
			}
		}
	    if(currentposition == 21) {
			Property Candy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(4));
			if(Candy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(7); //changes the players location based on which is the closest
				Candy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property IceCream_Parlor  = (Property)(Monopoly_Jr.newGame.boardSpace.get(5));
			if(IceCream_Parlor.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(8);
				IceCream_Parlor.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(7);
				Player Owner = Candy_Store.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 2);
				}
			}
		}
	    break;
		case 9: System.out.println("Advance to an orange space. If one is unowned, get it for FREE! If none is unowned,"
				+ " advance to the closest orange space and PAY rent to the owner.");
		if(currentposition ==3) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(7); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
			Property Swimming_Pool  = (Property)(Monopoly_Jr.newGame.boardSpace.get(11));
			if(Swimming_Pool.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(8);
				Swimming_Pool.setCurrentOwner(CurrentPlayer);
			}
			else {
					CurrentPlayer.changeCurrentPosition(7);
					Player Owner = Skate_Park.getOwner();
					if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
					}
				}
			}
		else if(currentposition == 9) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(1); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
			Property Swimming_Pool  = (Property)(Monopoly_Jr.newGame.boardSpace.get(11));
			if(Swimming_Pool.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(2);
				Swimming_Pool.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(1);
				Player Owner = Skate_Park.getOwner();
				if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				}
			}
		}
		else if (currentposition == 15) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(19); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
			Property Swimming_Pool  = (Property)(Monopoly_Jr.newGame.boardSpace.get(11));
			if(Swimming_Pool.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(20);
				Swimming_Pool.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(19);
				  Player Owner = Skate_Park.getOwner();
				  if (Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
				  }
			}
		}
		 if(currentposition == 21) {
			 Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
				if(Skate_Park.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(13); //changes the players location based on which is the closest
					Skate_Park.setCurrentOwner(CurrentPlayer);
				}
				Property Swimming_Pool  = (Property)(Monopoly_Jr.newGame.boardSpace.get(11));
				if(Swimming_Pool.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(14);
					Swimming_Pool.setCurrentOwner(CurrentPlayer);
				}
				else {
					CurrentPlayer.changeCurrentPosition(13);
					  Player Owner = Skate_Park.getOwner();
					  if(Owner!=null) {
						CurrentPlayer.transferMoney(CurrentPlayer, Owner, Skate_Park.getCost());
					  }
				}		
		}
		 break;
		case 10: System.out.println("Advance to a brown or yellow. If one is unowned, get it for FREE! If none is unowned,"
				+ " advance to the closest brown or yellow or blue space and PAY rent to the owner.");
		if(currentposition ==3) {
			Property Toy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(16));
			if(Toy_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(13); //changes the players location based on which is the closest
				Toy_Store.setCurrentOwner(CurrentPlayer);
			}
			Property Pet_Store  = (Property)(Monopoly_Jr.newGame.boardSpace.get(17));
			if(Pet_Store.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(14);
				Pet_Store.setCurrentOwner(CurrentPlayer);
			}
			Property Burger_Joint = (Property)(Monopoly_Jr.newGame.boardSpace.get(1));
			if(Burger_Joint.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(22);
				Burger_Joint.setCurrentOwner(CurrentPlayer);
			}
			Property Pizza_House = (Property)(Monopoly_Jr.newGame.boardSpace.get(2));
			if(Pizza_House.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(23);
				Pizza_House.setCurrentOwner(CurrentPlayer);
			}
			else {
				CurrentPlayer.changeCurrentPosition(13);
				
			    Player Owner = Toy_Store.getOwner();
			    if(Owner!=null) {
				CurrentPlayer.transferMoney(CurrentPlayer, Owner, Toy_Store.getCost());
			    }
			}
			
		}
		   if(currentposition == 9) {
				Property Toy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(16));
				if(Toy_Store.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(7); //changes the players location based on which is the closest
					Toy_Store.setCurrentOwner(CurrentPlayer);
				}
				Property Pet_Store  = (Property)(Monopoly_Jr.newGame.boardSpace.get(17));
				if(Pet_Store.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(8);
					Pet_Store.setCurrentOwner(CurrentPlayer);
				}
				Property Burger_Joint = (Property)(Monopoly_Jr.newGame.boardSpace.get(1));
				if(Burger_Joint.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(16);
					Burger_Joint.setCurrentOwner(CurrentPlayer);
				}
				Property Pizza_House = (Property)(Monopoly_Jr.newGame.boardSpace.get(2));
				if(Pizza_House.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(17);
					Pizza_House.setCurrentOwner(CurrentPlayer);
				}
				else {
					CurrentPlayer.changeCurrentPosition(7);
					Player Owner = Toy_Store.getOwner();
					if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, Toy_Store.getCost());
					}
				}
		   }	
		   if (currentposition == 15) {
				Property Toy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(16));
				if(Toy_Store.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(1); //changes the players location based on which is the closest
					Toy_Store.setCurrentOwner(CurrentPlayer);
				}
				Property Pet_Store  = (Property)(Monopoly_Jr.newGame.boardSpace.get(17));
				if(Pet_Store.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(2);
					Pet_Store.setCurrentOwner(CurrentPlayer);
				}
				Property Burger_Joint = (Property)(Monopoly_Jr.newGame.boardSpace.get(1));
				if(Burger_Joint.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(10);
					Burger_Joint.setCurrentOwner(CurrentPlayer);
				}
				Property Pizza_House = (Property)(Monopoly_Jr.newGame.boardSpace.get(2));
				if(Pizza_House.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(11);
					Pizza_House.setCurrentOwner(CurrentPlayer);
				}
				else {
					CurrentPlayer.changeCurrentPosition(1);
					Player Owner = Toy_Store.getOwner();
					Toy_Store.getCost();
					if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, Toy_Store.getCost());
					}
				}
				
		}
		   if(currentposition == 21) {
				Property Burger_Joint = (Property)(Monopoly_Jr.newGame.boardSpace.get(1));
				if(Burger_Joint.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(4);
					Burger_Joint.setCurrentOwner(CurrentPlayer);
				}
				Property Pizza_House = (Property)(Monopoly_Jr.newGame.boardSpace.get(2));
				if(Pizza_House.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(5);
					Pizza_House.setCurrentOwner(CurrentPlayer);
				}
				Property Toy_Store = (Property)(Monopoly_Jr.newGame.boardSpace.get(16));
				if(Toy_Store.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(19); //changes the players location based on which is the closest
					Toy_Store.setCurrentOwner(CurrentPlayer);
				}
				Property Pet_Store  = (Property)(Monopoly_Jr.newGame.boardSpace.get(17));
				if(Pet_Store.getOwnership()) {
					CurrentPlayer.changeCurrentPosition(20);
					Pet_Store.setCurrentOwner(CurrentPlayer);
				}
				else {
					CurrentPlayer.changeCurrentPosition(4);
					Player Owner = Burger_Joint.getOwner();
					if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 1);
					}
				}
		}
		break;
		case 11: System.out.println("It’s your birthday! Collect $2 from the Bank. Happy Birthday!");
		CurrentPlayer.addCash(2);
		break;
		case 12: System.out.println("Advance to Boardwalk.");
		if(currentposition ==3) {
		CurrentPlayer.changeCurrentPosition(20);
		}
		else if(currentposition == 9) {
			CurrentPlayer.changeCurrentPosition(14);
		}
		else if (currentposition == 15) {
			CurrentPlayer.changeCurrentPosition(8);
		}
		else {
			CurrentPlayer.changeCurrentPosition(2);	
		}
		break;
		case 13: System.out.println("Move forward 1 space or take another Chance card. Would you like to draw a second chance card");
		if ((kb.next()).equalsIgnoreCase("Y")){
			this.onLanding(CurrentPlayer, fourPlayers); // if the player hits yes another card is shuffled
		    
		}
		else 
			CurrentPlayer.changeCurrentPosition(1); // if the player hits no they are moved forward one space.
		
		
		break;
		case 14: System.out.println("Advance to the Skate Park. If no one owns it, get it for FREE! Otherwise, PAY rent to the owner.");
		if(currentposition == 3) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(7); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
					else {
						CurrentPlayer.changeCurrentPosition(7);
						Player Owner = Skate_Park.getOwner();
						if(Owner!=null) {
						CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
						}
					}	
		}
		if(currentposition == 9) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(1); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
				else {
					CurrentPlayer.changeCurrentPosition(1);
					Player Owner = Skate_Park.getOwner();
					if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
					}
				}	
		}
		if(currentposition == 15) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(19); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
				else {
					CurrentPlayer.changeCurrentPosition(19);
					Player Owner = Skate_Park.getOwner();
					if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
					}
				}		
		}
		if(currentposition == 21) {
			Property Skate_Park = (Property)(Monopoly_Jr.newGame.boardSpace.get(10));
			if(Skate_Park.getOwnership()) {
				CurrentPlayer.changeCurrentPosition(13); //changes the players location based on which is the closest
				Skate_Park.setCurrentOwner(CurrentPlayer);
			}
				else {
					CurrentPlayer.changeCurrentPosition(13);
					Player Owner = Skate_Park.getOwner();
					if(Owner!=null) {
					CurrentPlayer.transferMoney(CurrentPlayer, Owner, 3);
					}
				}	
		}
		break;
		case 15: System.out.println("Give this card to the Toy Boat, and take another Chance Card. \r\n"
				+ "Toy Boat: on your next turn, sail forward to any unowned property, and buy it. If all are owned,"
				+ " buy the closest property not owned by Toy Boat from the owner! Owner MUST sell.");
			int i = currentposition+1;
			int start = currentposition;
			boolean found = false;
			boolean closestproperty = false;
			Player toy_boat = 	fourPlayers.get(0);
			Player owner = toy_boat;
			Property owned = null;
			do {
				BoardSpace space = Monopoly_Jr.newGame.boardSpace.get(i);
						if (space instanceof Property) {
							Property newspace = (Property) space;
							if(!newspace.getOwnership()) {
								if (toy_boat.getCurrentCash() < newspace.getCost()) {
								// Put game over scenario for toy boat here
									System.out.println("Toy boat does not have enough money");
									toy_boat.subtractCash(owned.getCost());
								}
								else {// toyboat has money
									//subtract cost from toyboats balance
									//change ownership of property to toyboat
									found = true;
								}
							}
							else { // property is owned
							i++; //checks next property
							Player temp = newspace.getOwner();
							if(!temp.getPlayerName().equals(toy_boat.getPlayerName())) {
								closestproperty=true;
								owner = temp;
								owned = newspace;
							}
							}
						
						}
						else 
							i++;
						// checks next space
							
						
			
			}while(i != start && !found); // one hasn't been found or gotten all the way around
			if (!found) {
				
				toy_boat.transferMoney(toy_boat, owner, owned.getCost());//this is where property that is closest is bought by toyboat
				//subtract cost from toyboats balance
				//pay owner
				//change ownership of property to toyboat
				toy_boat.setCurrentOwner(toy_boat);
				//pay owner
				}
			
			
		break;
		case 16: System.out.println("Give this card to the Toy Car, and take another Chance Card. \r\n"
				+ "Toy Car: on your next turn, sail forward to any unowned property, and buy it. If all are owned,"
				+ " buy the closest property not owned by Toy Car from the owner! Owner MUST sell.");
		int i2 = currentposition+1;
		int start2 = currentposition;
		boolean found2 = false;
		boolean closestproperty2 = false;
		Player toy_car = 	fourPlayers.get(1);
		Player owner2 = toy_car;
		Property owned2 = null;
		do {
			BoardSpace space = Monopoly_Jr.newGame.boardSpace.get(i2);
					if (space instanceof Property) {
						Property newspace = (Property) space;
						if(!newspace.getOwnership()) {
							if (toy_car.getCurrentCash() < newspace.getCost()) {
							// Put game over scenario for toy boat here
								System.out.println("Toy car does not have enough money");
								toy_car.subtractCash(owned2.getCost());
							}
							else {// toyboat has money
								//subtract cost from toyboats balance
								//change ownership of property to toyboat
								found = true;
							}
						}
						else { // property is owned
						i2++; //checks next property
						Player temp = newspace.getOwner();
						if(!temp.getPlayerName().equals(toy_car.getPlayerName())) {
							closestproperty=true;
							owner2 = temp;
							owned2 = newspace;
							
						}
						}
					
					}
					else 
						i2++;
					// checks next space
						
					
		}
		while(i2 != start2 && !found2); // one hasn't been found or gotten all the way around
		if (!found2) {
			
			toy_car.transferMoney(toy_car, owner2, owned2.getCost());//this is where property that is closest is bought by toyboat
			//subtract cost from toyboats balance
			//pay owner
			//change ownership of property to toyboat
			toy_car.setCurrentOwner(toy_car);
			//pay owner
		}
		break;
		case 17: System.out.println("Give this card to the Little Scottie, and take another Chance Card. \r\n"
				+ "Little Scottie: on your next turn, sail forward to any unowned property, and buy it. If all are owned,"
				+ " buy the closest property not owned by Little Scottie from the owner! Owner MUST sell.");
		int i3 = currentposition+1;
		int start3 = currentposition;
		boolean found3 = false;
		boolean closestproperty3 = false;
		Player little_scottie = 	fourPlayers.get(2);
		Player owner3 = little_scottie;
		Property owned3=null;
		do {
			BoardSpace space = Monopoly_Jr.newGame.boardSpace.get(i3);
					if (space instanceof Property) {
						Property newspace = (Property) space;
						if(!newspace.getOwnership()) {
							if (little_scottie.getCurrentCash() < newspace.getCost()) {
							// Put game over scenario for toy boat here
								System.out.println("Little Scootie does not have enough money");
								little_scottie.subtractCash(owned3.getCost());
							}
							else {// toyboat has money
								//subtract cost from toyboats balance
								//change ownership of property to toyboat
								found = true;
							}
						}
						else { // property is owned
						i3++; //checks next property
						Player temp = newspace.getOwner();
						if(!temp.getPlayerName().equals(little_scottie.getPlayerName())) {
							closestproperty=true;
							owner3 = temp;
							owned3 = newspace;
						}
						}
					
					}
					else 
						i3++;
		}
		
					// checks next space
		while(i3 != start3 && !found3); // one hasn't been found or gotten all the way around
		if (!found3) {
			
			little_scottie.transferMoney(little_scottie, owner3, owned3.getCost());//this is where property that is closest is bought by toyboat
			//subtract cost from toyboats balance
			//pay owner
			//change ownership of property to toyboat
			little_scottie.setCurrentOwner(little_scottie);
			//pay owner
		}
		break;
		case 18: System.out.println("Give this card to the Little Hazel, and take another Chance Card. \r\n"
				+ "Little Hazel: on your next turn, sail forward to any unowned property, and buy it. If all are owned,"
				+ " buy the closest property not owned by Little Hazel from the owner! Owner MUST sell");
		int i4 = currentposition+1;
		int start4 = currentposition;
		boolean found4 = false;
		boolean closestproperty4 = false;
		Player little_hazel = 	fourPlayers.get(2);
		Player owner4 = little_hazel;
		Property owned4=null;
		do {
			BoardSpace space = Monopoly_Jr.newGame.boardSpace.get(i4);
					if (space instanceof Property) {
						Property newspace = (Property) space;
						if(!newspace.getOwnership()) {
							if (little_hazel.getCurrentCash() < newspace.getCost()) {
							// Put game over scenario for toy boat here
								System.out.println("Little Hazel does not have enough money");
								little_hazel.subtractCash(owned4.getCost());
							}
							else {// toyboat has money
								//subtract cost from toyboats balance
								//change ownership of property to toyboat
								found = true;
							}
						}
						else { // property is owned
						i4++; //checks next property
						Player temp = newspace.getOwner();
						if(!temp.getPlayerName().equals(little_hazel.getPlayerName())) {
							closestproperty4=true;
							owner4 = temp;
							owned4 = newspace;
						}
						}
					
					}
					else 
						i4++;
		}
		
					// checks next space
		while(i4 != start4 && !found4); // one hasn't been found or gotten all the way around
		if (!found4) {
			
			little_hazel.transferMoney(little_hazel, owner4, owned4.getCost());//this is where property that is closest is bought by toyboat
			//subtract cost from toyboats balance
			//pay owner
			//change ownership of property to toyboat
			little_hazel.setCurrentOwner(little_hazel);
			//pay owner
		}
		break;
		case 19: System.out.println("Advance to GO. Collect $2");
		if(currentposition ==3) {
		CurrentPlayer.changeCurrentPosition(21);
		CurrentPlayer.addCash(2);
		}
		else if (currentposition == 9) {
			CurrentPlayer.changeCurrentPosition(15);
			CurrentPlayer.addCash(2);
		}
		else if(currentposition == 15) {
		CurrentPlayer.changeCurrentPosition(9);
		CurrentPlayer.addCash(2);
		}
		else {
			CurrentPlayer.changeCurrentPosition(3);
			CurrentPlayer.addCash(2);
		}
		break;
			
		}
		
		}
}
		
