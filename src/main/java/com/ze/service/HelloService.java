package com.ze.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

/**
 * @author ze
 * @create 2021-11-02-10:13
 */

@Service
public class HelloService {

    @Async
    public void helloAsync(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据正在处理");


    }


}
