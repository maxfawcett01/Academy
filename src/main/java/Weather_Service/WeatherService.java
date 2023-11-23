package Weather_Service;

import java.util.Random;

public class WeatherService implements WeatherServiceInterface{
    private final Random random = new Random();

    double chanceOfRain = random.nextDouble(1);

    public double getChanceOfRain() {
        return chanceOfRain;
    }
}
