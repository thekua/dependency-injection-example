package com.thekua.di_example;

import com.thekua.di_example.config.Configuration;

public class InMemoryConfiguration implements Configuration {
    private final String accelerationMode;

    public InMemoryConfiguration(String accelerationMode) {

        this.accelerationMode = accelerationMode;
    }

    @Override
    public String getAccelerationMode() {
        return accelerationMode;
    }
}
