package ru.netology.radiowave;

public class Radio {

    private int currentStation;
    private short currentVolume;
    private int maxStationsCount;

    public Radio() {
        maxStationsCount = 10;
    }

    public Radio(int maxStationsCount) {
        this.maxStationsCount = maxStationsCount;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < maxStationsCount) {
            this.currentStation = currentStation;
        }
    }

    public void setNextStation() {
        if (currentStation == maxStationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = maxStationsCount - 1;
        } else {
            currentStation--;
        }
    }

    public short getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(short currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}