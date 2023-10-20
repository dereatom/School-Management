package com.schoolManagment.school.entity;

import jakarta.persistence.*;


import java.util.List;
@Entity
public class Instructor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String instructorFirstName;
private String instructorLastName;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "instructor")
private List<Student> students;

    public Instructor() {}

    public Instructor(String instructorFirstName, String instructorLastName, List<Student> students) {
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.students = students;
    }

    public Instructor(Long id, String instructorFirstName, String instructorLastName, List<Student> students) {
        this.id = id;
        this.instructorFirstName= instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.students = students;
    }

    public Long getInstructorId() {
        return id;
    }

    public void setInstructorId(Long instructorId) {
        this.id = instructorId;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
