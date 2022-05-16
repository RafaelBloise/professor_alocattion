package com.project.professor.allocation.rafaelbloise.service;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.rafaelbloise.repository.CourseRepository;

@Service
public class CourseService {

	 private final CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}
	
	 
	
}
