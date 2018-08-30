package com.patientportal.controllers;

import com.patientportal.models.Register;
import com.patientportal.service.LogRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @Autowired
    LogRegService logRegService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Default(){

        return new ModelAndView("register");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processForm(@Valid @ModelAttribute("registration") Register register,
                              BindingResult bindingResult) {

        logRegService.registerUser(register);
        if (bindingResult.hasErrors()) {
            return "register";
        } else {
            return "index";
        }
    }
}