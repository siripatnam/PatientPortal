package com.patientportal.models;

import com.sun.istack.internal.NotNull;
import sun.rmi.runtime.Log;

public class Login {

    @NotNull
    public String userName;
    @NotNull
    public String password;

    public Login(){

    }
    public Login(String userName){
        this.userName = userName;
    }

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
