package com.patientportal.controllers;

import com.patientportal.models.Login;
import com.patientportal.service.LogRegService;
import com.patientportal.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class LoginController {
    @Autowired
    LogRegService logRegService;


    @RequestMapping(method = RequestMethod.GET)
    public String Init(Model model) {
        model.addAttribute("login", new Login());
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView Submit(@Validated @ModelAttribute("login") Login login, BindingResult error) {

        ModelAndView modelAndView = new ModelAndView();
        if (error.hasErrors()) {
            modelAndView.setViewName("index");
            System.out.println("returning...");
            return modelAndView;
        }
        Map hashmap = logRegService.validateUserLogin(login);
        return logRegService.validateLogin(login, hashmap);
    }

    @InitBinder
    public void InitBinder(WebDataBinder webDataBinder) {
        webDataBinder.addValidators(new LoginValidator());
    }

    @ExceptionHandler(value = NullPointerException.class)
    public String exception() {
        return "error";
    }

}
