package Weather_Service;

public interface WeatherServiceInterface {
    default double getChanceOfRain() {
        return 0;
    }
}
