package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

    @Test
    void shouldControlFrequencyLineOverUpperLimit() {
        Radio radio = new Radio();
        radio.setActiveFrequency(22);
        int expected = 0;
        int actual = radio.getActiveFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldControlFrequencyLineUnderFirstStep() {
        Radio radio = new Radio();
        radio.setActiveFrequency(-22);
        int expected = 0;
        int actual = radio.getActiveFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldScrollFrequencyUp() {
        Radio radio = new Radio();
        radio.setActiveFrequency(3);
        int expected = 3;
        int actual = radio.getActiveFrequency();
        Assertions.assertEquals(expected, actual);

    }
}
