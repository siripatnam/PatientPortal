package com.patientportal.repository;

import com.patientportal.database.DbConnection;
import com.patientportal.models.Welcome;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class WelcomeRepository {

    public void book(Welcome welcome,String patientName, String phoneNo){
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();
        dbConnection.bookAppointment(connection,welcome,patientName,phoneNo);
    }
}
