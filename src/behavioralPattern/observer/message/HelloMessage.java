package behavioralPattern.observer.message;

public class HelloMessage {

	public static void main(String[] args) {
		Topic topic = new Topic();
		Observer a = new TopicSubscriber("a", topic);
		Observer b = new TopicSubscriber("b", topic);
		Observer c = new TopicSubscriber("c", topic);
		topic.register(a);
		topic.register(b);
		topic.register(c);
		
		topic.postMessage("빨리 자고싶다");
	}

}
