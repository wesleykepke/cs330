/*
 * This is the main program that will be used for testing purposes. 
 */
public class TeslaMain {
	public static void main(String[] args) {
		// create regional factories
		Asia_TeslaFactory asiaFactory = new Asia_TeslaFactory(); 
		EU_TeslaFactory europeFactory = new EU_TeslaFactory();
		USA_TeslaFactory americaFactory = new USA_TeslaFactory();
		
		// testing USA models 
		Battery usaModelS = americaFactory.makeBattery(BatteryType.modelS);
		String usaModelSDescription = usaModelS.toString();
		System.out.println(usaModelSDescription);
		Battery usaModelX = americaFactory.makeBattery(BatteryType.modelX);
		String usaModelXDescription = usaModelX.toString();
		System.out.println(usaModelXDescription);
		Battery usaModel3 = americaFactory.makeBattery(BatteryType.model3);
		String usaModel3Description = usaModel3.toString();
		System.out.println(usaModel3Description);
		
		// testing EU models
		Battery euModelS = europeFactory.makeBattery(BatteryType.modelS);
		String euModelSDescription = euModelS.toString();
		System.out.println(euModelSDescription);
		Battery euModelX = europeFactory.makeBattery(BatteryType.modelX);
		String euModelXDescription = euModelX.toString();
		System.out.println(euModelXDescription);
		Battery euModel3 = europeFactory.makeBattery(BatteryType.model3);
		String euModel3Description = euModel3.toString();
		System.out.println(euModel3Description);
		
		// testing Asia models
		Battery asiaModelS = asiaFactory.makeBattery(BatteryType.modelS);
		String asiaModelSDescription = asiaModelS.toString();
		System.out.println(asiaModelSDescription);
		Battery asiaModelX = asiaFactory.makeBattery(BatteryType.modelX);
		String asiaModelXDescription = asiaModelX.toString();
		System.out.println(asiaModelXDescription);
		Battery asiaModel3 = asiaFactory.makeBattery(BatteryType.model3);
		String asiaModel3Description = asiaModel3.toString();
		System.out.println(asiaModel3Description);
	}

}
