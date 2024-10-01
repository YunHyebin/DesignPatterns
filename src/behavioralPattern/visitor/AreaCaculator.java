package behavioralPattern.visitor;

public class AreaCaculator implements Visitor {

	@Override
	public void visit(Circle circle) {
		double area = Math.PI * circle.getRadius() * circle.getRadius();
		System.out.println("Circle Area: " + area);
		
	}

	@Override
	public void visit(Rectangle rectangle) {
		double area = rectangle.getWidth() * rectangle.getHeight();
		System.out.println("Rectanlge Area: " + area);
	}

	@Override
	public void visit(Triangle triangle) {
		double area = 0.5 * triangle.getBase() * triangle.getHeight();
		System.out.println("Triangle Area: " + area);
	}

}