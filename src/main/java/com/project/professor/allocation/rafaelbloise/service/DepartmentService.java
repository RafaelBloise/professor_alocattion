package com.project.professor.allocation.rafaelbloise.service;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.rafaelbloise.repository.CourseRepository;
import com.project.professor.allocation.rafaelbloise.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}
	
	 
	
	
	
	
}
