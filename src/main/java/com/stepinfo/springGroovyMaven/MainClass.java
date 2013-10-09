package com.stepinfo.springGroovyMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jonathan LALOU
 */
public class MainClass {
    public static void main(String[] args) {
        final ApplicationContext applicationContext;
        final AnyService anyService;

        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        anyService = (AnyService) applicationContext.getBean("anyService");
        anyService.anyMethod();
    }
}
