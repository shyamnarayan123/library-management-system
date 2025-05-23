package com.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.EmployeeEntity;
import com.ems.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	// This Api for insert data into the database.
	// CRUD ->Creat,Read/Retrive,Update,Delete

	// Insert Data into database
	@PostMapping("/creat")
	public EmployeeEntity addEmployeeDetail(@RequestBody EmployeeEntity empolyeeEntity) {

		return employeeService.addEmployeeDetail(empolyeeEntity);

	}

	// Get employee alldetail by using GetMapping.
	@GetMapping("/getalldetail")
	List<EmployeeEntity> getAllEmployeeDetails() {
		return employeeService.getAllEmployeeDetail();
	}
	// Get employee detail by id
     @GetMapping("/{id}")
	 Optional<EmployeeEntity> getEmployeeDetialByIds(@PathVariable Long id) {
		return employeeService.getEmployeeDetialById(id);
	}
     
     //update employee detail
     @PutMapping("/{id}")
     public EmployeeEntity update(@PathVariable Long id, @RequestBody EmployeeEntity employeeEntity) {
		return  employeeService.updateEmployee(id, employeeEntity);
    	 
     }
     //delete employee detail
     @DeleteMapping("/{id}")
     public void delete(@PathVariable Long id) {
    	  employeeService.deleteEmployee(id);
     }
     @DeleteMapping("/name/{name}")
     public void deleteByName(@PathVariable String  name) {
    	 employeeService.deleteByName(name);
    	 
     }

}
