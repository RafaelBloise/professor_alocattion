package com.project.professor.allocation.rafaelbloise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.rafaelbloise.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
