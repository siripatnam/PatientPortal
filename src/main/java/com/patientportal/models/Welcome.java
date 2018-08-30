package com.patientportal.models;

public class Welcome {

    String docname;
    String speciality;
    String zipcode;
    String patientName;
    String phoneNo;

    public Welcome(){

    }

    public Welcome(String docname, String speciality, String zipcode) {
        this.docname = docname;
        this.speciality = speciality;
        this.zipcode = zipcode;

    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

