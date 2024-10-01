package structuralPattern.bridge.shape;

import structuralPattern.bridge.color.Color;

//Abstraction 추상화 인터페이스
//기능 기본 인터페이스
public abstract class Shape {
	protected Color color;

	protected Shape(Color color) {
		this.color = color;
	}

	// Abstraction의 기본 기능
	public abstract String draw();

}
