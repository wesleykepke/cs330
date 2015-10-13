/*
 * This is the Asia Model 3 factory. 
 */
public class Asia_Model3_Factory implements BatteryComponentFactory {
	public Cell createCell() {
		return new leadCell(); 
	}
	
	public Casing createCasing() {
		return new bambooCasing(); 
	}
	
	public Controller createController() {
		return new raspberryPiController(); 
	}
	
	public Charger createCharger() {
		return new pedalCharger(); 
	}
}