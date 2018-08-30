package com.patientportal.repository;

import com.patientportal.database.DbConnection;
import com.patientportal.models.Patient;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.Map;

@Repository
public class PastAppointmentsRepository {


    public Map retrieve(String patientName, Patient patient){
        DbConnection dbConnection = new DbConnection();
       Connection connection = dbConnection.createConnection();
        Map map = dbConnection.getPatientData(connection,patientName,patient);

        return map ;
    }
}
