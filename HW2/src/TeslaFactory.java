/*
 * This is the abstract Tesla factory. 
 */
public abstract class TeslaFactory {
	public Battery orderBattery(BatteryType type) {
		Battery battery = makeBattery(type);
		System.out.println("--- Making a " + battery.getName() + " ---");
		battery.collectParts();
		battery.testParts();
		battery.testBattery();
		battery.ship();
		return battery; 
	}
	
	abstract Battery makeBattery(BatteryType type);
}