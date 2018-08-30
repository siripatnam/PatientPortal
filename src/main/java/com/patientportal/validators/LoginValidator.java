package com.patientportal.validators;

import com.patientportal.models.Login;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class LoginValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        System.out.println("class" + aClass);
        return Login.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {

        Login login = (Login)o;

        if(login.userName == null || login.userName.equals("")){
            System.out.println("Username is null");
            errors.rejectValue("userName","login.userName","Username is null");
        }
    }
}
