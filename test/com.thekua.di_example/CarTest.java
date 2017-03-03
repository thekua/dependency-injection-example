package com.thekua.di_example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {

    @Test
    public void shouldAccelerateWhilstDriving() {
        // given
        FakeEngine engine = new FakeEngine();
        String accelerationMode = "ACCL_10";
        InMemoryConfiguration inMemoryConfiguration = new InMemoryConfiguration(accelerationMode);

        Car car = new Car(engine, inMemoryConfiguration, new InMemorySystemReport());

        // when
        car.drive();

        // then
        assertTrue(engine.hadAccelerated());
        assertEquals(accelerationMode, engine.getAccelerationMode());

    }
}
