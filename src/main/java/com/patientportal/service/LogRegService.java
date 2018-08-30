package com.patientportal.service;


import com.patientportal.models.Login;
import com.patientportal.models.Register;
import com.patientportal.repository.LogRegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Service
public class LogRegService{

    @Autowired
    LogRegRepository logRegRepository;

    public void registerUser(Register register) {
        logRegRepository.registerUser(register);
    }

    public Map validateUserLogin(Login login){
       Map hashmap = logRegRepository.validateUserLogin(login);
        return hashmap;
    }
    // method to validate function

    public ModelAndView validateLogin(Login login,Map hashmap){

        ModelAndView modelAndView = new ModelAndView();
        if (login.getPassword().equals(hashmap.get("password"))){
            modelAndView.setViewName("welcome");
            modelAndView.addObject("login",login);
            System.out.println("Details are correct....");
        }else{
            modelAndView.setViewName("index");
            modelAndView.addObject("error","Invalid Username or password");
            System.out.println("details are wrong....");
        }
        return modelAndView;
    }
}
