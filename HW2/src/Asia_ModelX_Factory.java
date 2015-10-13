/*
 * This is the Asia Model X factory. 
 */
public class Asia_ModelX_Factory implements BatteryComponentFactory {
	public Cell createCell() {
		return new dualCarbonCell(); 
	}
	
	public Casing createCasing() {
		return new kevlarCasing(); 
	}
	
	public Controller createController() {
		return new xiaomiV2Controller(); 
	}
	
	public Charger createCharger() {
		return new voltCharger220(); 
	}
}