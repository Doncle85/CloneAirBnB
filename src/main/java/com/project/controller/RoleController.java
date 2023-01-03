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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.project.dao.RoleDao;
import com.project.modele.Role;

@RestController
@RequestMapping("airBnB/role")
public class RoleController {
	@Autowired
	private RoleDao roleDao;
	
	
	// Get List of Role
	@GetMapping("/role")
	public List<Role> findAllRole() {
		return this.roleDao.findAll();
	}
	
	// Get One  Role by id
	@GetMapping("/{id}")
	public Optional<Role> findOneRoleById(@PathVariable int id) {
		return this.roleDao.findById(id);
	}
	
	// Delete Role
	@DeleteMapping("/delete/{id}")
	public Boolean deleteRole(@PathVariable int id) {
		this.roleDao.deleteById(id);
		return true;
	}
	
	// Insert Role
	@PostMapping("/add")
	@ResponseBody
	public Role insertRole( @RequestBody Role role  ) {
		return this.roleDao.save(role);
	}
	
	// Update Role
	@PutMapping("/update")
	public Role updateRole( @RequestBody Role role  ) {
		return this.roleDao.save(role);
	}

}
