package creationalPattern.factoryMethod.transport;

//Creator
//공장 인터페이스.
//factoryMethod로 객체 생성 방법을 정의하고, 객체를 생성하고, 반환한다.
public abstract class Logistics {
	// Factory Method
	public abstract Transport createTransport();

	public void planDelivery() {
		// 팩토리메소드를 이용해서 운송수단(Product, Transport)를 생성한다.
		Transport transport = createTransport();
		// product의 메소드를 사용한다.
		transport.deliver();
	}
}
