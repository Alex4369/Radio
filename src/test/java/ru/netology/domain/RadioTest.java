package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
  
    @Test
    public void turningOn9Waves() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        assertEquals(9,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn8Waves() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(8);
        assertEquals(8,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn5Waves() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(5);
        assertEquals(5,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn0Waves() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn1Waves() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(1);
        assertEquals(1,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn10Waves() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(10);
        assertEquals(0,radio.getCurrentRadioStation());
    }
    @Test
    public void turningOn11Waves() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(11);
        assertEquals(0,radio.getCurrentRadioStation());
    }
    @Test

    public void switchingTheRadioStationUp9() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        assertEquals(0,radio.getRadioStationMax());
    }

    @Test

    public void switchingTheRadioStationUp8() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(8);
        assertEquals(9,radio.getRadioStationMax());
    }

    @Test

    public void switchingTheRadioStationUp5() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(5);
        assertEquals(6,radio.getRadioStationMax());
    }

    @Test

    public void switchingTheRadioStationUp0() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        assertEquals(1,radio.getRadioStationMax());
    }

    @Test

    public void switchingTheRadioStationDown9() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        assertEquals(8, radio.getRadioStationMin());
    }

    @Test

    public void switchingTheRadioStationDown8() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(8);
        assertEquals(7,radio.getRadioStationMin());
    }

    @Test

    public void switchingTheRadioStationDown5() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(5);
        assertEquals(4,radio.getRadioStationMin());
    }

    @Test

    public void switchingTheRadioStationDown1() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(1);
        assertEquals(0,radio.getRadioStationMin());
    }

    @Test

    public void switchingTheRadioStationDown0() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        assertEquals(9, radio.getRadioStationMin());
    }

    @Test

    public void volume100() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test

    public void volume99() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(99);
        assertEquals(99,radio.getCurrentVolume());
    }

    @Test

    public void volume50() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(50);
        assertEquals(50,radio.getCurrentVolume());
    }

    @Test

    public void volume1() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(1);
        assertEquals(1,radio.getCurrentVolume());
    }

    @Test

    public void volume0() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test

    public void volume101() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(101);
        assertEquals(100,radio.getCurrentVolume());
    }

    @Test

    public void addSound0() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        assertEquals(1, radio.getIncreaseVolume());
    }

    @Test

    public void addSound1() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(1);
        assertEquals(2,radio.getIncreaseVolume());
    }

    @Test

    public void addSound50() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(50);
        assertEquals(51,radio.getIncreaseVolume());
    }

    @Test

    public void addSound99() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(99);
        assertEquals(100,radio.getIncreaseVolume());
    }

    @Test

    public void addSound100() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        assertEquals(100,radio.getIncreaseVolume());
    }

    @Test

    public void decreaseSound100() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        assertEquals(99,radio.getReduceVolume());
    }

    @Test

    public void decreaseSound99() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(99);
        assertEquals(98,radio.getReduceVolume());
    }

    @Test

    public void decreaseSound50() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(50);
        assertEquals(49,radio.getReduceVolume());
    }

    @Test

    public void decreaseSound1() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(1);
        assertEquals(0,radio.getReduceVolume());
    }

    @Test

    public void decreaseSound0() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        assertEquals(0,radio.getReduceVolume());
    }
}