package com.stepinfo.springGroovyMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "anyService")
/**
 * @author Jonathan LALOU
 */
public class StepServiceImplementation implements StepService {

    @Autowired
    private StepDAO stepDAO;

    public void setStepDAO(StepDAO stepDAO) {
        this.stepDAO = stepDAO;
    }

    public void anyMethod() {
        System.out.println(stepDAO.getAnyString());
    }
}