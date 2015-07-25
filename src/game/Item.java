package game;

public class Item {

	private String itemName;
	private final int gloveAtt = 40;
	private final int crownAtt = 40;
	private final int bootsAtt = 40;
	private final int ringAtt = 40;
	private Boolean gloveTaken;
	private Boolean crownTaken;
	private Boolean bootTaken;
	private Boolean ringTaken;
	
	
	
	
	public Item(String itemName) {
		this.itemName = itemName;
		gloveTaken = false;
		crownTaken = false;
		bootTaken = false;
		ringTaken = false;
		
		
	}

	public int gloveTaken(int strength) {
		if(gloveTaken == false) {
			int addedStrength = gloveAtt + strength; 
			return addedStrength;
		} else {
			System.out.println("Glove has already been taken.");
		}
		return strength;
	}
	
	public int crownTaken(int intelligence) {
		if(crownTaken == false) {
			int addedIntelligence = crownAtt + intelligence;
			return addedIntelligence;
		} else {
			System.out.println("Crown has already been taken");
		}
		return intelligence;
	}
	
	
	
}
