package com.stepinfo.springGroovyMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jonathan LALOU
 */
public class MainClass {
    public static void main(String[] args) {
        final ApplicationContext applicationContext;
        final StepService stepService;

        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        stepService = (StepService) applicationContext.getBean("stepService");
        stepService.anyMethod();
    }
}
