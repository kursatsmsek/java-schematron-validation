package org.devkursat.javaschematronvalidation.controller;

import org.devkursat.javaschematronvalidation.service.ValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    private final ValidationService validationService;

    public ValidationController(ValidationService validationService) {
        this.validationService = validationService;
    }

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/validate")
    public ResponseEntity<?> validate() throws Exception {
        validationService.validateXmlWithXslt("src/main/resources/input.xml",
                "src/main/resources/schematron.xslt");
        return ResponseEntity.ok().build();
    }
}
