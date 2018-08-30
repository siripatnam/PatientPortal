package com.patientportal.service;

import com.patientportal.models.Login;
import com.patientportal.models.Welcome;
import com.patientportal.repository.WelcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    @Autowired
    WelcomeRepository welcomeRepository;

    public void bookAppointment(Welcome welcome,String patientName, String phoneNo)
    {
        welcomeRepository.book(welcome,patientName,phoneNo);
    }
}
