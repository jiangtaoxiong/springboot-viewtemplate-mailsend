package com.lincoln.mail.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lincoln.springboot.SpringbootApplication;
 
/**
 *
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootApplication.class)
public class mailTest {
    @Autowired
    private JavaMailSender mailSender;
   
    /**
     * 修改application.properties的用户，才能发送。
     */
    @Test
    public void sendSimpleEmail(){
       SimpleMailMessage message = new SimpleMailMessage();
      
       message.setTo("602717885@qq.com");//发送者.
       message.setFrom("billfish06082125@foxmail.com");//接收者.
       message.setSubject("测试邮件（邮件主题）2222");//邮件主题.
       message.setText("这是lincoln的邮件测试内容。。。。。。。");//邮件内容.
      
       mailSender.send(message);//发送邮件
    }
}