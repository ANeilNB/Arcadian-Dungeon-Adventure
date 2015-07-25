package game;

import java.util.ArrayList;

public class Inventory {

	private final int gloveAtt = 30;
	private final int crownAtt = 30;
	private final int bootsAtt = 30;
	private final int ringAtt = 30;
	private Boolean gloveTaken;
	private Boolean crownTaken;
	private Boolean bootTaken;
	private Boolean ringTaken;
	
	private ArrayList<Item> items;

	public void printItems() { 
		for(Item i : items ) { 
			System.out.println(i);
		}
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
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
	
	public int bootTaken(int dexterity) {
		if(bootTaken == false) {
			int addedDexterity = bootsAtt + dexterity;
			return addedDexterity;
		}else { 
			System.out.println("Boot has already been taken");
		}
		return dexterity;
	}
	
	public int ringTaken(int luck) {
		if(ringTaken == false) {
			int addedLuck = ringAtt + luck;
			return addedLuck;
		}else {
			System.out.println("Ring has already been taken");
		}
		return luck;
		
	}

}
