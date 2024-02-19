package com.sesc.mapping.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Project {
    @Id
    private Integer projectId;
    private String projectName;
    private String projectDomain;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_project",
            joinColumns = {
                    @JoinColumn(name = "project_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "student_id")
            }
    )
    private List<Student> students = new ArrayList<>();
}
