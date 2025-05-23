package com.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.EmployeeEntity;
import com.ems.repositry.EmployeeRepositry;

import jakarta.transaction.Transactional;
@Service
public class ServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepositry employeeRepositry ;

	@Override
	public EmployeeEntity addEmployeeDetail(EmployeeEntity empolyeeEntity) {
	
		return  employeeRepositry.save(empolyeeEntity);
	}

	@Override
	public List<EmployeeEntity> getAllEmployeeDetail() {
		
		return employeeRepositry.findAll();
	}

	@Override
	public Optional<EmployeeEntity> getEmployeeDetialById(Long id) {
		
		return employeeRepositry.findById(id);
	}

	@Override
	public EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeEntity) {
	    return employeeRepositry.findById(id).map(emp -> {
	        emp.setAddress(employeeEntity.getAddress());
	        emp.setEmail(employeeEntity.getEmail());
	        emp.setMobilenumber(employeeEntity.getMobilenumber());
	        emp.setName(employeeEntity.getName());
	        emp.setRollnumber(employeeEntity.getRollnumber());
	        return employeeRepositry.save(emp);
	    }).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepositry.deleteById(id);
		
		
	}

	@Override
	 @Transactional
	public void deleteByName(String name) {
		
		employeeRepositry.deleteByName(name);
		
	}

	}


