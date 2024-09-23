package behavioralPattern.visitor;

public class Rectangle implements Shape {
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
