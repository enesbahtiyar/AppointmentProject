package com.eb.assignmentproject.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Hospitals
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Hospital_id")
    private Long id;

    @Column(name = "Hospital_name", nullable = false)
    private String name;

    @Column(name = "Hospital_country", nullable = false)
    private String country;

    @OneToMany(mappedBy = "hospitals")
    private List<Doctors> doctorsList = new ArrayList<>();

    @OneToMany(mappedBy = "hospitals")
    private List<Specialities> specialitiesList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Doctors> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(List<Doctors> doctorsList) {
        this.doctorsList = doctorsList;
    }

    public List<Specialities> getSpecialitiesList() {
        return specialitiesList;
    }

    public void setSpecialitiesList(List<Specialities> specialitiesList) {
        this.specialitiesList = specialitiesList;
    }

    @Override
    public String toString() {
        return "Hospitals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", doctorsList=" + doctorsList +
                ", specialitiesList=" + specialitiesList +
                '}';
    }
}
