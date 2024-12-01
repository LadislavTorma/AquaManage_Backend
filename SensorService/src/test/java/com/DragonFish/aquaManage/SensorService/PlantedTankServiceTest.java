package com.DragonFish.aquaManage.SensorService;

import com.DragonFish.aquaManage.SensorService.Service.PlantedTankService;
import com.DragonFish.aquaManage.TankService.models.PlantedTank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantedTankServiceTest {
    private PlantedTankService plantedTankService;

    @BeforeEach
    public void setUp() {
        PlantedTank tank = new PlantedTank();
        plantedTankService = new PlantedTankService(tank);
    }

    @Test
    public void testCO2Level() {
        plantedTankService.setCO2Level(20.5);
        assertEquals(20.5, plantedTankService.getCO2Level());
    }

    @Test
    public void testBasicParameters() {
        plantedTankService.getTank().setTemperature(25.0);
        assertEquals(25.0, plantedTankService.getTank().getTemperature());

        plantedTankService.getTank().setPH(7.2);
        assertEquals(7.2, plantedTankService.getTank().getPH());

        plantedTankService.getTank().setLight(100.0);
        assertEquals(100.0, plantedTankService.getTank().getLight());

        plantedTankService.getTank().setNitrate(10.0);
        assertEquals(10.0, plantedTankService.getTank().getNitrate());
    }
}

