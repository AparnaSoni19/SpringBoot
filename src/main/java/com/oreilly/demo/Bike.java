package com.oreilly.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Bike implements Vehicle{
    @Override
    public int getWheels() {
        return 2;
    }
}
