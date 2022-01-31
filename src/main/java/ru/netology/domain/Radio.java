package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }

        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }

        if (currentRadioStation > 0) {

        }

        this.currentRadioStation = currentRadioStation;


        return currentRadioStation;
    }

    public int getCurrentRadioStation()
    {
        return currentRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 10) {

        } else {
            currentVolume = 10;

        }
        if (currentVolume > 0) {
        } else {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume()
    {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void radioStationMax() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }

    }

    public void radioStationMin() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }

    }

}



