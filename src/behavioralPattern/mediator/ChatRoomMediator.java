package behavioralPattern.mediator;

import java.util.ArrayList;
import java.util.List;

//ConcreteMediator: 구체적인 상호작용 로직을 구현
public class ChatRoomMediator implements ChatMediator {
	private List<User> users;

	public ChatRoomMediator() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User u : users) {
			// 메시지를 보낸 사용자를 제외한 모든 사용자에게 메시지 전달
			if (u != user) {
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}
}
