package map;

public class Door extends Openable {

	private Boolean isUnlocked;
	private Boolean isTrap;
	
	public Door() {
		isUnlocked = false;
		isTrap = false;
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
	
	
}
