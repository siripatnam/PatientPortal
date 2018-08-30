package com.patientportal.controllers;

import com.patientportal.models.Patient;
import com.patientportal.service.PastAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class PastAppointmentsController {

    String patientName;

    @Autowired
    PastAppointmentService pastAppointmentService;

    @RequestMapping(value = "/pastappointments")
    public ModelAndView retrieve(){
        System.out.println("In the default get method of past appointments controller");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pastappointments");
        return modelAndView;
    }

    @RequestMapping(value = "/pastAppointmentsDisplay",method = RequestMethod.POST)
    public ModelAndView retrievePatient(String patientName,Patient patient){

        this.patientName = patientName;

        System.out.println("Inside the pa display controller");
        Map map = pastAppointmentService.retrieveData(patientName,patient);
        System.out.println(map);
        Patient patient1 = new Patient((String)map.get("docName"),(String)map.get("speciality"),(String)map.get("zipcode"),
                (String)map.get("patientname"),(String)map.get("phoneno"));
        ModelAndView modelAndView = new ModelAndView("PastAppointmentsDisplay");
        modelAndView.addObject("display",patient1);
        return modelAndView;
    }

}
