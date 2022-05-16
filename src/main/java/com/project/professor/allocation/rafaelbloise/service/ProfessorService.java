package com.project.professor.allocation.rafaelbloise.service;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.rafaelbloise.repository.ProfessorRepository;

@Service
public class ProfessorService {

	private final ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorRepository) {
		super();
		this.professorRepository = professorRepository;
	}
	
	
	
}
