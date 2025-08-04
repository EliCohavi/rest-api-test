package com.example.restapitest;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Greetings, " + name + "!";
    }

    @GetMapping("/greet/{name}/{city}")
    public String greet(@PathVariable String name, @PathVariable String city) {
        return "Greetings, " + name + " from " + city + "!";

    }

    @GetMapping("/greetByQuery")
    public String greetByQuery(@RequestParam String name, @RequestParam String city) {
        return "Greetings, " + name + " from " + city + "!";
    }

    /*@PostMapping("/greet")
    public String greetPost(@RequestBody GreetingRequest request) {
        return "Greetings, " + request.getName() + " from " + request.getCity() + "!";
    }*/

    // POST endpoint at /greet accepting JSON body mapped to GreetingRequest
    @PostMapping("/greet")
    public GreetingResponse greet(@RequestBody GreetingRequest request) {
        String msg = "Greetings, " + request.getName() + " from " + request.getCity() + "!";
        return new GreetingResponse(msg);
    }

    @PutMapping("/greet")
    public GreetingResponse updateGreeting(@RequestBody GreetingRequest request) {
        return new GreetingResponse(
                "Updated greeting for "
                        + request.getName()
                        + " in "
                        + request.getCity());
    }

    @DeleteMapping("/greet/{name}")
    public String deleteGreeting(@PathVariable String name) {
        return "Deleted greeting for " + name;
    }
}
