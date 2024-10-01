package behavioralPattern.mediator;

//Component: 특정 작업(비즈니스 로직)을 수행하는 인터페이스
public interface User {
	void send(String message);

	void receive(String message);
}