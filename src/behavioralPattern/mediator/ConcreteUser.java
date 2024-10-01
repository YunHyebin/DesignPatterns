package behavioralPattern.mediator;

//ConcreteComponents: 특정 비즈니스 로직 구체화
public class ConcreteUser implements User {
	private String name;
	private ChatMediator mediator;

	public ConcreteUser(String name, ChatMediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	@Override
	public void send(String message) {
		System.out.println(name + " sends: " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(name + " receives: " + message);
	}
}
