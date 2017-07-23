package com.dst.cloud.dstserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/dst/server")
public class DSTResource {

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
