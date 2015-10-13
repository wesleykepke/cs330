/*
 * This is the USA Model S factory. 
 */
public class USA_ModelS_Factory implements BatteryComponentFactory {
	public Cell createCell() {
		return new lithiumCell(); 
	}
	
	public Casing createCasing() {
		return new aluminumCasing(); 
	}
	
	public Controller createController() {
		return new arduinoController(); 
	}
	
	public Charger createCharger() {
		return new voltCharger110(); 
	}
}
