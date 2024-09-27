package behavioralPattern.state.concreteStates;

import behavioralPattern.state.PlayerContext;
import behavioralPattern.state.State;

public class PausedState implements State {
	//일시정지 상태
	private PlayerContext context;

    public PausedState(PlayerContext context) {
        this.context = context;
    }

    @Override
    public void play() {
        System.out.println("Resuming the video.");
        context.setState(context.getPlayingState()); // 상태를 Playing으로 변경
    }

    @Override
    public void pause() {
        System.out.println("Already paused.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the video.");
        context.setState(context.getStoppedState()); // 상태를 Stopped로 변경
    }
}
