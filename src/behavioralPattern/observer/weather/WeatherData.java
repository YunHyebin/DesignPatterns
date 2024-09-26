package behavioralPattern.observer.weather;

import java.util.ArrayList;

public class WeatherData implements Publisher {
	//날씨 데이터를 관리하고 데이터 변경되면 등록된 옵저버들에게 이를 통지
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {
		observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		int i = observers.indexOf(obj);
		if(i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	//날씨 데이터가 변경될 때 호출하는 메소드
	public void measurementsChanged() {
		notifyObservers();
	}
	
	//새로운 날씨 데이터를 설정하는 메소드
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
