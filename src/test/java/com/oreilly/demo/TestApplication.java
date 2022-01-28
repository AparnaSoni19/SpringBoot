package com.oreilly.demo;

import com.oreilly.demo.configurations.HardDiskConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
//@TestPropertySource(locations = "/MyConfiguration.properties")
public class TestApplication {
    @Autowired
    HardDiskConfig hardDiskConfig;

    @Test
    public void Test()
    {
        System.out.println("Value is "+hardDiskConfig.getBrand());
    }

}
