package com.karaya.loggingframework.controller;

import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@Slf4j
@RestController
public class LoggingController {

//    private static final Logger log = LoggerFactory.getLogger(SLF4JDemo.class);  // Lombok Annotation @Slf4j

    private static final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    @GetMapping("/")
    public String testLogging() {
        // Logging Level: OFF > FATAL > ERROR > WARN > INFO > DEBUG > TRACE > ALL
        log.trace("Logging at TRACE Level");
        log.debug("Logging at DEBUG Level");
        log.info("Logging at INFO Level");
        log.warn("Logging at WARN Level");
        log.error("Logging at ERROR Level");

        // Parametrized messages with the {} syntax
        log.info("Found {} Results", list.size());
        log.info("System Preset Number List - {}", list);

        return "System Logged";
    }
}
