package co.la.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("/info")
    public String getInfo() {
        return "Hello from Service user";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Service user is running";
    }
}
