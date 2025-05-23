package com.springjpa.repositry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springjpa.entity.User;
import com.springjpa.repository.RepositoryClass;

@Component
public class DpOperation {

	@Autowired
	private RepositoryClass repository;

	/*
	 * public void addInformation() { User user = new User(); user.setId(101);
	 * user.setName("Abhishek"); user.setSalary(170000.00);
	 * user.setAddress("Varansi"); user.setPinode(221011); user.setCountry("India");
	 * 
	 * repository.save(user);
	 * 
	 * }
	 */
	public void addInformationByList() {

		List<User> list = new ArrayList();
		list.add(new User(101, "shyam", 17000.00, "Varanasi", 221011, "India"));
		list.add(new User(102, "abhish", 18000.00, "Hyderabad", 201012, "Japan"));
		list.add(new User(103, "Rohit", 19000.00, "Banglour", 102333, "China"));
		list.add(new User(104, "Sachin", 20000.00, "Noida", 10345, "Nepal"));
		list.add(new User(107, "Bunty", 300000.00, "Payagraj", 222019, "America"));
		list.add(new User(103, "Rekha", 4000.00, "Dafi", 551022, "Pakistan"));
		list.add(new User(106, "Abhinav", 6000.00, "Ghamahapur", 776236, "Bangladesh"));
		list.add(new User(110, "Sonali", 70000.00, "Bhadoi", 123456, "Butan"));

		for (User ref : list) {
			repository.save(ref);

		}
	}

	public Optional<User> getInformation() {
		Optional ref = repository.findById(106);
		System.out.println(ref.get());
		return ref;

	}

	// Method to fetch all users' information
	public List<User> getInformationAll() {
		List<User> result = repository.findAll();
		System.out.println(result); // Print the list of all users
		return result;
	}

	public void getEmployByAddress(String address) {
        // Fetch users by address using the repository method
        List<User> result = repository.getEmployByAddress(address); // or repository.getEmployByAddress(address);
        
        // Print the result
        System.out.println(result);
    }
}
