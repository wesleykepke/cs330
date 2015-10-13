/*
 * This is the EU Model X factory. 
 */
public class EU_ModelX_Factory implements BatteryComponentFactory {
	public Cell createCell() {
		return new dualCarbonCell(); 
	}
	
	public Casing createCasing() {
		return new kevlarCasing(); 
	}
	
	public Controller createController() {
		return new arduinoV2Controller(); 
	}
	
	public Charger createCharger() {
		return new voltCharger230(); 
	}
}