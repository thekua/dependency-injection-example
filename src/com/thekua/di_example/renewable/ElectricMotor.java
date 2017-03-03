package com.thekua.di_example.renewable;


import com.thekua.di_example.ChargingStation;
import com.thekua.di_example.Engine;

public class ElectricMotor implements Engine {
    private Battery battery = new Battery();

    @Override
    public void start() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accelerate() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deccelerate() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setAccelerationMode(String accelerationMode) {

    }

    public void recharge(ChargingStation station) {
        station.connect();
        station.load(battery);
        station.disconnect();
    }
}
