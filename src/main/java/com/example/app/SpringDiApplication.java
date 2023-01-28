package com.example.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.EmailService;
import com.example.beans.HelloWorld;
import com.example.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());
        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.send();
        MessageSender messageSender = (MessageSender) context.getBean("messageSender");
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();
        context.close();
    }
}
