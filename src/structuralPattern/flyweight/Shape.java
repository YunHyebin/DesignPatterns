package structuralPattern.flyweight;

//Flyweight 인터페이스 역할
// 공유할 객체의 인터페이스
//공통된 내부 state를 공유할 수 있고,
//Client나 Context에게 전달받은 외부 상태와 내부상태를 조합하여 동작한다.
public interface Shape {
	void draw(ExternalContext context); // 외부 상태(색상 등)를 Context를 통해 전달
}
