package Observer_Pattern;

import Observer_Pattern.displayElement.CurrentConditionDisplay;
import Observer_Pattern.displayElement.ForcastDisplay;
import Observer_Pattern.displayElement.StaticsDisplay;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentCondition = new CurrentConditionDisplay(weatherData);
        ForcastDisplay ForcastDisplay = new ForcastDisplay(weatherData);
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);

        weatherData.setMeasurement(80,65,35.4f);
        weatherData.setMeasurement(82,70,29.2f);
        weatherData.setMeasurement(78,90,29.2f);

    }
}
