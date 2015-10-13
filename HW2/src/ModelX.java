/*
 * This is the implementation of the Model X object. 
 */
public class ModelX extends Battery {
	BatteryComponentFactory factory;
	
	public ModelX(BatteryComponentFactory factory) {
		this.factory = factory; 
	}

	public void build() {
		cell = factory.createCell();
		casing = factory.createCasing();
		controller = factory.createController();
		charger = factory.createCharger();
	}
}