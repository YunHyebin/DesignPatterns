package structuralPattern.facade.subSystem;

//서브 시스템1: DVD 플레이어
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
