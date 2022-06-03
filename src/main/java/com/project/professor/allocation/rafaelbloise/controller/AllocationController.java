package com.project.professor.allocation.rafaelbloise.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.professor.allocation.rafaelbloise.entity.Allocation;
import com.project.professor.allocation.rafaelbloise.service.AllocationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping (path = "/allocations")
public class AllocationController {

	private final AllocationService allocationService;

	public AllocationController(AllocationService allocationService) {
		super();
		this.allocationService = allocationService;
	}
	
	
	@ApiOperation(value = "Find all allocations")
	@ApiResponses({
		@ApiResponse(code=200, message="OK")
	})
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	private ResponseEntity<List<Allocation>> findall(){
		List<Allocation> allocations = allocationService.findAll();
		return new ResponseEntity<>(allocations, HttpStatus.OK);
		
	}
	
	
	@ApiOperation(value = "Find an allocation by id")
	@ApiResponses({
		@ApiResponse(code=200, message="OK"),
		@ApiResponse(code=400, message="BAD REQUEST"),
		@ApiResponse(code=404, message="NOT FOUND")
	})
	@GetMapping(path="/{allocation_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	private ResponseEntity<Allocation> findById(@PathVariable(name = "allocation_id") Long id){
		Allocation allocation = this.allocationService.findById(id);
		if(allocation == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(allocation,HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Create an new allocation")
	@ApiResponses({
		@ApiResponse(code=201, message="CREATED"),
		@ApiResponse(code=400, message="BAD REQUEST"),
	})
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	private ResponseEntity<Allocation> save(@RequestBody Allocation allocation){
		
		try {
			allocation = this.allocationService.save(allocation);
			return new ResponseEntity<>(allocation, HttpStatus.CREATED);
			
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
}