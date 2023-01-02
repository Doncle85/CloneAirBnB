package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.dao.UsersDao;

@SpringBootApplication
public class MiniAirbnbApplication implements CommandLineRunner {
	@Autowired
	private UsersDao usersDao;
	public static void main(String[] args) {
		SpringApplication.run(MiniAirbnbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("List of Users  : " + this.usersDao.findAll());


	}
	
}
