package com.stepinfo.springGroovyMaven

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Repository

@Repository(value = "stepDAO")
/**
 * Fake-DAO
 * @author Jonathan LALOU
 */
class GroovyImplementationDAO implements StepDAO {

    @Value("*** 'any data' retrieved by Groovy / Spring annotation ***")
    /**
     * Implements StepDAO.getAnyString()
     */
    String anyString
}