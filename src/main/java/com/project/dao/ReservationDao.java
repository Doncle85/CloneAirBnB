package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.modele.Reservation;

public interface ReservationDao extends JpaRepository<Reservation, Integer>{

}
