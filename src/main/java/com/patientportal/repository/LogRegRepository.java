package com.patientportal.repository;

import com.patientportal.database.DbConnection;
import com.patientportal.models.Login;
import com.patientportal.models.Register;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.Map;

@Repository
public class LogRegRepository {

    public void registerUser(Register register) {

        DbConnection dbConnection =  new DbConnection();
        Connection connection =  dbConnection.createConnection();
        dbConnection.registerUser(connection,register);
    }

    public Map validateUserLogin(Login login){
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();
        Map hashmap = (Map) dbConnection.validateUser(connection,login);
        return hashmap;
    }

}
