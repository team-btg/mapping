package com.sesc.mapping.repositories;

import com.sesc.mapping.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
