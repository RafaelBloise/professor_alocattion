package com.project.professor.allocation.rafaelbloise.service.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.rafaelbloise.entity.Allocation;
import com.project.professor.allocation.rafaelbloise.entity.Course;
import com.project.professor.allocation.rafaelbloise.entity.Department;
import com.project.professor.allocation.rafaelbloise.entity.Professor;
import com.project.professor.allocation.rafaelbloise.service.AllocationService;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class AllocationServiceTest {

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");

    @Autowired
    AllocationService allocationService;

    @Test
    public void findAll() {
        // Act
    	List<Allocation> allocations = allocationService.findAll();
        // Print
    	allocations.forEach(System.out::println);
    }

    @Test
    public void findByProfessor() {
        // Arrange

        // Act

        // Print
    }

    @Test
    public void findByCourse() {
        // Arrange

        // Act

        // Print
    }

    @Test
    public void findById() {
        // Arrange

        // Act
    	Allocation alc = allocationService.findById(1L);
        // Print
    	System.out.println(alc);
    	
    }

    @Test
    public void save() throws ParseException {
        // Arrange
    	Allocation al = new Allocation();
    	al.setId(null);
    	al.setProfessorId(1L);
    	al.setCourseId(1L);
    	
    
        // Act

        // Print
    }

    @Test
    public void update() throws ParseException {
        // Arrange

        // Act

    }

    @Test
    public void deleteById() {
        // Arrange
    	
        // Act
    	allocationService.deleteById(1L);
    }

    @Test
    public void deleteAll() {
        // Act
    	allocationService.deleteAll();
    }
}
