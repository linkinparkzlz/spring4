package com.zou.service;

public class Work {


    private TestInterface testInterface;


    public TestInterface getTestInterface() {
        return testInterface;
    }

    public void setTestInterface(TestInterface testInterface) {
        this.testInterface = testInterface;
    }

    public void doTest() {

//        Person person = new Person();
//
//        person.test();

        testInterface.test();


    }

}
