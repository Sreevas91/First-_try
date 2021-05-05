package com.cts.Hospital.service;

import java.util.List;
import java.util.Optional;

import com.cts.Hospital.model.Patient;

public interface PatientService {
	
	List<Patient> getAllPatients();
	void savePatient(Patient patient);
	Patient getPatientById(long id);
	void deletePatientById(long id);
}
