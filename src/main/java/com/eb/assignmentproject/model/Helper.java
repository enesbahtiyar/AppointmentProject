package com.eb.assignmentproject.model;

import javax.persistence.*;

@Entity
public class Helper
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "helper_name")
    private String name;

    private String securityNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    @Override
    public String toString() {
        return "Helper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", securityNumber='" + securityNumber + '\'' +
                '}';
    }
}
