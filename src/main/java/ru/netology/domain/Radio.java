package ru.netology.domain;

public class Radio {
    public Radio(int radioStation) {
        this.radioStation = radioStation;
    }

    private int radioStation ;
    private int volume ;
    private int currentRadioStation ;
    private int radioStationMax ;
    private int radioStationMin ;
    private int currentVolume ;
    private int increaseVolume ;
    private int reduceVolume ;



    public Radio() {
    }

    public int getCurrentRadioStation() {

        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }

        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
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


    public int getRadioStation() {
        return radioStation;
    }


    public int getVolume() {
        return volume;
    }


    public int getRadioStationMax() {
        if (currentRadioStation < 9) {
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
            currentRadioStation = 9;
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



