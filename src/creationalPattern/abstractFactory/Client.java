package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.furnitureFactory.*;
import creationalPattern.abstractFactory.furnitureProduct.*;

public class Client {
	private Chair chair;
	private Table table;

	public Client(FurnitureFactory factory) {
		chair = factory.createChair();
		table = factory.createTable();
	}

	public void useFurniture() {
		chair.sitOn();
		table.placeOn();
	}

	public static void main(String[] args) {
		FurnitureFactory modernfactory = new ModernFurnitureFactory();
		Client modernClient = new Client(modernfactory);
		modernClient.useFurniture();

		FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
		Client victorianClient = new Client(victorianFactory);
		victorianClient.useFurniture();
	}
}
