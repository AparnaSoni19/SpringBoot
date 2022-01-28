package com.oreilly.demo.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "harddisk.config")
public class HardDiskConfig {
    //@Value("${harddisk.config.size}")
    private String size;
    //@Value("${harddisk.config.brand}")
    private String brand;
    //@Value("${harddisk.config.price}")
    private String price;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }




}
