package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

    @Test
    void shouldSetActiveStationInConstructor() {
        Radio radio = new Radio(85);

        radio.setActiveStation(84);
        int expected = 84;
        int actual = radio.getActiveStation();

        Assertions.assertEquals(expected,actual);
    }


    @Test
    void shouldSetActiveStation() {
        Radio radio = new Radio();

        radio.setActiveStation(5);
        int expected = 5;
        int actual = radio.getActiveStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldSetActiveStationOverUpperLimit() {
        Radio radio = new Radio();

        radio.setActiveStation(11);
        int expected = 0;
        int actual = radio.getActiveStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldSetActiveStationUnderLowerLimit() {
        Radio radio = new Radio();

        radio.setActiveStation(-1);
        int expected = 0;
        int actual = radio.getActiveStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldMoveToTheNextStation() {
        Radio radio = new Radio();

        radio.setActiveStation(6);
        radio.nextStation();
        int expected = 7;
        int actual = radio.getActiveStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldReturnStationToTheFirstStation() {
        Radio radio = new Radio();

        radio.setActiveStation(10);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getActiveStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldMoveStationBackToThePreviousStation() {
        Radio radio = new Radio();

        radio.setActiveStation(7);
        radio.previousStation();
        int expected = 6;
        int actual = radio.getActiveStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldMoveStationForwardToTheFinalStep() {
        Radio radio = new Radio();

        radio.setActiveStation(0);
        radio.previousStation();
        int expected = 9;
        int actual = radio.getActiveStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldSetActiveVolume() {
        Radio radio = new Radio();

        radio.setActiveVolume(5);
        int expected = 5;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldSetActiveVolumeUnderLowerLimit() {
        Radio radio = new Radio();

        radio.setActiveVolume(-1);
        int expected = 0;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldSetActiveVolumeOverUpperLimit() {
        Radio radio = new Radio();

        radio.setActiveVolume(155);
        int expected = 0;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldTurnUpActiveVolume() {
        Radio radio = new Radio();

        radio.setActiveVolume(7);
        radio.turningActiveVolumeUp();
        int expected = 8;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldStopTurningActiveVolumeUpInUpperLimit() {
        Radio radio = new Radio();

        radio.setActiveVolume(100);
        radio.turningActiveVolumeUp();
        int expected = 100;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldDownGradeActiveVolume() {
        Radio radio = new Radio();

        radio.setActiveVolume(3);
        radio.downGradingActiveVolume();
        int expected = 2;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldStopDownGradingActiveVolumeInLowerLimit() {
        Radio radio = new Radio();

        radio.setActiveVolume(0);
        radio.downGradingActiveVolume();
        int expected = 0;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(expected,actual);
    }
}