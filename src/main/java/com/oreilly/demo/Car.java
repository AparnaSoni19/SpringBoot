package com.oreilly.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Car implements Vehicle{
    @Override
    public int getWheels() {
        return 4;
    }
}
