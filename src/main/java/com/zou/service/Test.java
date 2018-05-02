package com.zou.service;

import com.zou.test.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");

//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
//
//        helloWorld.say();


        Work work = (Work) context.getBean("work");
        work.doTest();


    }


}
