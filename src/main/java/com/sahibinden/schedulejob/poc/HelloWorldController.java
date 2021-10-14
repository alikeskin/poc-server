package com.sahibinden.schedulejob.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello Spring Boot - new deployment using Openshift Pipeline";
    }
    @RequestMapping("/")
    public String sayHelloWithoutPath() {
        return "Hello Spring Boot - new deployment using Openshift Pipeline Without PATH";
    }
}
