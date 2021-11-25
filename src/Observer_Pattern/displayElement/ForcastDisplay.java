package Observer_Pattern.displayElement;

import Observer_Pattern.Interfaces.Display;
import Observer_Pattern.Interfaces.Observer;
import Observer_Pattern.WeatherData;

public class ForcastDisplay implements Observer, Display {
    private float temperature;
    private WeatherData weatherData;

    public ForcastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if(temperature == 80){
            System.out.printf("Forcast : improvimg weather on the way");
        } else if(temperature > 80){
            System.out.printf("Forcast: Watch out of cooler, rainy weather");
        }else {
            System.out.println("Forcast:More of the Same");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }
}
