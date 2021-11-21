package com.ze;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringBootAsyncApplicationTests {

    @Autowired
    JavaMailSenderImpl sender;//Spring的邮件发送的核心是MailSender接口，
    // 在Spring中提供了一个实现类JavaMailSenderImpl，这个类是发送邮件的核心类。



    @Test
    void contextLoads() {
        //send需要一个邮件 我们这里创建一个简单的邮件
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
                //主题
                simpleMailMessage.setSubject("你好我是楠笙");
                //内容
                simpleMailMessage.setText("谢谢你");
                //发给谁
                simpleMailMessage.setTo("1550588295@qq.com");
                //谁发的
                simpleMailMessage.setFrom("1550588295@qq.com");

        sender.send(simpleMailMessage);
    }



    @Test
    void  emailText() throws MessagingException {
        //创建一个复杂的邮件
        MimeMessage mimeMessage = sender.createMimeMessage();
        //这里我们用这个类去帮助组装  里面有多个重载方法
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);


            helper.setSubject("楠笙");
            helper.setText("我又来了");
            //附件
            helper.addAttachment("头像.jpg", new File("C:\\Users\\南笙\\Desktop\\1.jpg"));

            helper.setTo("1550588295@qq.com");
            helper.setFrom("1550588295@qq.com");



        sender.send(mimeMessage);


    }

}
