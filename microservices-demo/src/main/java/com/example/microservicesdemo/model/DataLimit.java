package com.example.microservicesdemo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limit-services")
@Component
public class DataLimit {
    private int minimum, maximum;

    public DataLimit() {
        System.out.println("Configuration.Configuration()");
    }

    public DataLimit(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
