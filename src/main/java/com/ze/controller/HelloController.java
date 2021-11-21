package com.ze.controller;

import com.ze.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author ze
 * @create 2021-11-02-10:06
 */

@RestController
public class HelloController {

    @Autowired
    HelloService service;


   @GetMapping("/hello")
   public String hello() throws InterruptedException {
        service.helloAsync();

       return "hello"+new Date();
   }


}
