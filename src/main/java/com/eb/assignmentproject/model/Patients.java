package com.eb.assignmentproject.model;

import javax.persistence.*;

@Entity
public class Patients
{
    @Id
    @Column(nullable = false)
    private String patient_SSN;

    private String patient_Name;

    private String patient_Surname;

    private String gender;

    private String patient_Security_Number;

    @Column(length = 1000)
    private String patientHistory;

    @OneToOne(mappedBy = "patients")
    private Appointments appointments;

    public String getPatient_SSN() {
        return patient_SSN;
    }

    public void setPatient_SSN(String patient_SSN) {
        this.patient_SSN = patient_SSN;
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public String getPatient_Surname() {
        return patient_Surname;
    }

    public void setPatient_Surname(String patient_Surname) {
        this.patient_Surname = patient_Surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatient_Security_Number() {
        return patient_Security_Number;
    }

    public void setPatient_Security_Number(String patient_Security_Number) {
        this.patient_Security_Number = patient_Security_Number;
    }

    public String getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(String patientHistory) {
        this.patientHistory = patientHistory;
    }

    public Appointments getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointments appointments) {
        this.appointments = appointments;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "patient_SSN='" + patient_SSN + '\'' +
                ", patient_Name='" + patient_Name + '\'' +
                ", patient_Surname='" + patient_Surname + '\'' +
                ", gender='" + gender + '\'' +
                ", patient_Security_Number='" + patient_Security_Number + '\'' +
                ", patientHistory='" + patientHistory + '\'' +
                ", appointments=" + appointments +
                '}';
    }
}
