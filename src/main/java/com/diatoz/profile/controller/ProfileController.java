package com.diatoz.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Value("${spring.application.name}")
    private String appName;
    @Value("${my.message}")
    String message;

    @GetMapping("/check")
    public ResponseEntity<String> checkProfile()
    {
        return ResponseEntity.ok(message+" " + appName);
    }
}
