package behavioralPattern.visitor;

public class Client {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[]{
			new Circle(5),
			new Rectangle(4, 6),
			new Triangle(3, 4)
		};
		
		Visitor areaCalculator = new AreaCaculator();
		for(Shape shape : shapes) {
			shape.accept(areaCalculator);
		}
	}
}
