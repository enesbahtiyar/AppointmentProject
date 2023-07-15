package com.eb.assignmentproject.model;

import javax.persistence.*;

@Entity
public class Appointments
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "Appointment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospitals hospitals;

    @ManyToOne
    @JoinColumn(name = "spec_id")
    private Specialities specialities;

    @ManyToOne
    @JoinColumn(name = "doc_id")
    private Doctors doctors;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patients patients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hospitals getHospitals() {
        return hospitals;
    }

    public void setHospitals(Hospitals hospitals) {
        this.hospitals = hospitals;
    }

    public Specialities getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Specialities specialities) {
        this.specialities = specialities;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "id=" + id +
                ", hospitals=" + hospitals.getId() +
                ", specialities=" + specialities.getSpeciality() +
                ", doctors name = " + doctors.getName() +
                ", doctors lastname = " + doctors.getLastname() +
                ", patients name= " + patients.getPatient_Name() +
                ", patients lastname= " + patients.getPatient_Surname() +
                '}';
    }
}
