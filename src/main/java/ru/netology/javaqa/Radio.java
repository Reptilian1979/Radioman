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

    public void nextFrequency() {
        if (activeFrequency >= numberOfFrequencies) {
            setActiveFrequency(firstStep);
        } else {
            setActiveFrequency(activeFrequency = activeFrequency + 1);
        }
    }

    public void previousFrequency() {
        if (activeFrequency <= firstStep) {
            setActiveFrequency(numberOfFrequencies);
        } else {
            setActiveFrequency(activeFrequency = activeFrequency - 1);
        }
    }

    public void setActiveVolume(int activeVolume) {
        if (activeVolume < firstStep) {
            return;
        }
        if (activeVolume > numberOfVolumeSteps) {
            return;
        }
        this.activeVolume = activeVolume;
    }

    public void turningActiveVolumeUp() {
        if (activeVolume < numberOfVolumeSteps) {
            activeVolume++;
        }
    }

    public void downGradingActiveVolume() {
        if (activeVolume > firstStep) {
            activeVolume--;
        }
    }
}