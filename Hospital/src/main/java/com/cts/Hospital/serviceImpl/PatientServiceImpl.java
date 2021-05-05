package com.cts.Hospital.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cts.Hospital.model.Patient;
import com.cts.Hospital.repository.PatientRepository;
import com.cts.Hospital.service.PatientService;
@Service

public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public List<Patient> getAllPatients() {

		return patientRepository.findAll();
	}

	@Override
	public void savePatient(Patient patient) {

		this.patientRepository.save(patient);
	}

	@Override
	public Patient getPatientById(long id) {
	
			Optional<Patient> optional =patientRepository.findById(id);
			Patient patient=null;
			if(optional.isPresent()) {
				patient=optional.get();
			}else {
				throw new RuntimeException("Patient is not found for id :" +id);
			}
			return patient;
		
}

	@Override
	public void deletePatientById(long id) {
		// TODO Auto-generated method stub
		
	}}

/*	@Override
	public void deletePatientById(long id) {	
		patientRepository.PatientById(id);
	}}
*/