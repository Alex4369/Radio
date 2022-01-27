package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void turningOn9Waves() {
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void turningOn8Waves() {
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void turningOn5Waves() {
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void turningOn0Waves() {
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void turningOn1Waves() {
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void turningOn10Waves() {
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationUp9() {
        radio.setCurrentRadioStation(9);
        radio.radioStationMax();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationUp8() {
        radio.setCurrentRadioStation(8);
        radio.radioStationMax();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationUp5() {
        radio.setCurrentRadioStation(5);
        radio.radioStationMax();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationUp0() {
        radio.setCurrentRadioStation(0);
        radio.radioStationMax();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationDown9() {
        radio.setCurrentRadioStation(9);
        radio.radioStationMin();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationDown8() {
        radio.setCurrentRadioStation(8);
        radio.radioStationMin();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationDown5() {
        radio.setCurrentRadioStation(5);
        radio.radioStationMin();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationDown1() {
        radio.setCurrentRadioStation(1);
        radio.radioStationMin();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void switchingTheRadioStationDown0() {
        radio.setCurrentRadioStation(0);
        radio.radioStationMin();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void volume10() {
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void volume9() {
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void volume5() {
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void volume1() {
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void volume0() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void volume11() {
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void addSound0() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void addSound1() {
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void addSound5() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void addSound9() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void addSound10() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void decreaseSound10() {
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void decreaseSound9() {
        radio.setCurrentVolume(9);
        radio.reduceVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void decreaseSound5() {
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void decreaseSound1() {
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    public void decreaseSound0() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}