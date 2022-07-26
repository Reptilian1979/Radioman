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

    public void scrollingFrequencyUpInLimits() {
        if (activeFrequency < numberOfFrequencies) {
        }
        activeFrequency++;

    }
    public void scrollingFrequencyLineOverUpperLimit() {
        if (activeFrequency >= numberOfFrequencies) {
        }
        activeFrequency = firstStep;
    }

    public void scrollingFrequencyDownInLimits() {
        if (activeFrequency > firstStep) {
        }
        activeFrequency--;
    }

    public void scrollingFrequencyDownAtLowerLimit() {
        if (activeFrequency <= firstStep) {
        }
        activeFrequency = numberOfFrequencies;
    }

    public void setActiveVolume(int activeVolume) {

        if (activeVolume > numberOfVolumeSteps) {
            return;
        }
        if (activeVolume < firstStep) {
            return;
        }
        this.activeVolume = activeVolume;
    }

    public void scrollingVolumeUpInLimits() {
        if (activeVolume < numberOfVolumeSteps) {
        }
        activeVolume++;

    }
    public void scrollingVolumeLineOverUpperLimit() {
        if (activeVolume >= numberOfVolumeSteps) {
        }
        activeVolume = numberOfVolumeSteps;
    }

    public void scrollingVolumeDownInLimits() {
        if (activeVolume > firstStep) {
        }
        activeVolume--;
    }

    public void scrollingVolumeDownAtLowerLimit() {
        if (activeVolume <= firstStep) {
        }
        activeVolume = firstStep;
    }
}
