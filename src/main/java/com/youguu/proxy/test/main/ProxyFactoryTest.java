package com.youguu.proxy.test.main;

import org.springframework.aop.framework.ProxyFactory;

public class ProxyFactoryTest {

    public static void main(String[] args) {

        //代理对象未指定接口，使用CGLIB生成代理类
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(new MyTarget());
        factory.addAdvice(new AroundInteceptor());

        MyTarget target = (MyTarget) factory.getProxy();
        target.printName();
        System.out.println(target.getClass().getName());


        //代理对象指定接口PeopleService，目标类为实现PeopleService的EnglishService，使用JDK proxy生成代理类
        ProxyFactory factorys = new ProxyFactory();
        factorys.setInterfaces(new Class[] { PeopleService.class });
        factorys.addAdvice(new AroundInteceptor());
        factorys.setTarget(new PeopleServiceImp());
        PeopleService peopleProxy = (PeopleService) factorys.getProxy();
        peopleProxy.sayHello();
        System.err.println(peopleProxy.getClass().getName());

    }
}
