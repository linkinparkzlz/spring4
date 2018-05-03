package com.zou.test;

import com.zou.entity.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");

//        People people = (People) context.getBean("people");
//
//        System.out.println(people);
//
//        //属性注入
//        People people2 = (People) context.getBean("people2");
//        System.out.println(people2);
//
//
//        //构造方法注入
//        People people3 = (People) context.getBean("people3");
//        System.out.println(people3);
//
//
//        //构造方法注入   索引注入
//        People people4 = (People) context.getBean("people4");
//        System.out.println(people4);
//
//
//        //工厂方法注入
//        People people6 = (People) context.getBean("people6");
//        System.out.println(people6);
//
//        //静态工厂方法注入
//        People people7 = (People) context.getBean("people7");
//        System.out.println(people7);
//
//

        //注入属性
        People people8 = (People) context.getBean("people8");
        System.out.println(people8);

        //注入内部bean

        People people9 = (People) context.getBean("people9");
        System.out.println(people9);




    }


}



















































