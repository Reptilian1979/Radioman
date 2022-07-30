package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

    @Test
    void shouldSetActiveFrequency() {
        Radio radio = new Radio();

        radio.setActiveFrequency (5);
        int expected = 5;
        int actual = radio.getActiveFrequency();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldSetActiveFrequencyOverUpperLimit() {
        Radio radio = new Radio();

        radio.setActiveFrequency (55);
        int expected = 0;
        int actual = radio.getActiveFrequency();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldSetActiveFrequencyUnderLowerLimit() {
        Radio radio = new Radio();

        radio.setActiveFrequency (-1);
        int expected = 0;
        int actual = radio.getActiveFrequency();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldMoveToTheNextFrequency() {
        Radio radio = new Radio();

        radio.setActiveFrequency(6);
        radio.nextFrequency();
        int expected = 7;
        int actual = radio.getActiveFrequency();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldReturnFrequencyToTheFirstStep() {
        Radio radio = new Radio();

        radio.setActiveFrequency(9);
        radio.nextFrequency();
        int expected = 0;
        int actual = radio.getActiveFrequency();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldMoveToThePreviousFrequency() {
        Radio radio = new Radio();

        radio.setActiveFrequency(7);
        radio.previousFrequency();
        int expected = 6;
        int actual = radio.getActiveFrequency();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldMoveForwardToTheFinalStep() {
        Radio radio = new Radio();

        radio.setActiveFrequency(0);
        radio.previousFrequency();
        int expected = 9;
        int actual = radio.getActiveFrequency();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldSetActiveVolume() {
        Radio radio = new Radio();

        radio.setActiveVolume (5);
        int expected = 5;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldSetActiveVolumeUnderLowerLimit() {
        Radio radio = new Radio();

        radio.setActiveVolume (-1);
        int expected = 0;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldSetActiveVolumeOverUpperLimit() {
        Radio radio = new Radio();

        radio.setActiveVolume(22);
        int expected = 0;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldTurnUpActiveVolume() {
        Radio radio = new Radio();

        radio.setActiveVolume(7);
        radio.turningActiveVolumeUp();
        int expected = 8;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldStopTurningActiveVolumeUpInUpperLimit() {
        Radio radio = new Radio();

        radio.setActiveVolume(10);
        radio.turningActiveVolumeUp();
        int expected = 10;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldDownGradeActiveVolume() {
        Radio radio = new Radio();

        radio.setActiveVolume(3);
        radio.downGradingActiveVolume();
        int expected = 2;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldStopDownGradingActiveVolumeInLowerLimit() {
        Radio radio = new Radio();

        radio.setActiveVolume(0);
        radio.downGradingActiveVolume();
        int expected = 0;
        int actual = radio.getActiveVolume();

        Assertions.assertEquals(actual, expected);
    }
}