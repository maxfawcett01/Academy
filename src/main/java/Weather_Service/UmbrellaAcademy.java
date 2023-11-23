package Weather_Service;

public class UmbrellaAcademy {

    public static final String CARRY_AN_UMBRELLA = "Carry an Umbrella";
    WeatherServiceInterface service;

    PublicServiceAnnouncement publicServiceAnnouncement;

    public UmbrellaAcademy(WeatherServiceInterface service) {
        this.service = service;
    }

    public UmbrellaAcademy(WeatherServiceInterface service, PublicServiceAnnouncement psa) {
        this.service = service;
        this.publicServiceAnnouncement = psa;
    }

    public boolean shouldICarryAnUmbrella() {

        return service.getChanceOfRain() > 0.5;
    }

    public boolean isThereAnAnnouncement() {
        if (service.getChanceOfRain() > 0.75) {

            publicServiceAnnouncement.setAnnouncement(CARRY_AN_UMBRELLA);
            System.out.println(publicServiceAnnouncement.getAnnouncement());
            return true;
        } else {
            return false;
        }
    }
}
