package behavioralPattern.observer.weather;

public class WeatherStation {
	//weather객체를 생성하고, observer(디스플레이 장치)를 등록
	//날씨 데이터가 변경되면 디스플레이들잉 자동으로 업데이트 됨.

	public static void main(String[] args) {		
		//publisher
		WeatherData weatherData = new WeatherData();
		
		//observers
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		
        // 날씨 데이터 변경
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

	}

}
