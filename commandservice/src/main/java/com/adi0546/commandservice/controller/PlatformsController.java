package com.adi0546.commandservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c/platforms")
public class PlatformsController {
    public PlatformsController(){

    }

    @PostMapping()
    public ResponseEntity<String> TestInboundConnection(){
        System.out.println("--> Inbound POST $ Command Service");

        return ResponseEntity.ok("Inbound test of Platforms Controller");
    }
}
