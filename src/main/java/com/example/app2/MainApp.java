package com.example.app2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans2.HelloWorld;


public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.hello();
        context.close();
    }
}
