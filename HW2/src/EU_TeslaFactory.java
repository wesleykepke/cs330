/*
 * This is the Tesla factory for EU. 
 */
public class EU_TeslaFactory extends TeslaFactory {
	protected Battery makeBattery(BatteryType type) {
		Battery battery = null; 
		BatteryComponentFactory componentFactory = null; 
		if (type.equals(BatteryType.modelS)) {
			componentFactory = new EU_ModelS_Factory();
			battery = new ModelS(componentFactory);
			battery.build(); 
			battery.setName("EU Model S");
		}
		else if (type.equals(BatteryType.modelX)) {
			componentFactory = new EU_ModelX_Factory();
			battery = new ModelX(componentFactory);
			battery.build();
			battery.setName("EU Model X");
		}
		else if (type.equals(BatteryType.model3)) {
			componentFactory = new EU_Model3_Factory();
			battery = new Model3(componentFactory);
			battery.build();
			battery.setName("EU Model 3");
			
		}
		return battery; 
	}
}