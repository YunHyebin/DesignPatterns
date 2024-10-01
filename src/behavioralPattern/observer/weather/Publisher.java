package behavioralPattern.observer.weather;

public interface Publisher {
	//observer를 등록, 제거, 알리는 역할
	public void register(Observer obj);
	public void unregister(Observer obj);
	public void notifyObservers();
}
