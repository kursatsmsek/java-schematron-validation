package org.devkursat.javaschematronvalidation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @PostMapping("/validate")
    public ResponseEntity validate() {
        return ResponseEntity.ok().build();
    }
}
