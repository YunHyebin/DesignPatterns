package creationalPattern.factoryMethod.transport;

public class RoadLogistics extends Logistics {
	public Transport createTransport() {
		return new Truck();
	}
}