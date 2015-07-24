package map;

public class Map {

	
	private char[][] map;
	private Tile[][] tiles;
	
	public Tile getTile(int xVal, int yVal){
		
		if(xVal < map.length && yVal < map[xVal].length) return tiles[xVal][yVal];
		else{
			System.err.println("Map Error");
			return null;
		}
	}
	
	public char getType(int xVal, int yVal){
		if(xVal < map.length && yVal < map[xVal].length) return map[xVal][yVal];
		else return '0';
	}
	
	public void enterTile(int xVal, int yVal){
		if(getTile(xVal, yVal) == null){
			char type = getType(xVal, yVal);
			switch(type){
				//cases for each character making relevant class
			}
		}
	}
}
