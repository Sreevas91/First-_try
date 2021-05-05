package com.cts.Hospital.service;

import java.util.List;
import java.util.Optional;

import com.cts.Hospital.model.Doctor;

public interface DoctorService {

	List<Doctor> getAllDoctors();
	void saveDoctor(Doctor doctor);
	Doctor getDoctorById(long id);
	void deleteDoctorById(long id);

}
