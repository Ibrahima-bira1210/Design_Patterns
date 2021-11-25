package Observer_Pattern.displayElement;

import Observer_Pattern.Interfaces.Display;
import Observer_Pattern.Interfaces.Observer;
import Observer_Pattern.WeatherData;

public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current Conditions : " + temperature + "F degrees and " + humidity + " humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
