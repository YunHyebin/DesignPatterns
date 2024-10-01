package structuralPattern.facade.subSystem;

//Complex Subsystem3: 사운드 서브 시스템
//실제 비즈니스 로직과 기능을 한다.
public class SoundSystem {
	public void on() {
		System.out.println("Sound System is on.");
	}
	
	public void setVolume(int level) {
		System.out.println("Setting volume to " + level);
	}
	
	public void off() {
		System.out.println("Sound System is off.");
	}
}
