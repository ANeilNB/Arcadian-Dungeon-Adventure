package map;

import game.GameCharacter;
import game.MapGenerator;

public class Map {

	
	private char[][] map;
	private Tile[][] tiles;
	
	public Map(String filepath){
		map = MapGenerator.createMap(filepath);
		
		tiles=new Tile[map.length][map[0].length];
		
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				tiles[i][j] = null;
				System.out.print(map[i][j]);
			}
			System.out.print("\n");
		}
		
	}
	
	public Tile getTile(int xVal, int yVal){
		
		if(xVal <= map.length && yVal < map[xVal].length) return tiles[yVal][xVal];
		else{
			System.err.println("Map Error");
			return null;
		}
	}
	
	public char getType(int xVal, int yVal){
		System.out.println("x = " + xVal + ", y = " + yVal );
		System.out.println("x = " + map[yVal].length + ", y = " + map.length);

		boolean x = false;
		boolean y = false;
		if(xVal < map[yVal].length){
			System.out.println("X!");
			x = true;
			System.out.println(x);
		}
		if(yVal < map.length){
			System.out.println("Y!");
			y = true;
			System.out.println(y);
		}
		
		System.out.println(xVal + " " + yVal);
		if(x){
			if(y) {
				System.out.println("Passed!");
				System.out.println("Char= " + map[yVal][xVal]);
				return map[yVal][xVal];
			}
		}
		
			return '0';
		
	}
	
	public void enterTile(int xVal, int yVal, GameCharacter character){
		if(getTile(xVal, yVal) == null){
			char type = getType(xVal, yVal);
			switch(type){
			case 'b':
				tiles[yVal][xVal] = new Trap('b');
				break;
			case 's':
				tiles[yVal][xVal] = new Trap('s');
				break;
			case 'p':
				tiles[yVal][xVal] = new Trap('p');
				break;
			case 't':
				tiles[yVal][xVal] = new Trap('t');
				break;
			case 'c':
				tiles[yVal][xVal] = new Trap('c');
				break;
			case 'd':
				tiles[yVal][xVal] = new Door();
				break;
			case 'h':
				tiles[yVal][xVal] = new SecretPassage('h');
				break;
			case 'w':
				tiles[yVal][xVal] = new SecretPassage('w');
				break;
			case 'a':
				tiles[yVal][xVal] = new Corridor();
				break;
			case 'r':
				tiles[yVal][xVal] = new Chest('r');
				break;
			case 'g':
				tiles[yVal][xVal] = new Chest('g');
				break;
			case 'i':
				tiles[yVal][xVal] = new Chest('i');
				break;
			case 'y':
				tiles[yVal][xVal] = new Chest('y');
				break;
			case 'l':
				tiles[yVal][xVal] = new Chest('l');
				break;
			default:
					break;
			}
		}
		getTile(xVal,yVal).writeDescription(character);
	}
	
	public boolean isInteractable(int xVal, int yVal){
		try{
			char tile = getType(xVal,yVal);
			
			switch(tile){
			case 'e':
				return false;	
			case 'o':
				return false;
			case '0':
				return false;
			default:
				return true;
			}
		}
		catch(ArrayIndexOutOfBoundsException aobe){
			return false;
		}
	}
	
	public int[] getStart(){
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				//System.out.print(map[i][j]);
				if(map[i][j]=='s'){
					tiles[i][j] = new Corridor();
					int[] start = {j,i};
					return start;
				}
			}
			//System.out.print("\n");
		}
		return new int[0];
	}
}
