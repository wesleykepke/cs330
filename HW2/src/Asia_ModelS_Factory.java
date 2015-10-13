/*
 * This is the Asia Model S factory. 
 */
public class Asia_ModelS_Factory implements BatteryComponentFactory {
	public Cell createCell() {
		return new lithiumCell(); 
	}
	
	public Casing createCasing() {
		return new aluminumCasing(); 
	}
	
	public Controller createController() {
		return new xiaomiController(); 
	}
	
	public Charger createCharger() {
		return new voltCharger220(); 
	}
}