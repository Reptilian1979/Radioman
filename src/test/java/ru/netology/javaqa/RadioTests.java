package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

   @Test
   void shouldScrollFrequencyUpInLimits(){
       Radio radio = new Radio();
       radio.setActiveFrequency(7);
       radio.scrollingFrequencyUpInLimits();
       int expected = 8;
       int actual = radio.getActiveFrequency();
       Assertions.assertEquals(expected,actual);
   }

    @Test
    void shouldControlFrequencyLineOverUpperLimit() {
        Radio radio = new Radio();
        radio.setActiveFrequency(22);
        radio.scrollingFrequencyLineOverUpperLimit();
        int expected = 0;
        int actual = radio.getActiveFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldScrollFrequencyDownInLimits(){
        Radio radio = new Radio();
        radio.setActiveFrequency(7);
        radio.scrollingFrequencyDownInLimits();
        int expected = 6;
        int actual = radio.getActiveFrequency();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldScrollFrequencyDownAtLowerLimit(){
        Radio radio = new Radio();
        radio.setActiveFrequency(-22);
        radio.scrollingFrequencyDownAtLowerLimit();
        int expected = 9;
        int actual = radio.getActiveFrequency();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldScrollVolumeUpInLimits(){
        Radio radio = new Radio();
        radio.setActiveVolume(7);
        radio.scrollingVolumeUpInLimits();
        int expected = 8;
        int actual = radio.getActiveVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldControlVolumeLineOverUpperLimit() {
        Radio radio = new Radio();
        radio.setActiveVolume(22);
        radio.scrollingVolumeLineOverUpperLimit();
        int expected = 10;
        int actual = radio.getActiveVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldScrollVolumeDownInLimits(){
        Radio radio = new Radio();
        radio.setActiveVolume(7);
        radio.scrollingVolumeDownInLimits();
        int expected = 6;
        int actual = radio.getActiveVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldScrollVolumeDownAtLowerLimit(){
        Radio radio = new Radio();
        radio.setActiveVolume(-22);
        radio.scrollingVolumeDownAtLowerLimit();
        int expected = 0;
        int actual = radio.getActiveVolume();
        Assertions.assertEquals(expected,actual);
    }

}
