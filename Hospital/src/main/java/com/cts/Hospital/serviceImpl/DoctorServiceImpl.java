package com.cts.Hospital.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Hospital.model.Doctor;
import com.cts.Hospital.repository.DoctorRepository;
import com.cts.Hospital.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll() ;
	}

	@Override
	public void saveDoctor(Doctor doctor) {
		this.doctorRepository.save(doctor);
	}

	@Override
	public Doctor getDoctorById(long id) {
		Optional<Doctor> optional =doctorRepository.findById(id);
		Doctor doctor=null;
		if(optional.isPresent()) {
			doctor=optional.get();
		}else {
			throw new RuntimeException("Doctor is not found for id :" +id);
		}
		return doctor;
	}

	@Override
	public void deleteDoctorById(long id) {
		doctorRepository.deleteById(id);
	}

	
}
