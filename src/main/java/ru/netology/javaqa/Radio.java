package ru.netology.javaqa;

public class Radio {
    private int activeFrequency;
    private int activeVolume;
    private final int numberOfFrequencies = 9;
    private final int numberOfVolumeSteps = 10;
    private int firstStep = 0;

    public int getActiveFrequency() {

        return activeFrequency;

    }

    public int getActiveVolume() {

        return activeVolume;

    }

    public void setActiveFrequency(int activeFrequency) {

        if (activeFrequency < firstStep) {
            return;
        }
        if (activeFrequency > numberOfFrequencies) {
            return;
        }
        this.activeFrequency = activeFrequency;
    }

    public void scrollingFrequencyUp() {
        if (activeFrequency > numberOfFrequencies) {
            activeFrequency = firstStep;
        } else {
            activeFrequency = activeFrequency + 1;
        }
    }

    public void scrollingFrequencyDown() {
        if (activeFrequency < firstStep) {
            activeFrequency = numberOfFrequencies;
        } else {
            activeFrequency = activeFrequency - 1;
        }
    }

    public void setActiveVolume() {
        if (activeVolume < firstStep) {
            return;
        }
        if (activeVolume > numberOfVolumeSteps) {
            return;
        }
        this.activeVolume = activeVolume;
    }

    public void scrollingActiveVolumeUp() {
        if (activeVolume < numberOfVolumeSteps) {
            activeVolume = activeVolume + 1;
        }
    }

    public void scrollingActiveVolumeDown() {
        if (activeVolume > firstStep) {
            activeVolume = activeVolume - 1;
        }
    }
}