package com.thekua.di_example;

import com.thekua.di_example.renewable.Battery;

public interface ChargingStation {
    void connect();

    void load(Battery battery);

    void disconnect();
}
