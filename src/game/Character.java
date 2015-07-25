package game;


public class Character {
	
	private String name;
	private int strength;
	private int dexterity;
	private int intelligence;
	private int luck;
	private int maxHitPoints;
	private int currentHitPoints;
	
	private int locationX;
	private int locationY;
	
	private Inventory inventory;
	
	public Character(String name){
		this.name = name;
		this.strength = 20;
		this.dexterity = 20;
		this.intelligence = 20;
		this.luck = 20;
		this.maxHitPoints = 20;
		this.currentHitPoints = this.maxHitPoints;
		
		inventory = new Inventory();
	}
	
	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getMaxHitPoints() {
		return maxHitPoints;
	}

	public void setMaxHitPoints(int maxHitPoints) {
		this.maxHitPoints = maxHitPoints;
	}

	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void addToInventory(String itemName) {
		Item item = new Item(itemName);
		inventory.getItems().add(item);
	}
	
	
}
