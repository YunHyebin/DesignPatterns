package creationalPattern.factoryMethod.transport;

public class Client {

	public static void main(String[] args) {
		Logistics roadLogistics = new RoadLogistics();
		roadLogistics.planDelivery(); // outputs : Deliver by land in a truck

		Logistics seaLogistics = new SeaLogistics();
		seaLogistics.planDelivery(); // outputs : Deliver by sea in a ship
	}
}