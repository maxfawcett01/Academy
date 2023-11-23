package Weather_Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;

class UmbrellaAcademyTest {

    @ParameterizedTest
    @CsvSource({"0.49, False", "0.50, False", "0.51, True"})
    void test(double chanceOfRain, Boolean choice) {
        FakeWeatherService fakeWeatherService = new FakeWeatherService();
        UmbrellaAcademy umbrella = new UmbrellaAcademy(fakeWeatherService);
        fakeWeatherService.setFakeRandom(chanceOfRain);
        boolean actual = umbrella.shouldICarryAnUmbrella();
        boolean expected = choice;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0.49, False", "0.50, False", "0.51, True"})
    void testToFailMock(double chanceOfRain, Boolean choice) {
        WeatherService mockWeatherService = Mockito.mock(WeatherService.class);
        Mockito.when(mockWeatherService.getChanceOfRain()).thenReturn(chanceOfRain);

        PublicServiceAnnouncement mockPsa = Mockito.mock(PublicServiceAnnouncement.class);
        Mockito.when(mockPsa.getAnnouncement()).thenReturn("Fake Announcement");

        UmbrellaAcademy umbrellaAcademy = new UmbrellaAcademy(mockWeatherService, mockPsa);
        boolean actualResult = umbrellaAcademy.shouldICarryAnUmbrella();
        boolean expected = choice;
        Assertions.assertEquals(expected, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"0.74, False", "0.75, False", "0.76, True"})
    void testPublicServiceAnnouncement(double chanceOfRain, Boolean expected) {
        WeatherService mockWeatherService = Mockito.mock(WeatherService.class);
        Mockito.when(mockWeatherService.getChanceOfRain()).thenReturn(chanceOfRain);

        PublicServiceAnnouncement mockPsa = Mockito.mock(PublicServiceAnnouncement.class);
        Mockito.when(mockPsa.getAnnouncement()).thenReturn("Fake Announcement");

        UmbrellaAcademy umbrellaAcademy = new UmbrellaAcademy(mockWeatherService, mockPsa);
        boolean actualResult = umbrellaAcademy.isThereAnAnnouncement();
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void testSetAnnouncementIsCalled() {
        WeatherService mockWeatherService = Mockito.mock(WeatherService.class);
        Mockito.when(mockWeatherService.getChanceOfRain()).thenReturn(0.76);

        PublicServiceAnnouncement mockPsa = Mockito.mock(PublicServiceAnnouncement.class);
        Mockito.when(mockPsa.getAnnouncement()).thenReturn("Fake Announcement");

        UmbrellaAcademy umbrellaAcademy = new UmbrellaAcademy(mockWeatherService, mockPsa);
        umbrellaAcademy.isThereAnAnnouncement();

        Mockito.verify(mockPsa, times(1)).setAnnouncement(UmbrellaAcademy.CARRY_AN_UMBRELLA);
        Mockito.verify(mockPsa, times(1)).getAnnouncement();
    }
}