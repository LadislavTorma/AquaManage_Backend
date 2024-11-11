package com.DragonFish.aquaManage.TankService.models;

public interface BasicTank {

    // Temperature methods
    double getTemperature();
    void setTemperature(double temperature);

    // pH level methods
    double getPH();
    void setPH(double pH);

    // Light level methods
    double getLight();
    void setLight(double light);

    // Nitrate level methods
    double getNitrate();
    void setNitrate(double nitrate);
}
