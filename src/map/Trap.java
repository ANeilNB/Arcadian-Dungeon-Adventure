package map;

import java.util.Random;

import game.GameCharacter;

/**
 * @author Administrator
 *
 */
public class Trap extends Tile {
	private String trapType;
	private String threshAttribute;
	private int threshValue;
	private final int MAX_RANDOM = 40;
	private final int MIN_RANDOM = 30;
	private Boolean itemBypass;
	private Boolean isDisarmed;

	public Trap(char trapChar) {
	
		Random random = new Random();
		
		switch(trapChar) { 
			case 'b' : this.trapType = "Boulder";
						this.threshAttribute = "dexterity";
					 break;
			case 's' : this.trapType = "Spikes"; 
						this.threshAttribute = "dexterity";
					 break;
			case 'p' : this.trapType = "Pit";
						this.threshAttribute = "dexterity";
					 break;
			case 't' : this.trapType = "Trapdoor";
						this.threshAttribute = "strength";
					 break;
			case 'c' : this.trapType = "Trapchest";
						this.threshAttribute = "strength";
					 break;
			default :  System.out.println("No Trap");
					break;
		}
		this.threshValue = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM ;
		
		itemBypass = false;
		isDisarmed = false;
	}

	public String getTrapType() {
		return trapType;
	}

	public void setTrapType(String trapType) {
		this.trapType = trapType;
	}

	public String getThreshAttribute() {
		return threshAttribute;
	}

	public void setThreshAttribute(String threshAttribute) {
		this.threshAttribute = threshAttribute;
	}

	public int getThreshValue() {
		return threshValue;
	}

	public void setThreshValue(int threshValue) {
		this.threshValue = threshValue;
	}

	public Boolean getItemBypass() {
		return itemBypass;
	}

	public void setItemBypass(Boolean itemBypass) {
		this.itemBypass = itemBypass;
	}

	public Boolean getIsDisarmed() {
		return isDisarmed;
	}

	public void setIsDisarmed(Boolean isDisarmed) {
		this.isDisarmed = isDisarmed;
	}

	@Override
	public void writeDescription(GameCharacter character) {
		if(threshAttribute.equals("strength")){
			if(character.getStrength() < threshValue){
				character.setCurrentHitPoints(character.getCurrentHitPoints()-5);
				System.out.println("Ow, you take 5 points of damage");
			}
			else{
				System.out.println("Using your amazing strength you beat the trap!");
			}
		}
	}
		
}
