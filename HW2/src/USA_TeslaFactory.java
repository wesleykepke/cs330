/*
 * This is the Tesla factory for the USA.
 */
public class USA_TeslaFactory extends TeslaFactory {
	protected Battery makeBattery(BatteryType type) {
		Battery battery = null; 
		BatteryComponentFactory componentFactory = null; 
		if (type.equals(BatteryType.modelS)) {
			componentFactory = new USA_ModelS_Factory();
			battery = new ModelS(componentFactory); 
			battery.build();
			battery.setName("USA Model S");
		}
		else if (type.equals(BatteryType.modelX)) {
			componentFactory = new USA_ModelX_Factory();
			battery = new ModelX(componentFactory); 
			battery.build();
			battery.setName("USA Model X");
		}
		else if (type.equals(BatteryType.model3)) {
			componentFactory = new USA_Model3_Factory();
			battery = new Model3(componentFactory); 
			battery.build(); 
			battery.setName("USA Model 3");
			
		}
		return battery; 
	}
}
