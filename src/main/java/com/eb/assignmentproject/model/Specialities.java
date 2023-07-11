package com.eb.assignmentproject.model;

import javax.persistence.*;

@Entity
public class Specialities
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospitals hospitals;

    @Column(unique = true, nullable = false)
    private String speciality;

    public Long getId() {
        return id;
    }


    public Hospitals getHospitals() {
        return hospitals;
    }

    public void setHospitals(Hospitals hospitals) {
        this.hospitals = hospitals;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Specialities{" +
                "id=" + id +
                ", hospitals=" + hospitals +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
