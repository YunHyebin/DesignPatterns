package structuralPattern.facade;

import structuralPattern.facade.subSystem.*;

//Facade
//Client와 서브시스템 간의 인터페이스를 제공.
//서브시스템의 여러 클래스와 메소드를 조합하여 Client에게 단순화된 메소드 제공.
public class HomeTheaterFacade {
	private DVDPlayer dvdPlayer;
	private Projector projector;
	private SoundSystem soundSystem;

	public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem soundSystem) {
		this.dvdPlayer = dvd;
		this.projector = projector;
		this.soundSystem = soundSystem;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		projector.on();
		projector.wideScreenMode();
		soundSystem.on();
		soundSystem.setVolume(10);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting down movie theater...");
		dvdPlayer.off();
		soundSystem.off();
		projector.off();
	}
}
