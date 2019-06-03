package com.youguu.proxy.test.main;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundInteceptor implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("调用之前");

        Object object = invocation.proceed();

        System.out.println("调用之后");

        return object;
    }
}
