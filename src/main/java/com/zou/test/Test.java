package com.zou.test;

import com.zou.service.Person;
import com.zou.service.Work;

public class Test {


    public static void main(String[] args) {

        Work work = new Work();
        work.doTest();

        work.setTestInterface(new Person());
        work.doTest();

    }
}
