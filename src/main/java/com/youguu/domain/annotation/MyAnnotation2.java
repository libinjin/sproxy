package com.youguu.domain.annotation;

import java.util.Date;

public @interface MyAnnotation2 {

    //注解属性
    int i();

    String s();

    String[] ss();

    Class cl();

    MyAnnotation m();

    Color RED();

}
