/*
 * This is the implementation of the Model X object. 
 */
public class Model3 extends Battery {
	BatteryComponentFactory factory;
	
	public Model3(BatteryComponentFactory factory) {
		this.factory = factory; 
	}

	public void build() {
		cell = factory.createCell();
		casing = factory.createCasing();
		controller = factory.createController();
		charger = factory.createCharger();
	}
}