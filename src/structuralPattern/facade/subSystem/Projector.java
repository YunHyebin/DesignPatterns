package structuralPattern.facade.subSystem;

//Complex Subsystem2: 프로젝터 서브 시스템
//실제 비즈니스 로직과 기능을 한다.
public class Projector {
	public void on() {
		System.out.println("Projector is on.");
	}
	
	public void wideScreenMode() {
		System.out.println("Projector in widescreen mode.");
	}
	
	public void off() {
		System.out.println("Projector is off.");
	}
}
