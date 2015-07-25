package map;

import game.MapGenerator;

public class Map {

	
	private char[][] map;
	private Tile[][] tiles;
	
	public Map(String filepath){
		map = MapGenerator.createMap(filepath);
		
		/*
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]);
			}
			System.out.print("\n");
		}
		*/
	}
	
	public Tile getTile(int xVal, int yVal){
		
		if(xVal < map.length && yVal < map[xVal].length) return tiles[yVal][xVal];
		else{
			System.err.println("Map Error");
			return null;
		}
	}
	
	public char getType(int xVal, int yVal){
		if(xVal < map.length && yVal < map[xVal].length) return map[yVal][xVal];
		else return '0';
	}
	
	public void enterTile(int xVal, int yVal){
		if(getTile(xVal, yVal) == null){
			char type = getType(yVal, xVal);
			switch(type){
			case 'b':
				break;
			}
		}
	}
	
	public boolean isInteractable(int xVal, int yVal){
		try{
			char tile = getType(xVal,yVal);
			
			switch(tile){
			case 'e':
				return false;	
			case 'o':
				return false;
			default:
				return true;
			}
		}
		catch(ArrayIndexOutOfBoundsException aobe){
			return false;
		}
	}
}
