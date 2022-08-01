package ru.netology.javaqa;

public class Radio {
    private int activeStation;
    private int activeVolume;
    private final int numberOfVolumeSteps = 100;
    private int firstStep = 0;
    private int amountOfStations = 10;

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
    }

    public Radio() {
    }

    public int getActiveStation() {

        return activeStation;

    }

    public int getActiveVolume() {

        return activeVolume;

    }

    public void setActiveStation(int activeStation) {
        if (activeStation <= firstStep+1) {
            return;
        }
        if (activeStation > amountOfStations - 1) {
            return;
        }
        this.activeStation = activeStation;
    }

    public void nextStation() {
        if (activeStation >= amountOfStations - 1) {
            setActiveStation(firstStep);
        } else {
            setActiveStation(activeStation + 1);
        }
    }

    public void previousStation() {
        if (activeStation <= firstStep+1) {
            setActiveStation(amountOfStations-1);
        } else {
            setActiveStation(activeStation-1);
        }
    }

    public void setActiveVolume(int activeVolume) {
        if (activeVolume <= firstStep) {
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