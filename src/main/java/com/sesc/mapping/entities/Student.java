package com.sesc.mapping.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String studentCourse;
    private Date dateOfBirth;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Address address;
}
