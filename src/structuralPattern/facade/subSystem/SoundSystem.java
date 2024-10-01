package structuralPattern.facade.subSystem;

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
