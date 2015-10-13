/*
 * This is the implementation of the Model S object. 
 */
public class ModelS extends Battery {
	BatteryComponentFactory factory;
	
	public ModelS(BatteryComponentFactory factory) {
		this.factory = factory; 
	}

	public void build() {
		cell = factory.createCell();
		casing = factory.createCasing();
		controller = factory.createController();
		charger = factory.createCharger();
	}
}