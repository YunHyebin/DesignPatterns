package structuralPattern.adapter.UsbAdapter;

//Adaptee(Service)역할
//자체적인 실제 비즈니스 로직(기능)을 제공하는 클래스
//Adapter가 이 클래스를 감싼다.
public class HDMI {
	public void connectWithHDMI() {
		System.out.println("Connected with HDMI");
	}
}
