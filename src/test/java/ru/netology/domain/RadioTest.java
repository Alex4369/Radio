package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    Radio radio1 = new Radio();

    @Test
    public void radioStation(){
        assertEquals(10,radio1.getRadioStation());
    }

    @Test
    public void volume(){
        assertEquals(100,radio1.getVolume());
    }

    @Test
    public void currentRadioStation0(){
        radio1.setCurrentRadioStation(0);
        assertEquals(0,radio1.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStation1(){
        radio1.setCurrentRadioStation(1);
        assertEquals(1,radio1.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStation5(){
        radio1.setCurrentRadioStation(5);
        assertEquals(5,radio1.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStation8(){
        radio1.setCurrentRadioStation(8);
        assertEquals(8,radio1.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStation9(){
        radio1.setCurrentRadioStation(9);
        assertEquals(9,radio1.getCurrentRadioStation());
    }

    @Test
    public void radioStationMax0(){
        radio1.setCurrentRadioStation(0);
        assertEquals(1,radio1.getRadioStationMax());
    }

    @Test
    public void radioStationMax1(){
        radio1.setCurrentRadioStation(1);
        assertEquals(2,radio1.getRadioStationMax());
    }

    @Test
    public void radioStationMax5(){
        radio1.setCurrentRadioStation(5);
        assertEquals(6,radio1.getRadioStationMax());
    }

    @Test
    public void radioStationMax8(){
        radio1.setCurrentRadioStation(8);
        assertEquals(9,radio1.getRadioStationMax());
    }

    @Test
    public void radioStationMax9(){
        radio1.setCurrentRadioStation(9);
        assertEquals(0,radio1.getRadioStationMax());
    }

    @Test
    public void radioStationMin9(){
        radio1.setCurrentRadioStation(9);
        assertEquals(8,radio1.getRadioStationMin());
    }

    @Test
    public void radioStationMin8(){
        radio1.setCurrentRadioStation(8);
        assertEquals(7,radio1.getRadioStationMin());
    }

    @Test
    public void radioStationMin5(){
        radio1.setCurrentRadioStation(5);
        assertEquals(4,radio1.getRadioStationMin());
    }

    @Test
    public void radioStationMin1(){
        radio1.setCurrentRadioStation(1);
        assertEquals(0,radio1.getRadioStationMin());
    }

    @Test
    public void radioStationMin0(){
        radio1.setCurrentRadioStation(0);
        assertEquals(9,radio1.getRadioStationMin());
    }

    @Test
    public void currentVolume(){
        radio1.setCurrentVolume(-1);
        assertEquals(0,radio1.getCurrentVolume());
    }

    @Test
    public void currentVolume0(){
        radio1.setCurrentVolume(0);
        assertEquals(0,radio1.getCurrentVolume());
    }
    @Test
    public void currentVolume1(){
        radio1.setCurrentVolume(1);
        assertEquals(1,radio1.getCurrentVolume());
    }
    @Test
    public void currentVolume50(){
        radio1.setCurrentVolume(50);
        assertEquals(50,radio1.getCurrentVolume());
    }

    @Test
    public void currentVolume99(){
        radio1.setCurrentVolume(99);
        assertEquals(99,radio1.getCurrentVolume());
    }

    @Test
    public void currentVolume100(){
        radio1.setCurrentVolume(100);
        assertEquals(100,radio1.getCurrentVolume());
    }

    @Test
    public void increaseVolume0(){
        radio1.setCurrentVolume(0);
        assertEquals(1,radio1.getIncreaseVolume());
    }

    @Test
    public void increaseVolume1(){
        radio1.setCurrentVolume(1);
        assertEquals(2,radio1.getIncreaseVolume());
    }

    @Test
    public void increaseVolume50(){
        radio1.setCurrentVolume(50);
        assertEquals(51,radio1.getIncreaseVolume());
    }

    @Test
    public void increaseVolume99(){
        radio1.setCurrentVolume(99);
        assertEquals(100,radio1.getIncreaseVolume());
    }

    @Test
    public void increaseVolume100(){
        radio1.setCurrentVolume(100);
        assertEquals(100,radio1.getIncreaseVolume());
    }

    @Test
    public void reduceVolume100(){
        radio1.setCurrentVolume(100);
        assertEquals(99,radio1.getReduceVolume());
    }

    @Test
    public void reduceVolume99(){
        radio1.setCurrentVolume(99);
        assertEquals(98,radio1.getReduceVolume());
    }

    @Test
    public void reduceVolume50(){
        radio1.setCurrentVolume(50);
        assertEquals(49,radio1.getReduceVolume());
    }

    @Test
    public void reduceVolume1(){
        radio1.setCurrentVolume(1);
        assertEquals(0,radio1.getReduceVolume());
    }

    @Test
    public void reduceVolume0(){
        radio1.setCurrentVolume(0);
        assertEquals(0,radio1.getReduceVolume());
    }

    @Test
    public void turningOn9Waves() {
        Radio radio = new Radio(10,101,9,9,0,50,100,0);
        assertEquals(9,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn8Waves() {
        Radio radio = new Radio(10,101,8,9,0,50,100,0);
        assertEquals(8,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn5Waves() {
        Radio radio = new Radio(10,101,5,9,0,50,100,0);
        assertEquals(5,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn0Waves() {
        Radio radio = new Radio(10,101,0,9,0,50,100,0);
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn1Waves() {
        Radio radio = new Radio(10,101,1,9,0,50,100,0);
        assertEquals(1,radio.getCurrentRadioStation());
    }

    @Test
    public void turningOn10Waves() {
        Radio radio = new Radio(10,101,10,9,0,50,100,0);
        assertEquals(0,radio.getCurrentRadioStation());
    }
    @Test
    public void turningOn11Waves() {
        Radio radio = new Radio(10,101,-1,9,0,50,100,0);
        assertEquals(9,radio.getCurrentRadioStation());
    }
    @Test

    public void switchingTheRadioStationUp9() {
        Radio radio = new Radio(10,101,9,9,0,50,100,0);
        assertEquals(0,radio.getRadioStationMax());
    }

    @Test

    public void switchingTheRadioStationUp8() {
        Radio radio = new Radio(10,101,8,9,0,50,100,0);
        assertEquals(9,radio.getRadioStationMax());
    }

    @Test

    public void switchingTheRadioStationUp5() {
        Radio radio = new Radio(10,101,5,9,0,50,100,0);
        assertEquals(6,radio.getRadioStationMax());
    }

    @Test

    public void switchingTheRadioStationUp0() {
        Radio radio = new Radio(10,101,0,9,0,50,100,0);
        assertEquals(1,radio.getRadioStationMax());
    }

    @Test

    public void switchingTheRadioStationDown9() {
        Radio radio = new Radio(10,101,9,9,0,50,100,0);
        assertEquals(8, radio.getRadioStationMin());
    }

    @Test

    public void switchingTheRadioStationDown8() {
        Radio radio = new Radio(10,101,8,9,0,50,100,0);
        assertEquals(7,radio.getRadioStationMin());
    }

    @Test

    public void switchingTheRadioStationDown5() {
        Radio radio = new Radio(10,101,5,9,0,50,100,0);
        assertEquals(4,radio.getRadioStationMin());
    }

    @Test

    public void switchingTheRadioStationDown1() {
        Radio radio = new Radio(10,101,1,9,0,50,100,0);
        assertEquals(0,radio.getRadioStationMin());
    }

    @Test

    public void switchingTheRadioStationDown0() {
        Radio radio = new Radio(10,101,0,9,0,50,100,0);
        assertEquals(9, radio.getRadioStationMin());
    }

    @Test

    public void volume100() {
        Radio radio = new Radio(10,100,5,9,0,100,100,0);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test

    public void volume99() {
        Radio radio = new Radio(10,101,5,9,0,99,100,0);
        assertEquals(99,radio.getCurrentVolume());
    }

    @Test

    public void volume50() {
        Radio radio = new Radio(10,101,5,9,0,50,100,0);
        assertEquals(50,radio.getCurrentVolume());
    }

    @Test

    public void volume1() {
        Radio radio = new Radio(10,101,5,9,0,1,100,0);
        assertEquals(1,radio.getCurrentVolume());
    }

    @Test

    public void volume0() {
        Radio radio = new Radio(10,101,5,9,0,0,100,0);
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test

    public void volume101() {
        Radio radio = new Radio(10,101,5,9,0,101,100,0);
        assertEquals(100,radio.getCurrentVolume());
    }

    @Test

    public void addSound0() {
        Radio radio = new Radio(10,101,5,9,0,0,100,0);
        assertEquals(1, radio.getIncreaseVolume());
    }

    @Test

    public void addSound1() {
        Radio radio = new Radio(10,101,5,9,0,1,100,0);
        assertEquals(2,radio.getIncreaseVolume());
    }

    @Test

    public void addSound5() {
        Radio radio = new Radio(10,101,5,9,0,50,100,0);
        assertEquals(51,radio.getIncreaseVolume());
    }

    @Test

    public void addSound9() {
        Radio radio = new Radio(10,101,5,9,0,99,100,0);
        assertEquals(100,radio.getIncreaseVolume());
    }

    @Test

    public void addSound100() {
        Radio radio = new Radio(10,101,5,9,0,100,100,0);
        assertEquals(100,radio.getIncreaseVolume());
    }

    @Test

    public void decreaseSound100() {
        Radio radio = new Radio(10,101,5,9,0,100,100,0);
        assertEquals(99,radio.getReduceVolume());
    }

    @Test

    public void decreaseSound99() {
        Radio radio = new Radio(10,101,5,9,0,99,100,0);
        assertEquals(98,radio.getReduceVolume());
    }

    @Test

    public void decreaseSound50() {
        Radio radio = new Radio(10,101,5,9,0,50,100,0);
        assertEquals(49,radio.getReduceVolume());
    }

    @Test

    public void decreaseSound1() {
        Radio radio = new Radio(10,101,5,9,0,1,100,0);
        assertEquals(0,radio.getReduceVolume());
    }

    @Test

    public void decreaseSound0() {
        Radio radio = new Radio(10,101,5,9,0,0,100,0);
        assertEquals(0,radio.getReduceVolume());
    }
}