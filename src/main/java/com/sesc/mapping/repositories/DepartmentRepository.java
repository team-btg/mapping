package com.sesc.mapping.repositories;

import com.sesc.mapping.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
