package structuralPattern.flyweight;

//Context
//Flyweight(Circle)의 외부상태를 관리하는 클래스
//외부 상태는 객체 간에 공유되지 않기 때문에 Context가 Flyweight 객체에 이 상태를 전달한다.
public class ExternalContext {
	private String color; // 외부상태(색상)
	private int x; 		  // 외부상태 (x좌표)
	private int y; 		  // 외부상태 (y좌표)

	public ExternalContext(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
