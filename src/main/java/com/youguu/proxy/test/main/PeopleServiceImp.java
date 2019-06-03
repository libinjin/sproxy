package com.youguu.proxy.test.main;

public class PeopleServiceImp implements PeopleService{
    @Override
    public void sayHello() {
        System.err.println("Hi~");
    }

    @Override
    public void printName(String name) {
        System.err.println("Your name:" + name);
    }
}
