package behavioralPattern.observer.weather;

public class CurrentConditionDisplay implements Observer {
	//날씨 데이터를 구독하고 변경된 정보를 바탕으로 디스플레이 갱신
	private float temperature;
	private float humidity;
	private Publisher weatherData;
	
    // 생성자에서 Subject(Publisher)를 받음
	public CurrentConditionDisplay(Publisher weatherData) {
		this.weatherData = weatherData;
		weatherData.register(this);
	}

	//날씨 데이터 변경되었을 때 업데이트
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
	}

}
