package com.oreilly.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


@Configuration
@EnableScheduling
public class AppConfig {

    private  static final Logger log = LoggerFactory.getLogger(AppConfig.class);

    @Scheduled(fixedDelay = 1 *60 *1000)
    public void doSomethingPeriodically()
    {
        log.info("Task Executed at"+new Date());
    }

}
