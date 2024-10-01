package structuralPattern.bridge.shape;

import structuralPattern.bridge.color.Color;

//확정된 추상화 기능(사각형)
public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "정사각형을 그립니다." + color.fill();
	}

}
