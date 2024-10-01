package structuralPattern.bridge;

import structuralPattern.bridge.color.*;
import structuralPattern.bridge.shape.*;




public class Client {
	public static void main(String[] args) {
		Shape redCircle = new Circle(new Red());
		Shape blueSquare = new Square(new Blue());

		System.out.println(redCircle.draw());
		System.out.println(blueSquare.draw());
	}
}
