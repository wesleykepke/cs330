/*
 * This is the interface that all regional battery factories will implement.
 */
public interface BatteryComponentFactory {
	public Cell createCell();
	public Casing createCasing();
	public Controller createController();
	public Charger createCharger(); 
}
