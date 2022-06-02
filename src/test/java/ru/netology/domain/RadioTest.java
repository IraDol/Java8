package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setQuantityStations() {
        Radio radio = new Radio();
        radio.setQuantityStations(9);
        int actual = radio.getQuantityStations();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void setCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        int actual = station.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void overCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void belowCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void maxCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void minCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio station = new Radio();
        station.setCurrentStation(8);
        station.nextStation();
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void nextStationNormal() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prevStation();
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void prevStationNormal() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.prevStation();
        int actual = station.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void increaseMaxVolume() {
        Radio volume = new Radio();
        volume.setVolume(100);
        volume.increaseVolume();
        int actual = volume.getVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void increaseMinVolume() {
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.increaseVolume();
        int actual = volume.getVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio volume = new Radio();
        volume.setVolume(99);
        volume.increaseVolume();
        int actual = volume.getVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void increaseOverVolume() {
        Radio volume = new Radio();
        volume.setVolume(101);
        volume.increaseVolume();
        int actual = volume.getVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void increaseBelowVolume() {
        Radio volume = new Radio();
        volume.setVolume(-1);
        volume.increaseVolume();
        int actual = volume.getVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        Radio volume = new Radio();
        volume.setVolume(99);
        volume.reduceVolume();
        int actual = volume.getVolume();
        int expected = 98;
        assertEquals(expected, actual);
    }

    @Test
    void reduceMaxVolume() {
        Radio volume = new Radio();
        volume.setVolume(100);
        volume.reduceVolume();
        int actual = volume.getVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    void reduceMinVolume() {
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.reduceVolume();
        int actual = volume.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void reduceOverVolume() {
        Radio volume = new Radio();
        volume.setVolume(101);
        volume.reduceVolume();
        int actual = volume.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void reduceBelowVolume() {
        Radio volume = new Radio();
        volume.setVolume(-1);
        volume.reduceVolume();
        int actual = volume.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}