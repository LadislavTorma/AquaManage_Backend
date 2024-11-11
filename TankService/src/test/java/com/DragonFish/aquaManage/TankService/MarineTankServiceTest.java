package com.DragonFish.aquaManage.TankService;

import com.DragonFish.aquaManage.TankService.models.MarineTank;
import com.DragonFish.aquaManage.TankService.services.MarineTankService;
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
        assertEquals(35.0, marineTankService.getSalinityLevel());
    }

    @Test
    public void testCalciumLevel() {
        marineTankService.setCalciumLevel(450.0);
        assertEquals(450.0, marineTankService.getCalciumLevel());
    }

    @Test
    public void testAlkalinityLevel() {
        marineTankService.setAlkalinityLevel(8.0);
        assertEquals(8.0, marineTankService.getAlkalinityLevel());
    }

    @Test
    public void testNitriteLevel() {
        marineTankService.setNitriteLevel(0.5);
        assertEquals(0.5, marineTankService.getNitriteLevel());
    }

    @Test
    public void testBasicParameters() {
        marineTankService.getTank().setTemperature(24.0);
        assertEquals(24.0, marineTankService.getTank().getTemperature());

        marineTankService.getTank().setPH(8.1);
        assertEquals(8.1, marineTankService.getTank().getPH());

        marineTankService.getTank().setLight(120.0);
        assertEquals(120.0, marineTankService.getTank().getLight());

        marineTankService.getTank().setNitrate(15.0);
        assertEquals(15.0, marineTankService.getTank().getNitrate());
    }
}