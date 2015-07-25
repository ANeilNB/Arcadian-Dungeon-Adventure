package game;

import java.util.Scanner;

import map.Map;

public class GameMaster {
	
	public final String NORTH = "North";
	public final String SOUTH = "South";
	public final String EAST = "East";
	public final String WEST = "West";
	public final String INVENTORY = "Inventory";

	static Character character;
	
	public static void main(String[] args) {

		Map gameMap = new Map("res/maps/testmap.txt");
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("What is your name?: ");
		character = new Character(scanner.next());
		
		System.out.println("Welcome to Arcadian Dungeon Adventure, " + character.getName() + "!");
		
		//character.getInventory().printItems();
		
		int startingStats = 30;
		do{
			System.out.println("You have " + startingStats + " stat points remaining");
			boolean statAdded = false;
			do{
				System.out.println("Which stat do you want to increase? (str, dex, int, luck)");
				String attribute = scanner.next();
				attribute.toLowerCase();
				if(attribute.equals("str")||attribute.equals("dex")||attribute.equals("int")||attribute.equals("luck")){
					boolean correctIncrease = false;
					do{
						System.out.println("Increase by how much?");
						String value = scanner.next();
						int stat = Integer.parseInt(value);
						if(stat <= startingStats){
							switch(attribute){
							case "str":
								character.setStrength(character.getStrength()+stat);
								System.out.println("Strength incrased to " + character.getStrength() + "!");
								correctIncrease=true;
								break;
							case "dex":
								character.setDexterity(character.getDexterity()+stat);
								System.out.println("Dexterity incrased to " + character.getDexterity() + "!");
								correctIncrease=true;
								break;
							case "int":
								character.setIntelligence(character.getIntelligence()+stat);
								System.out.println("Intelligence incrased to " + character.getIntelligence() + "!");
								correctIncrease=true;
								break;
							case "luck":
								character.setLuck(character.getLuck()+stat);
								System.out.println("Luck incrased to " + character.getLuck() + "!");
								correctIncrease=true;
								break;
							default:
								break;
							}
							statAdded = true;
							startingStats = startingStats - stat;
						}
					}while(correctIncrease == false);
				}
				
			}while(statAdded == false);
			
		}while (startingStats > 0);
		
		System.out.print("Your starting stats are:\nStrength:\t" + character.getStrength() + "\nDexterity:\t" + character.getDexterity() + "\nIntelligence:\t" + character.getIntelligence() +
								"\nLuck:\t\t" + character.getLuck() + "\n");
		
		int[] start = gameMap.getStart();
		
		character.setLocationX(start[0]);
		character.setLocationY(start[1]);
		
		System.out.println("Starting Location: X: " + character.getLocationX() + " Y: " + character.getLocationY());
		
		System.out.println("Can you make it out alive?");
		
		do{
			//
			//gameMap.getTile(character.getLocationX(),character.getLocationY()).writeDescription();
			boolean validMove = false;
			do{
				System.out.println("What do you want to do?");
				String action = scanner.next();
				action.toLowerCase();
				switch(action){
				case "help":
					System.out.println("Commands are north, south, east, west and inventory");
					break;
				case "inventory":
					character.getInventory().printItems();
					break;
				case "north":
					int x = character.getLocationX();
					int y = character.getLocationY();
					if(gameMap.isInteractable(x, y-1)){
						character.setLocationY(y-1);
						System.out.println("You are trying to move to X: " + character.getLocationX() + " Y: " + character.getLocationY());
						gameMap.enterTile(character.getLocationX(),character.getLocationY());
						validMove = true;
					}
					else{
						System.out.println("A wall blocks your path north!");
					}
					break;
				case "south":
					if(gameMap.isInteractable(character.getLocationX(), character.getLocationY()+1)){
						character.setLocationY(character.getLocationY()+1);
						gameMap.enterTile(character.getLocationX(),character.getLocationY());
						validMove = true;
					}
					else{
						System.out.println("A wall blocks your path south!");
					}
					break;
				case "east":
					if(gameMap.isInteractable(character.getLocationX()+1, character.getLocationY())){
						character.setLocationX(character.getLocationX()+1);
						gameMap.enterTile(character.getLocationX(),character.getLocationY());
						validMove = true;
					}
					else{
						System.out.println("A wall blocks your path east!");
					}
					break;
				case "west":
					if(gameMap.isInteractable(character.getLocationX()-1, character.getLocationY())){
						character.setLocationX(character.getLocationX()-1);
						gameMap.enterTile(character.getLocationX(),character.getLocationY());
						validMove = true;
					}
					else{
						System.out.println("A wall blocks your path west!");
					}
					break;
				default:
					System.out.println("You can't do this!");
					break;
			}
				
			}while(validMove == false);
			
			
		}while(gameMap.getType(character.getLocationX(), character.getLocationY())!='X');
		
		System.out.println("YOU ARE WINNER");
		
		scanner.close();
	}

}
