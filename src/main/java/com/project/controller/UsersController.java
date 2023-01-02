package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.UsersDao;
import com.project.modele.Users;

@RestController
public class UsersController {
	@Autowired
	private UsersDao usersDao;
	
	// Get List of users
	@GetMapping("")
	public List<Users> findAllUsers() {
		return this.usersDao.findAll();
	}
	
	// Get One  User by id
	@GetMapping("/{id}")
	public Optional<Users> findOneUserById(@PathVariable int id) {
		return this.usersDao.findById(id);
	}
	
	// Delete User
	@DeleteMapping("/delete/{id}")
	public Boolean deleteUser(@PathVariable int id) {
		this.usersDao.deleteById(id);
		return true;
	}
	
	// Insert User
	@PostMapping("/add")
	public Users insertUser( @RequestBody Users users  ) {
		return this.usersDao.save(users);
	}
	
	// Update user
		@PutMapping("/update")
		public Users updateUser( @RequestBody Users users  ) {
			return this.usersDao.save(users);
		}


}