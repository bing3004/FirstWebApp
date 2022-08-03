package com.example.firstwebapp.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "applicant")
public class Applicant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String username;
    private String password;
    private String firstName;
    private String lastName;




}
