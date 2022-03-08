package ru.netology.radiowave;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioUnitTest {

    private static final short CURRENT_VOLUME = (short) 8;

    @Test
    void shouldSetNextStationZeroIfCurrentIsNine() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(9);
        radioStation.setNextStation();
        int expected = 0;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldSetPrevStationNineIfCurrentIsZero() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(0);
        radioStation.setPrevStation();
        int expected = 9;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationFourIfCurrentIsFive() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(5);
        radioStation.setPrevStation();
        int expected = 4;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextStationFourIfCurrentIsThree() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(3);
        radioStation.setNextStation();
        int expected = 4;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(8);

        int expected = 8;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetStationIfMoreThanTen() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(11);

        int expected = 0;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetStationIfLessThanZero() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(-2);

        int expected = 0;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolume() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(CURRENT_VOLUME);
        radioStation.increaseVolume();

        int expected = 9;
        int actual = radioStation.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeIfCurrentIsTen() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume((short) 10);
        radioStation.increaseVolume();

        int expected = 10;
        int actual = radioStation.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolume() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(CURRENT_VOLUME);
        radioStation.decreaseVolume();

        int expected = 7;
        int actual = radioStation.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeIfCurrentIsZero() {
        Radio radioStation = new Radio();
        radioStation.decreaseVolume();

        int expected = 0;
        int actual = radioStation.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(CURRENT_VOLUME);

        int expected = 8;
        int actual = radioStation.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeIfLessThanZero() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume((short) -2);

        int expected = 0;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeIfMoreThanTen() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume((short) 11);

        int expected = 0;
        int actual = radioStation.getCurrentStation();
        assertEquals(expected, actual);
    }

}
