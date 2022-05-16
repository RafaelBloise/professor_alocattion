package com.project.professor.allocation.rafaelbloise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.rafaelbloise.entity.Allocation;
import com.project.professor.allocation.rafaelbloise.repository.AllocationRepository;

@Service
public class AllocationService {

	private final AllocationRepository allocationRepository;

	public AllocationService(AllocationRepository allocationRepository) {
		super();
		this.allocationRepository = allocationRepository;
	}
	
	
	public List<Allocation> findAll(){
		return this.allocationRepository.findAll();	
	}
	
	public Allocation save (Allocation allocation) {
		if(allocation.getId()!=null) {
			return this.allocationRepository.save(allocation);	
		}else {
			return saveInternal(allocation);
		}
		
	}
	
	private Allocation saveInternal (Allocation allocation) {
		
		Allocation al = this.allocationRepository.getById(allocation.getId());
				
		return al;
	}
	
	public Allocation findById(Long allocationId) {
		return this.allocationRepository.findById(allocationId).orElse(null);
	}
	
	public void deleteById(Long id) {
		 this.allocationRepository.deleteById(id);
	}
	
	public void deleteAll() {
		this.allocationRepository.deleteAll();
	}
	
}
