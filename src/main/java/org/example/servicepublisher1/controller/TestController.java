package org.example.servicepublisher1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @PostMapping
    public void test(@RequestBody String request){
        System.out.println("Receive request from service-client: " + request);
    }
}
