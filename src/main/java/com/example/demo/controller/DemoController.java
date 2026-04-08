package com.example.demo.controller;

import com.example.demo.dto.Greeting;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DemoController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hello, %s!", name));
    }

    @GetMapping("/QA1")
    public String QA1() {
        return "QA1-new";
    }

    @GetMapping("/QA1")
    public String QA1() {
        return "QA1";
    }
}
