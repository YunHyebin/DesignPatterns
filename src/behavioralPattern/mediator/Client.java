package behavioralPattern.mediator;

public class Client {
    public static void main(String[] args) {
        // 중재자 생성
        ChatMediator mediator = new ChatRoomMediator();

        // 사용자 생성
        User user1 = new ConcreteUser("Alice", mediator);
        User user2 = new ConcreteUser("Bob", mediator);
        User user3 = new ConcreteUser("Charlie", mediator);

        // 사용자들을 중재자에 추가
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        // 사용자들 간의 메시지 전송
        user1.send("Hello, everyone!");
        user2.send("Hi Alice!");
        user3.send("Hey, Bob!");
    }
}
