package game;

import java.util.Scanner;

import map.Map;

public class GameMaster {
	
	public final String NORTH = "North";
	public final String SOUTH = "South";
	public final String EAST = "East";
	public final String WEST = "West";
	public final String INVENTORY = "Inventory";

	public static void main(String[] args) {

		Map gameMap = new Map("res/maps/testmap.txt");
		
		Character character = new Character();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("What is your name?:");
		character.setName(scanner.next());
	
		
		System.out.println("Welcome to Arcadian Dungeon Adventure, " + character.getName() + "!");
		System.out.println("Can you make it out alive?");
		
		do{
			//gameMap.getTile(character.getLocationX(),character.getLocationY()).writeDescription();
			boolean validMove = false;
				
			do{
				
			}while(validMove == false)
			
			
		}while(gameMap.getType(character.getLocationX(), character.getLocationY())!='X');
		
		
	}

}
