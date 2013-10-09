package com.stepinfo.springGroovyMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "anyService")
/**
 * @author Jonathan LALOU
 */
public class AnyServiceImplementation implements AnyService {

    @Autowired
    private AnyDao anyDao;

    public void setAnyDao(AnyDao anyDao) {
        this.anyDao = anyDao;
    }

    public void anyMethod() {
        System.out.println(anyDao.getAnyString());
    }
}