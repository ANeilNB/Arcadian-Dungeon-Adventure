package map;

import java.util.Random;

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
			
		}
		this.threshValue = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM ;
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
	public void writeDescription() {
		// TODO Auto-generated method stub
		
	}
		
}
