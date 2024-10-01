package structuralPattern.facade.subSystem;

//Complex Subsystem1: dvd플레이어 서브 시스템
//실제 비즈니스 로직과 기능을 한다.
public class DVDPlayer {
	public void on() {
		System.out.println("DVD Player is on.");
	}

	public void play(String movie) {
		System.out.println("Playing movie:" + movie);
	}

	public void off() {
		System.out.println("DVD Player is off.");
	}
}
