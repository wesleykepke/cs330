/*
 * This is the EU Model S factory. 
 */
public class EU_Model3_Factory implements BatteryComponentFactory {
	public Cell createCell() {
		return new leadCell(); 
	}
	
	public Casing createCasing() {
		return new cardboardCasing(); 
	}
	
	public Controller createController() {
		return new raspberryPiController(); 
	}
	
	public Charger createCharger() {
		return new windmillCharger(); 
	}
}