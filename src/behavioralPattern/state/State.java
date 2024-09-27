package behavioralPattern.state;

public interface State {
	//각 상태에서 구현할 핼동 정의
	void play();
	void pause();
	void stop();

}
