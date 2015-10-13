/*
 * This is the abstract class for a Battery object. 
 */
public abstract class Battery {
	Cell cell;
	Casing casing;
	Controller controller;
	Charger charger;
	String name; 
	
	abstract void build(); 
	
	void collectParts() {
		System.out.println("Collecting parts..");
	}
	
	void testParts() {
		System.out.println("Testing parts..");
	}
	
	void assembleParts() {
		System.out.println("Assembling parts..");
	}
	
	void testBattery() {
		System.out.println("Testing battery..");
	}
	
	void ship() {
		System.out.println("Shipping battery..");
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String n) {
		name = n; 
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer(); 
		result.append("---- " + name + " ----\n"); 
		if (cell != null) {
			result.append(cell);
			result.append("\n"); 
		}
		if (casing != null) {
			result.append(casing);
			result.append("\n"); 
		}
		if (controller != null) {
			result.append(controller);
			result.append("\n"); 
		}
		if (charger != null) {
			result.append(charger);
			result.append("\n"); 
		}
		return result.toString(); 
	}
}