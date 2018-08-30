package com.patientportal.service;

import com.patientportal.models.Patient;
import com.patientportal.repository.PastAppointmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class PastAppointmentService {

    @Autowired
    PastAppointmentsRepository pastAppointmentsRepository;

    public Map retrieveData(String patientName, Patient patient){

       Map map = pastAppointmentsRepository.retrieve(patientName,patient);

       return map;
    }
}
