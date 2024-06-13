package ru.resource.server.avito;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/red")
    public String redirect(){
        String body = "<H1> Hello from Resource Server</H1>";
        return body;
    }
}