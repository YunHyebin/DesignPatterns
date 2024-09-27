package behavioralPattern.state;

public class Client {

	public static void main(String[] args) {
		//상태 전환 테스트
		PlayerContext player = new PlayerContext();

        player.play();  // Stopped -> Playing
        player.pause(); // Playing -> Paused
        player.play();  // Paused -> Playing
        player.stop();  // Playing -> Stopped
    }
}
