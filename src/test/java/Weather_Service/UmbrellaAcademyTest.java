package Weather_Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}

