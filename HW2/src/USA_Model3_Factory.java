/*
 * This is the USA Model 3 factory. 
 */
public class USA_Model3_Factory implements BatteryComponentFactory {
	public Cell createCell() {
		return new leadCell(); 
	}
	
	public Casing createCasing() {
		return new particleBoardCasing(); 
	}
	
	public Controller createController() {
		return new raspberryPiController(); 
	}
	
	public Charger createCharger() {
		return new handcrankCharger(); 
	}
}

