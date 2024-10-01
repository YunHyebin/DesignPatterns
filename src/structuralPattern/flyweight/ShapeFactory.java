package structuralPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

//Flyweight Factory 역할
//Shape(Flyweight)객체를 생성하고 관리하는 팩토리 클래스
public class ShapeFactory {
	private static final Map<String, Shape> shapeMap = new HashMap<>();
	
	// Client가 Shape(Flyweight)객체를 요청하면 요청한 객체와 동일한 상태를 가진 객체가 있는지 검토한다.
	public static Shape getCircle() {
		Shape circle = shapeMap.get("circle");
		if(circle == null) {
			circle = new Circle();
			shapeMap.put("circle", circle); // 일치하는 기존 객체가 없으면 새 객체를 생성하여 관리한다.
			System.out.println("Creating new Circle object.");
		}else {
			System.out.println("Reusing existing Circle object."); // 일치하는 기존 객체가 있으면 이를 반환한다.
		}
		return circle;
	}

}
