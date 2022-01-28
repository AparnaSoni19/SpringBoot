package com.oreilly.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class VehicleService {
    @Autowired
    @Qualifier("car")
    Vehicle vehicle;

    @PostConstruct
    public void service()
    {
        System.out.println("Wheels for vechile :"+ vehicle.getWheels());
    }
}
