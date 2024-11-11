package com.DragonFish.aquaManage.TankService.models;

public class MarineTank implements BasicTank {
    private double temperature;
    private double pH;
    private double light;
    private double nitrate;
    private double salinity;    // Specific to marine tanks
    private double calcium;     // Specific to marine tanks
    private double alkalinity;  // Specific to marine tanks
    private double nitrite;     // Specific to marine tanks

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

    // Specific methods for MarineTank
    public double getSalinity() {
        return salinity;
    }

    public void setSalinity(double salinity) {
        this.salinity = salinity;
    }

    public double getCalcium() {
        return calcium;
    }

    public void setCalcium(double calcium) {
        this.calcium = calcium;
    }

    public double getAlkalinity() {
        return alkalinity;
    }

    public void setAlkalinity(double alkalinity) {
        this.alkalinity = alkalinity;
    }

    public double getNitrite() {
        return nitrite;
    }

    public void setNitrite(double nitrite) {
        this.nitrite = nitrite;
    }
}
