package structuralPattern.bridge.shape;

import structuralPattern.bridge.color.Color;

//확정된 추상화 기능(원)
public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "원을 그립니다." + color.fill();
	}

}
