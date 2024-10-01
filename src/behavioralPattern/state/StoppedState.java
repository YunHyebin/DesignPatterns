package behavioralPattern.state;

public class StoppedState implements State {
	//정지 상태
	private PlayerContext context;

    public StoppedState(PlayerContext context) {
        this.context = context;
    }

    @Override
    public void play() {
        System.out.println("Playing the video.");
        context.setState(context.getPlayingState()); // 상태를 Playing으로 변경
    }

    @Override
    public void pause() {
        System.out.println("Can't pause. The video is stopped.");
    }

    @Override
    public void stop() {
        System.out.println("Already stopped.");
    }
}
