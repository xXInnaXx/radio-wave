package ru.netology.radiowave;

public class Radio {

    private int currentStation;
    private short currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation <= 9) {
            this.currentStation = currentStation;
        }
    }

    public void setNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public short getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(short currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 10) {
            this.currentVolume = currentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}