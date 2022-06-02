package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int quantityStations = 10;
    private int maxStation = quantityStations;
    private int minStation = 0;
    private int volume;

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations;
    }

    public Radio() {
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > quantityStations) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getQuantityStations() {
        return quantityStations;
    }

    public void setQuantityStations(int quantityStations) {
        this.quantityStations = quantityStations;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void nextStation() {
        if (currentStation < quantityStations) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = quantityStations;
        }
    }


    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void reduceVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
