package com.youguu.proxy.test.ProxyFactoryBeanDemo;

public class Target implements Subject {
    @Override
    public void request() {
        System.out.println("target request ..");
    }
}

