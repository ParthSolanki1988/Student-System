package com.simform.projectmanagmentsystem.Repository;

import com.simform.projectmanagmentsystem.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
