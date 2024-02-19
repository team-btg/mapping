package com.sesc.mapping.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Department {
    @Id
    private Integer departmentId;
    private String departmentName;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_department",
            joinColumns = {
                    @JoinColumn(name = "department_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "student_id")
            }
    )
    private List<Student> students = new ArrayList<>();
}
