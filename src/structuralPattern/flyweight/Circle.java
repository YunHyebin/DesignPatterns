package structuralPattern.flyweight;

//ConcreteFlyweight
public class Circle implements Shape {
	private String intrinsicState = "Circle"; // 내부 상태 Circle(변하지 않는 공유되는 속성)
	
	@Override
	public void draw(ExternalContext context) {
		System.out.println("Drawing a " + intrinsicState + " with color " + context.getColor() +
				" at position (" + context.getX() + ", " + context.getY() + ")");

	}

}
