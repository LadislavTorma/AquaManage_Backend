package com.DragonFish.aquaManage.SensorService.Service;

import com.DragonFish.aquaManage.TankService.models.MarineTank;

public class MarineTankService {
    private MarineTank tank;

    // Constructor to initialize the MarineTank instance
    public MarineTankService(MarineTank tank) {
        this.tank = tank;
    }

    // Getter for the MarineTank instance
    public MarineTank getTank() {
        return tank;
    }

    // Basic parameter management methods
    public double getTemperature() {
        return tank.getTemperature();
    }

    public void setTemperature(double temperature) {
        tank.setTemperature(temperature);
    }

    public double getPH() {
        return tank.getPH();
    }

    public void setPH(double pH) {
        tank.setPH(pH);
    }

    public double getLight() {
        return tank.getLight();
    }

    public void setLight(double light) {
        tank.setLight(light);
    }

    public double getNitrate() {
        return tank.getNitrate();
    }

    public void setNitrate(double nitrate) {
        tank.setNitrate(nitrate);
    }

    // Salinity management methods
    public double getSalinityLevel() {
        return tank.getSalinity();
    }

    public void setSalinityLevel(double salinity) {
        tank.setSalinity(salinity);
    }

    // Calcium management methods
    public double getCalciumLevel() {
        return tank.getCalcium();
    }

    public void setCalciumLevel(double calcium) {
        tank.setCalcium(calcium);
    }

    // Alkalinity management methods
    public double getAlkalinityLevel() {
        return tank.getAlkalinity();
    }

    public void setAlkalinityLevel(double alkalinity) {
        tank.setAlkalinity(alkalinity);
    }

    // Nitrite management methods
    public double getNitriteLevel() {
        return tank.getNitrite();
    }

    public void setNitriteLevel(double nitrite) {
        tank.setNitrite(nitrite);
    }
}
