package com.patientportal.controllers;

import com.patientportal.models.Login;
import com.patientportal.models.Welcome;
import com.patientportal.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ConfirmAppointmentController {

    @Autowired
    WelcomeService welcomeService;

    String docname,speciality,zipcode,patientName,phoneNo;

//    @RequestMapping(value = "/confirmAppointment", method = RequestMethod.POST)
//    public ModelAndView display(String patientName, String phoneNo){
//
//        System.out.println("confirming the appointment");
////        Welcome welcome = new Welcome(docname,speciality,zipcode);
////        welcomeService.bookAppointment(welcome,patientName,phoneNo);
//
//        System.out.println(welcome.getDocname());
//        System.out.println(welcome.getPatientName());
//
//
//        ModelAndView modelAndView = new ModelAndView();
//
//        modelAndView.setViewName("doctor");
//        modelAndView.addObject("welcome","Booked successfully");
//        return modelAndView;
//    }
}
