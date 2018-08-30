package com.patientportal.models;

public class Patient {

    String docname;
    String speciality;
    String zipcode;
    String patientName;
    String phoneNo;

    public Patient(String docname, String speciality, String zipcode, String patientName, String phoneNo) {
        this.docname = docname;
        this.speciality = speciality;
        this.zipcode = zipcode;
        this.patientName = patientName;
        this.phoneNo = phoneNo;
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
}
