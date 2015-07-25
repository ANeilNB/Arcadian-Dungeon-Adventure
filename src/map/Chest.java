package map;

import java.util.ArrayList;

import game.GameCharacter;
import game.Item;

public class Chest extends Tile {
	private Boolean isUnlocked;
	private Boolean isTrap;
	
	private Item item;
	
	public Chest(char chestChar) {
		this.isUnlocked = false;
		this.isTrap = false;
		
		switch(chestChar) {
			case 'r' : item = new Item("rope");
						break;
			case 'g' : item = new Item("glovesOfStr");
						break;
			case 'i' : item = new Item("crownOfInt");
						break;
			case 'y' : item = new Item("bootsOfDex");
						break;
			case 'l' : item = new Item("ringOfLuck");
						break;
		}
	}

	public Boolean getIsUnlocked() {
		return isUnlocked;
	}

	public void setIsUnlocked(Boolean isUnlocked) {
		this.isUnlocked = isUnlocked;
	}

	public Boolean getIsTrap() {
		return isTrap;
	}

	public void setIsTrap(Boolean isTrap) {
		this.isTrap = isTrap;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public void writeDescription(GameCharacter character) {
		
		ArrayList<Item> inventory = character.getInventory().getItems();
		
		
		for(Item i : inventory) {
			if(i.getItemName() == "key") {
				System.out.println("Chest Opened");
				String itemName = item.getItemName();
				character.addToInventory(itemName);
			} 
		}
		
		
	}
	
}
