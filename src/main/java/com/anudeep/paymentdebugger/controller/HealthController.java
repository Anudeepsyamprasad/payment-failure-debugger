package com.anudeep.paymentdebugger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Payment Failure Debugger API Running";
    }

    @GetMapping("/health")
    public String health() {
        return "Service is healthy";
    }
}