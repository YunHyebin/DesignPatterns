package behavioralPattern.observer.weather;

public interface Observer {
	//구독자들이 구현할 메소드 정의
	void update(float temperature, float humidity, float pressure);
}
