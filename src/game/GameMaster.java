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
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("What is your name?: ");
		Character character = new Character(scanner.next());
	
		
		System.out.println("Welcome to Arcadian Dungeon Adventure, " + character.getName() + "!");
		
		character.getInventory().printItems();
		
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
						if(stat < startingStats){
							switch(attribute){
							case "str":
								character.setStrength(character.getStrength()+stat);
								correctIncrease=true;
								break;
							case "dex":
								character.setDexterity(character.getDexterity()+stat);
								correctIncrease=true;
								break;
							case "int":
								character.setIntelligence(character.getIntelligence()+stat);
								correctIncrease=true;
								break;
							case "luck":
								character.setLuck(character.getLuck()+stat);
								correctIncrease=true;
								break;
							}
						}
					}while(correctIncrease == false);
				}
				
			}while(statAdded == false);
			
		}while (startingStats > 0);
		
		System.out.println("Can you make it out alive?");
		
		do{
			//gameMap.getTile(character.getLocationX(),character.getLocationY()).writeDescription();
			boolean validMove = false;
				
			do{
				
			}while(validMove == false);
			
			
		}while(gameMap.getType(character.getLocationX(), character.getLocationY())!='X');
		
		scanner.close();
	}

}
