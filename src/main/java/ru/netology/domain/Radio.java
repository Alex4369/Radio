package ru.netology.domain;

public class Radio {
    public Radio(int radioStation) {
        this.radioStation = radioStation;
    }

    private int radioStation = 20;
    private int volume;
    private int currentRadioStation;
    private int radioStationMax;
    private int radioStationMin;
    private int currentVolume;
    private int increaseVolume;
    private int reduceVolume;


    public Radio() {
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        this.radioStation = radioStation;
    }

    public int getCurrentRadioStation() {

        if (currentRadioStation > 19) {
            currentRadioStation = 0;
        }

        if (currentRadioStation < 0) {
            currentRadioStation = 19;
        }
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > radioStation - 1) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {

        if (currentVolume < 100) {

        } else {
            currentVolume = 100;

        }
        if (currentVolume > 0) {
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;

    }

    public int getVolume() {
        return volume;
    }

    public int getRadioStation() {
        return radioStation;
    }


    public int getRadioStationMax() {
        if (currentRadioStation < radioStation - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }


    public int getRadioStationMin() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = radioStation;
        }
        return currentRadioStation;
    }


    public int getIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }


    public int getReduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

}



