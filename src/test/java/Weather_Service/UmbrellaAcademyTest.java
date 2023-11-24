package Weather_Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UmbrellaAcademyTest {
    /**
     * Method under test: {@link UmbrellaAcademy#UmbrellaAcademy(WeatherServiceInterface)}
     */
    @Test
    void testConstructor() {
        // Arrange and Act
        UmbrellaAcademy actualUmbrellaAcademy = new UmbrellaAcademy(new FakeWeatherService());

        // Assert
        assertNull(actualUmbrellaAcademy.publicServiceAnnouncement);
        WeatherServiceInterface weatherServiceInterface = actualUmbrellaAcademy.service;
        assertTrue(weatherServiceInterface instanceof FakeWeatherService);
        assertEquals(0.0d, weatherServiceInterface.getChanceOfRain());
    }

    /**
     * Method under test: {@link UmbrellaAcademy#UmbrellaAcademy(WeatherServiceInterface, PublicServiceAnnouncement)}
     */
    @Test
    void testConstructor2() {
        // Arrange
        FakeWeatherService service = new FakeWeatherService();

        PublicServiceAnnouncement publicServiceAnnouncement = new PublicServiceAnnouncement();
        publicServiceAnnouncement.setAnnouncement("Announcement");

        // Act and Assert
        assertEquals("Announcement",
                (new UmbrellaAcademy(service, publicServiceAnnouncement)).publicServiceAnnouncement.getAnnouncement());
    }

    /**
     * Method under test: {@link UmbrellaAcademy#shouldICarryAnUmbrella()}
     */
    @Test
    void testShouldICarryAnUmbrella() {
        // Arrange, Act and Assert
        assertFalse((new UmbrellaAcademy(new FakeWeatherService())).shouldICarryAnUmbrella());
    }

    /**
     * Method under test: {@link UmbrellaAcademy#shouldICarryAnUmbrella()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testShouldICarryAnUmbrella2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Weather_Service.WeatherServiceInterface.getChanceOfRain()" because "this.service" is null
        //       at Weather_Service.UmbrellaAcademy.shouldICarryAnUmbrella(UmbrellaAcademy.java:21)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new UmbrellaAcademy(null)).shouldICarryAnUmbrella();
    }

    /**
     * Method under test: {@link UmbrellaAcademy#shouldICarryAnUmbrella()}
     */
    @Test
    void testShouldICarryAnUmbrella3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new UmbrellaAcademy(new WeatherService())).shouldICarryAnUmbrella();
    }

    /**
     * Method under test: {@link UmbrellaAcademy#isThereAnAnnouncement()}
     */
    @Test
    void testIsThereAnAnnouncement() {
        // Arrange, Act and Assert
        assertFalse((new UmbrellaAcademy(new FakeWeatherService())).isThereAnAnnouncement());
    }

    /**
     * Method under test: {@link UmbrellaAcademy#isThereAnAnnouncement()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsThereAnAnnouncement2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Weather_Service.WeatherServiceInterface.getChanceOfRain()" because "this.service" is null
        //       at Weather_Service.UmbrellaAcademy.isThereAnAnnouncement(UmbrellaAcademy.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new UmbrellaAcademy(null)).isThereAnAnnouncement();
    }

    /**
     * Method under test: {@link UmbrellaAcademy#isThereAnAnnouncement()}
     */
    @Test
    void testIsThereAnAnnouncement3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        WeatherService service = new WeatherService();

        // Act
        (new UmbrellaAcademy(service, new PublicServiceAnnouncement())).isThereAnAnnouncement();
    }

    /**
     * Method under test: {@link UmbrellaAcademy#isThereAnAnnouncement()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsThereAnAnnouncement4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Weather_Service.PublicServiceAnnouncement.setAnnouncement(String)" because "this.publicServiceAnnouncement" is null
        //       at Weather_Service.UmbrellaAcademy.isThereAnAnnouncement(UmbrellaAcademy.java:27)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new UmbrellaAcademy(new WeatherService(), null)).isThereAnAnnouncement();
    }
}

