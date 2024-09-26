package behavioralPattern.observer.message;

public class TopicSubscriber implements Observer{
	private String name;
	private Subject topic;
	
	public TopicSubscriber(String name, Subject topic) {
		this.name = name;
		this.topic = topic;
	}
	
	@Override
	public void update() {
		String msg = topic.getUpdate(this).toString();
		System.out.println(name + ":: got message >> " +msg);
	}

}
