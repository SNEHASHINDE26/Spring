package org.jspiders.securityapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String getMessage(){
        return "<h1>Welcome to App</h1>";
    }
     @GetMapping("/admin")
    public String getInfo(){
        return "<h1>Welcome in admin app</h1>";
    }
    @GetMapping("/employee")
    public String getData(){
        return "<h1>Welcome in employee app</h1>";
    }

}
