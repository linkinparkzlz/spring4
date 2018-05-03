package com.zou.test;

import com.zou.entity.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");

        People people = (People) context.getBean("people");

        System.out.println(people);

        //属性注入
        People people2 = (People) context.getBean("people2");
        System.out.println(people2);
    }


}
