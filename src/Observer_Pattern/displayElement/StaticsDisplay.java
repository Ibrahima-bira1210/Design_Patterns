package Observer_Pattern.displayElement;

import Observer_Pattern.Interfaces.Display;
import Observer_Pattern.Interfaces.Observer;
import Observer_Pattern.WeatherData;

public class StaticsDisplay implements Observer, Display {
    private float temperature;
    private WeatherData weatherData;

    public StaticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature =" + temperature + "/" + temperature + "/" + temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }
}
