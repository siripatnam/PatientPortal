package com.patientportal.controllers;

import com.patientportal.models.Welcome;
import com.patientportal.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;
    public String docname;
    public String speciality;
    public String zipcode;
    private String patientName;
    private String phoneNo;

    @RequestMapping(value = "/welcome" ,method = RequestMethod.POST)
    public ModelAndView processBooking(@ModelAttribute Welcome welcome){
        this.docname = welcome.getDocname();
        this.speciality = welcome.getSpeciality();
        this.zipcode = welcome.getZipcode();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("doctor");
        modelAndView.addObject("doctor",welcome);
        return modelAndView;
    }

    @RequestMapping(value = "/confirmAppointment", method = RequestMethod.POST)
    public ModelAndView display(String patientName, String phoneNo){

        System.out.println("confirming the appointment");
        Welcome welcome = new Welcome(docname,speciality,zipcode);
        welcomeService.bookAppointment(welcome,patientName,phoneNo);

        System.out.println(welcome.getDocname());
        System.out.println(patientName);


        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("doctor");
        modelAndView.addObject("welcome","Booked successfully");
        return modelAndView;
    }
}
