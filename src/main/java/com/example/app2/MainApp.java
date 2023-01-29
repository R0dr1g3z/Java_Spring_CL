package com.example.app2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans2.HelloWorld;
import com.example.beans2.PersonService;
import com.example.beans2.ScopePrototype;
import com.example.beans2.ScopeSingleton;
import com.example.beans2.Ship;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.hello();
        Ship ship = context.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();
        ScopeSingleton singleton1 = context.getBean(ScopeSingleton.class);
        ScopeSingleton singleton2 = context.getBean(ScopeSingleton.class);
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println((singleton1 == singleton2) + ": same objects\n");
        ScopePrototype prototype1 = context.getBean(ScopePrototype.class);
        ScopePrototype prototype2 = context.getBean(ScopePrototype.class);
        System.out.println(prototype1);
        System.out.println(prototype2);
        System.out.println((prototype1 == prototype2) + ": different objects");
        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());
        context.close();
    }
}
