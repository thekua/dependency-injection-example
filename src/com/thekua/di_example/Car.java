package com.thekua.di_example;

import com.thekua.di_example.config.Configuration;

import javax.inject.Inject;

public class Car {

    private Engine engine;
    private Configuration configuration;
    private SystemReport systemReport;

    public Car(Engine engine, Configuration configuration, SystemReport systemReport) {
        this.engine = engine;
        this.configuration = configuration;
        this.systemReport = systemReport;
    }

    public void drive() {
        engine.setAccelerationMode(configuration.getAccelerationMode());

        engine.start();
        engine.accelerate();

        systemReport.announce("Car is underway");
    }

    public void brake() {
        engine.deccelerate();
    }
}
