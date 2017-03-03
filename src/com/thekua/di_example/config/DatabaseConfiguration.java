package com.thekua.di_example.config;

public class DatabaseConfiguration implements Configuration {
    public DatabaseConfiguration(String dbConnectionString, String dbUsername, String dbPassword) {

    }

    @Override
    public String getAccelerationMode() {
        return null;
    }
}
