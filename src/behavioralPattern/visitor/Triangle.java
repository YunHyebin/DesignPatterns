package behavioralPattern.visitor;

public class Triangle implements Shape {
	private double base;
	private double height;
	
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
