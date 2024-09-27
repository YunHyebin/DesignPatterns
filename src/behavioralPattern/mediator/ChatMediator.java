package behavioralPattern.mediator;

//Mediator: 각 component간의 상호작용을 정의하는 메소드를 선언.
public interface ChatMediator {
	void sendMessage(String message, User user);

	void addUser(User user);
}
