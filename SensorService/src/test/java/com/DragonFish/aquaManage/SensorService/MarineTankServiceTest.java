package com.DragonFish.aquaManage.SensorService;

import com.DragonFish.aquaManage.SensorService.Service.MarineTankService;
import com.DragonFish.aquaManage.TankService.models.MarineTank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarineTankServiceTest {
    private MarineTankService marineTankService;

    @BeforeEach
    public void setUp() {
        MarineTank tank = new MarineTank();
        marineTankService = new MarineTankService(tank);
    }

    @Test
    public void testSalinityLevel() {
        marineTankService.setSalinityLevel(35.0);
        Assertions.assertEquals(35.0, marineTankService.getSalinityLevel());
    }

    @Test
    public void testCalciumLevel() {
        marineTankService.setCalciumLevel(450.0);
        Assertions.assertEquals(450.0, marineTankService.getCalciumLevel());
    }

    @Test
    public void testAlkalinityLevel() {
        marineTankService.setAlkalinityLevel(8.0);
        Assertions.assertEquals(8.0, marineTankService.getAlkalinityLevel());
    }

    @Test
    public void testNitriteLevel() {
        marineTankService.setNitriteLevel(0.5);
        Assertions.assertEquals(0.5, marineTankService.getNitriteLevel());
    }

    @Test
    public void testBasicParameters() {
        marineTankService.getTank().setTemperature(24.0);
        Assertions.assertEquals(24.0, marineTankService.getTank().getTemperature());

        marineTankService.getTank().setPH(8.1);
        Assertions.assertEquals(8.1, marineTankService.getTank().getPH());

        marineTankService.getTank().setLight(120.0);
        Assertions.assertEquals(120.0, marineTankService.getTank().getLight());

        marineTankService.getTank().setNitrate(15.0);
        Assertions.assertEquals(15.0, marineTankService.getTank().getNitrate());
    }
}