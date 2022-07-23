package com.holgermueller.restapi.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
    @GetMapping("/api/quotes")
    public String quotes() {
        return "Quote here!";
    }
}
