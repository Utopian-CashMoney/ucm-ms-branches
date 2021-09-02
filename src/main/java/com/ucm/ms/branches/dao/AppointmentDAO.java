package com.ucm.ms.branches.dao;

import com.ucm.ms.branches.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentDAO extends JpaRepository<Appointment, Integer>{
}
