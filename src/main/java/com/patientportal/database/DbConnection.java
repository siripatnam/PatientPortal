package com.patientportal.database;

import com.patientportal.models.Login;
import com.patientportal.models.Patient;
import com.patientportal.models.Register;
import com.patientportal.models.Welcome;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbConnection {

    public  DbConnection(){

    }

    String username;
    String password;
    String docName;
    String speciality;
    String zipCode;
    String patientName;
    String phoneNo;


    public Connection createConnection() {

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection =DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }

    public Register registerUser(Connection connection, Register register) {

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection
                    .prepareStatement("INSERT INTO register(firstname, lastname, gender, email, phoneno, username, password) VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, register.getFirstName());
            preparedStatement.setString(2, register.getLastName());
            preparedStatement.setString(3, register.getGender());
            preparedStatement.setString(4, register.getEmail());
            preparedStatement.setString(5, register.getPhoneNo());
            preparedStatement.setString(6, register.getUserName());
            preparedStatement.setString(7, register.getPassword());
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return register;
   }

    public Map validateUser(Connection connection, Login login) {

        PreparedStatement preparedStatement = null;

        try {
           preparedStatement= connection.
                   prepareStatement("select * from register where username =(?) and password = (?)");

            preparedStatement.setString(1,login.getUserName());
            preparedStatement.setString(2,login.getPassword());
           ResultSet resultSet = preparedStatement.executeQuery();

           while(resultSet.next()){
               username = resultSet.getString("username");
               password = resultSet.getString("password");
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Map hashmap = new HashMap();
        hashmap.put("username",username);
        hashmap.put("password",password);

        return hashmap;
    }

    public Welcome bookAppointment(Connection connection, Welcome welcome,String patientName, String phoneNo){

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into bookeddata(docname, speciality, zipcode,patientname,phoneno) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1,welcome.getDocname());
            preparedStatement.setString(2,welcome.getSpeciality());
            preparedStatement.setString(3,welcome.getZipcode());
            preparedStatement.setString(4,patientName);
            preparedStatement.setString(5,phoneNo);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return welcome;
    }

    public Map getPatientData(Connection connection,String patientName,Patient patient){

        PreparedStatement preparedStatement;

        ResultSet resultSet = null;

        ;

        Map map = new HashMap();

        try {
            preparedStatement = connection.prepareStatement("select * from bookeddata where patientname =(?)");
            preparedStatement.setString(1,patient.getPatientName());
           resultSet = preparedStatement.executeQuery();

           while (resultSet.next()){
               docName = resultSet.getString("docname");
               speciality = resultSet.getString("speciality");
                zipCode = resultSet.getString("zipcode");
                patientName = resultSet.getString("patientname");
                phoneNo = resultSet.getString("phoneno");

           }

           map.put("docName",docName);
           map.put("speciality",speciality);
           map.put("zipcode",zipCode);
           map.put("patientname",patientName);
           map.put("phoneno",phoneNo);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return map;
    }
}
