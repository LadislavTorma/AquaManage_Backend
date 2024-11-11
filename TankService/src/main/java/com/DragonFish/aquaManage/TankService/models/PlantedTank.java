package com.DragonFish.aquaManage.TankService.models;

public class PlantedTank implements BasicTank {
    private double temperature;
    private double pH;
    private double light;
    private double nitrate;
    private double co2;  // Specific to planted tanks

    // Implement BasicTank interface methods
    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getPH() {
        return pH;
    }

    @Override
    public void setPH(double pH) {
        this.pH = pH;
    }

    @Override
    public double getLight() {
        return light;
    }

    @Override
    public void setLight(double light) {
        this.light = light;
    }

    @Override
    public double getNitrate() {
        return nitrate;
    }

    @Override
    public void setNitrate(double nitrate) {
        this.nitrate = nitrate;
    }

    // Specific methods for PlantedTank
    public double getCO2() {
        return co2;
    }

    public void setCO2(double co2) {
        this.co2 = co2;
    }
}
