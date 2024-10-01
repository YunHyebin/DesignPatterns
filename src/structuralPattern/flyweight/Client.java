package structuralPattern.flyweight;

public class Client {

	public static void main(String[] args) {
		Shape circle1 = ShapeFactory.getCircle(); //flyweight 새로 생성
		ExternalContext context1 = new ExternalContext("Red", 10, 20);
		circle1.draw(context1);

		Shape circle2 = ShapeFactory.getCircle(); //flyweight 재사용
		ExternalContext context2 = new ExternalContext("Green", 30, 40);
		circle2.draw(context2);

		Shape circle3 = ShapeFactory.getCircle(); ////flyweight 재사용
		ExternalContext context3 = new ExternalContext("Blue", 50, 60);
		circle3.draw(context3);

		// 같은 Circle 객체를 재사용
		System.out.println(circle1 == circle2); // true
	}
}