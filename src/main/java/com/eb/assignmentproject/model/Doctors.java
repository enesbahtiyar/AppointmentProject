package com.eb.assignmentproject.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Doctors
{
    @Id
    private String ssn;

    @Column(name = "doctor_name", nullable = false)
    private String name;

    @Column(name = "doctor_lastName", nullable = false)
    private String lastname;

    @Transient
    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospitals hospitals;

    @ManyToOne
    @JoinColumn(name = "Speciality_id")
    private Specialities speciality;

    @OneToMany(mappedBy = "doctors")
    private List<Appointments> appointmentsList = new ArrayList<>();

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Hospitals getHospitals() {
        return hospitals;
    }

    public void setHospitals(Hospitals hospitals) {
        this.hospitals = hospitals;
    }

    public Specialities getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Specialities speciality) {
        this.speciality = speciality;
    }

    public List<Appointments> getAppointmentsList() {
        return appointmentsList;
    }

    public void setAppointmentsList(List<Appointments> appointmentsList) {
        this.appointmentsList = appointmentsList;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", hospitals= " + hospitals.getId() +
                ", speciality= " + speciality.getSpeciality() +
                '}';
    }
}
