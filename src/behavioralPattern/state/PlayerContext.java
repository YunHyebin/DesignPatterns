package behavioralPattern.state;

import behavioralPattern.state.concreteStates.PausedState;
import behavioralPattern.state.concreteStates.PlayingState;
import behavioralPattern.state.concreteStates.StoppedState;

public class PlayerContext {
	//비디오 플레이어의 현재 상태를 관리하고, 상태에 따른 동작을 위임
	private State playingState;
	private State pausedState;
	private State stoppedState;
    private State currentState;

	
	public PlayerContext() {
        playingState = new PlayingState(this);
        pausedState = new PausedState(this);
        stoppedState = new StoppedState(this);
        currentState = stoppedState;  // 초기 상태는 Stopped
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getPlayingState() {
        return playingState;
    }

    public State getPausedState() {
        return pausedState;
    }

    public State getStoppedState() {
        return stoppedState;
    }

    public void play() {
        currentState.play();
    }

    public void pause() {
        currentState.pause();
    }

    public void stop() {
        currentState.stop();
    }
}