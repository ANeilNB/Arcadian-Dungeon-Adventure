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

	
	
	public Inventory() {
		this.items = new ArrayList<Item>();
		this.gloveTaken = false;
		this.crownTaken = false;
		this.bootTaken = false;
		this.ringTaken = false;
	}

	public void printItems() { 
	
		if(items.isEmpty()) {
			System.out.println("No items in your inventory!");
		}else { 	
			for(Item i : items ) {
				System.out.println(i);			
			}
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
			gloveTaken = true;
			return addedStrength;
		} else {
			System.out.println("Glove has already been taken.");
		}
		return strength;
	}
	
	public int crownTaken(int intelligence) {
		if(crownTaken == false) {
			int addedIntelligence = crownAtt + intelligence;
			crownTaken = true;
			return addedIntelligence;
		} else {
			System.out.println("Crown has already been taken");
		}
		return intelligence;
	}
	
	public int bootTaken(int dexterity) {
		if(bootTaken == false) {
			int addedDexterity = bootsAtt + dexterity;
			bootTaken = true;
			return addedDexterity;
		}else { 
			System.out.println("Boot has already been taken");
		}
		return dexterity;
	}
	
	public int ringTaken(int luck) {
		if(ringTaken == false) {
			int addedLuck = ringAtt + luck;
			ringTaken = true;
			return addedLuck;
		}else {
			System.out.println("Ring has already been taken");
		}
		return luck;
		
	}

}
