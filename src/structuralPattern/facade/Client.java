package structuralPattern.facade;
import structuralPattern.facade.subSystem.*;

public class Client {
	public static void main(String[] args) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		Projector projector = new Projector();
		SoundSystem soundSystem = new SoundSystem();

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

		homeTheater.watchMovie("Inception");
		homeTheater.endMovie();
	}
}
