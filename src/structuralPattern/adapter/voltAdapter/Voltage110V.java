package structuralPattern.adapter.voltAdapter;

//Adaptee(Service)
//자체적인 비즈니스 로직(기능)을 제공하는 클래스
//Adapter가 감싼다.
public class Voltage110V {
	public String output110V() {
		return "110V 전압";
	}

}
