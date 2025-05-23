package com.ems.service;

import java.util.List;
import java.util.Optional;

import com.ems.entity.EmployeeEntity;

public interface EmployeeService {
	EmployeeEntity  addEmployeeDetail( EmployeeEntity empolyeeEntity);
	List<EmployeeEntity>getAllEmployeeDetail();
	Optional<EmployeeEntity> getEmployeeDetialById(Long id);
	EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeEntity);
	void deleteEmployee(Long id);
	void deleteByName(String name);
	

}
