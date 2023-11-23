package Weather_Service;



public class FakeWeatherService implements WeatherServiceInterface {
    private double fakeRandom;

    public void setFakeRandom(double fakeRandom) {
        this.fakeRandom = fakeRandom;
    }

    public double getChanceOfRain() {
        return fakeRandom;
    }
}