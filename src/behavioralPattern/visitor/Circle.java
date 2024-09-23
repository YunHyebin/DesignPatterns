package behavioralPattern.visitor;

public class Circle implements Shape {
	//ConcreteElement: Circle
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
