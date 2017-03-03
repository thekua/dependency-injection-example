package com.thekua.di_example;

public class FakeEngine implements Engine {
    private boolean hadAccelerated;
    private String accelerationMode;

    @Override
    public void start() {

    }

    @Override
    public void accelerate() {
        hadAccelerated = true;
    }

    @Override
    public void deccelerate() {

    }

    @Override
    public void setAccelerationMode(String accelerationMode) {

        this.accelerationMode = accelerationMode;
    }

    public boolean hadAccelerated() {
        return hadAccelerated;
    }

    public String getAccelerationMode() {
        return accelerationMode;
    }
}
