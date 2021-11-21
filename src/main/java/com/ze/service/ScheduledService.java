package com.ze.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author ze
 * @create 2021-11-02-14:34
 */
//在特定的时间执行这个方法 timer
@Service
public class ScheduledService {

      int i =1;




   //cron 这个是表达式 计划任务，是任务在约定的时间执行已经计划好的工作，这是表面的意思。在Linux中，我们经常用到 cron 服务器来完成这
    // 秒 分 时 天 月 周
   @Scheduled(cron = "0/2 * * * * ?")//定时任务 每隔2秒 /取模  数字是具体时间
    public  void  Scheduled(){

        System.out.println("这个方法执行了第"+ i++ +"次");




    }



}
