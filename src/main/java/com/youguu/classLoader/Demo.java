package com.youguu.classLoader;

public class Demo {

    public static void main(String[] args) {

        ClassLoader ap = Demo.class.getClassLoader();
        System.out.println(ap);

        //用c语言写的，就不用了类加载器
        ClassLoader ex = String.class.getClassLoader();
        System.out.println(ex);

    }
}
