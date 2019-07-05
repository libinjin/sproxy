package com.youguu.proxy.newproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyMain {

    public static void main(String[] args) {

        ClassLoader carImpl = CarImpl.class.getClassLoader();
        Class[] classes = CarImpl.class.getInterfaces();
        Car car = (Car) Proxy.newProxyInstance(carImpl, CarImpl.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("开车前系好安全带");

                System.out.println(method.getName());
                Object obj = method.invoke(new CarImpl(), null);


                return obj;
            }
        });
        car.driver();
    }
}
