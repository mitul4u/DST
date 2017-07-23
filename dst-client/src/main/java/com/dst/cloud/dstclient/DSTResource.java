package com.dst.cloud.dstclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/dst/client")
public class DSTResource {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping
    public String dst(){
        String url = "http://dst-server/rest/dst/server";
        return restTemplate.getForObject(url, String.class);
    }

    public String fallback(){
        return "Fall back Hello World";
    }
}
