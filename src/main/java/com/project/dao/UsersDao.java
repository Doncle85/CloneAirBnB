package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.modele.Users;

public interface UsersDao extends JpaRepository  <Users, Integer>{

}
