package com.cts.Hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.Hospital.model.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	
}
