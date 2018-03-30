package com.dckr.projects.sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello fellas from GrepOra!");
    }
}
