package com.youguu.domain.test;

public class MyTest {

    @MyTests
    public void f1(Integer i){
        System.out.println("f1方法执行了~~~"+i);
    }

    @MyTests
    public void f2(){
        System.out.println("f2方法执行了~~~");
    }

    @MyTests
    public void f3(){
        System.out.println("f3方法执行了~~~");
    }

}
