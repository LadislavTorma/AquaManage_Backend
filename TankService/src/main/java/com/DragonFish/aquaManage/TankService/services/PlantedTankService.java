package com.DragonFish.aquaManage.TankService.services;

import com.DragonFish.aquaManage.TankService.models.PlantedTank;

public class PlantedTankService {
    private PlantedTank tank;

    // Constructor to initialize the PlantedTank instance
    public PlantedTankService(PlantedTank tank) {
        this.tank = tank;
    }

    // Getter for the PlantedTank instance
    public PlantedTank getTank() {
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

    // CO2 sensor management methods
    public double getCO2Level() {
        return tank.getCO2();
    }

    public void setCO2Level(double co2) {
        tank.setCO2(co2);
    }
}
