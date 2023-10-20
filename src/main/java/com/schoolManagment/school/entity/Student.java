package com.schoolManagment.school.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String coures;
    @ManyToOne(fetch = FetchType.LAZY)
    private Instructor instructor;

    public Student() {}

    public Student(String firstName, String lastName, String email, String coures, Instructor instructor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.coures = coures;
        this.instructor = instructor;
    }

    public Student(Long id, String firstName, String lastName, String email, String coures, Instructor instructor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.coures = coures;
        this.instructor = instructor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoures() {
        return coures;
    }

    public void setCoures(String coures) {
        this.coures = coures;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
