package com.samplemodule.controller;

import com.samplemodule.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sample")
public class SampleController {
    private final SampleService sampleService;

    @GetMapping
    public String getGreeting() {
        return sampleService.getGreeting();
    }
}
