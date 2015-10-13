/*
 * This is the Tesla factory for Asia.
 */
public class Asia_TeslaFactory extends TeslaFactory {
	protected Battery makeBattery(BatteryType type) {
		Battery battery = null; 
		BatteryComponentFactory componentFactory = null; 
		if (type.equals(BatteryType.modelS)) {
			componentFactory = new Asia_ModelS_Factory();
			battery = new ModelS(componentFactory);
			battery.build();
			battery.setName("Asia Model S");
		}
		else if (type.equals(BatteryType.modelX)) {
			componentFactory = new Asia_ModelX_Factory();
			battery = new ModelX(componentFactory);
			battery.build();
			battery.setName("Asia Model X");
		}
		else if (type.equals(BatteryType.model3)) {
			componentFactory = new Asia_Model3_Factory();
			battery = new Model3(componentFactory);
			battery.build();
			battery.setName("Asia Model 3");
			
		}
		return battery; 
	}
}