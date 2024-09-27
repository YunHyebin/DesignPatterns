package behavioralPattern.state;

public class PlayingState implements State {
	//재생중인 상태
	private PlayerContext context;
	
	public PlayingState(PlayerContext context) {
		this.context = context;
	}

	@Override
	public void play() {
		System.out.println("Already playing.");
	}

	@Override
	public void pause() {
		System.out.println("Pausing the video.");
        context.setState(context.getPausedState()); // 상태를 Paused로 변경
    }

    @Override
    public void stop() {
        System.out.println("Stopping the video.");
        context.setState(context.getStoppedState()); // 상태를 Stopped로 변경
    }

}
