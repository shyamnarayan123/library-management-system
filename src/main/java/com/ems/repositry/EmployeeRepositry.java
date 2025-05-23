package com.ems.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.ems.entity.EmployeeEntity;

public interface EmployeeRepositry extends JpaRepository<EmployeeEntity,Long> {
	 void deleteByName(String name);


}
