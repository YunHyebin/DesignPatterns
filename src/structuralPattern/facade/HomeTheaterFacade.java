package structuralPattern.facade;

import structuralPattern.facade.subSystem.*;

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
