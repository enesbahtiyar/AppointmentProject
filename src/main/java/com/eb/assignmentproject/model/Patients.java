package com.eb.assignmentproject.model;

import javax.persistence.*;

@Entity
public class Patients
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String patient_SSN;

    private String patient_Name;

    private String patient_Surname;

    private String gender;

    private String patientHistory;

    public Long getId() {
        return id;
    }

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

    public String getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(String patientHistory) {
        this.patientHistory = patientHistory;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", patient_SSN='" + patient_SSN + '\'' +
                ", patient_Name='" + patient_Name + '\'' +
                ", patient_Surname='" + patient_Surname + '\'' +
                ", gender='" + gender + '\'' +
                ", patientHistory='" + patientHistory + '\'' +
                '}';
    }
}
