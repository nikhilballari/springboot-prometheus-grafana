package com.dailypractise.monitoring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MonitoringController {

    @GetMapping("/something")
    public ResponseEntity<String> createLogs() {
        log.warn("just checking");
        return ResponseEntity.ok().body("All ok");
    }
}
