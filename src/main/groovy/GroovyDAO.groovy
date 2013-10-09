package com.stepinfo.springGroovyMaven


import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component(value = "anyDao")
/**
 * Fake-DAO
 * @author Jonathan LALOU
 */
class GroovyDAO implements AnyDao {

    @Value("*** 'any data' retrieved by Groovy / Spring annotation ***")
    /**
     * Implements AnyDao.getAnyString()
     */
    String anyString
}