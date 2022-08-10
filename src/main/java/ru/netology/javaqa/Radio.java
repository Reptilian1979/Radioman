package ru.netology.javaqa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int activeStation;
    private int activeVolume;
    private int numberOfVolumeSteps = 100;
    private int firstStep = 0;
    private int amountOfStations = 10;

    private int numberOfStations = amountOfStations - 1;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setActiveStation(int activeStation) {
        if (activeStation < firstStep) {
            return;
        }
        if (activeStation > numberOfStations) {
            return;
        }
        this.activeStation = activeStation;
    }

    public void nextStation() {
        if (activeStation >= numberOfStations) {
            setActiveStation(firstStep);
        } else {
            setActiveStation(activeStation + 1);
        }
    }

    public void previousStation() {
        if (activeStation <= firstStep) {
            setActiveStation(numberOfStations);
        } else {
            setActiveStation(activeStation - 1);
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
