package ru.netology.domain;

public class Radio {
    private int radioStation = 10;
    private int volume = 100;
    private int currentRadioStation = 5;
    private int radioStationMax = 9;
    private int radioStationMin = 0;
    private int currentVolume = 50;
    private int increaseVolume = 100;
    private int reduceVolume = 0;

    public Radio(int radioStation, int volume, int currentRadioStation, int radioStationMax, int radioStationMin, int currentVolume, int increaseVolume, int reduceVolume) {
        this.radioStation = radioStation;
        this.volume = volume;
        this.currentRadioStation = currentRadioStation;
        this.radioStationMax = radioStationMax;
        this.radioStationMin = radioStationMin;
        this.currentVolume = currentVolume;
        this.increaseVolume = increaseVolume;
        this.reduceVolume = reduceVolume;
    }

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

   // public void setRadioStation(int a) {
     //   radioStation = a;
   // }

    public int getVolume() {
        return volume;
    }

  //  public void setVolume(int a) {
   //     volume = a;
  //  }

    public int getRadioStationMax() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }

   // public void setRadioStationMax(int a) {
      //  radioStationMax = a;
   // }

    public int getRadioStationMin() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }

   // public void setRadioStationMin(int a) {
       // radioStationMin = a;
   // }

    public int getIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

   // public void setIncreaseVolume(int a) {
       // increaseVolume = a;
   // }

    public int getReduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

   // public void setReduceVolume(int a) {
       // reduceVolume = a;
  //  }
}



