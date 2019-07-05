package com.youguu.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService service = (AwareService) ac.getBean("awareService");

        service.outputResult();
    }
}
