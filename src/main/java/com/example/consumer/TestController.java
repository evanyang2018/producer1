package com.example.consumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController  {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getTest")
    public String getTest(){
        String getResult  = restTemplate.getForObject("http://PRODUCER1/getService",String.class);
        return getResult;
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
