package com.cts.Hospital.service;

import java.util.List;

import com.cts.Hospital.model.Doctor;
import com.cts.Hospital.model.Receptionist;

public interface ReceptionistService {
	List<Receptionist> getAllReceptionist();
	void saveReceptionist(Receptionist receptionist);
	Receptionist getReceptionistById(long id);
	void deleteReceptionistById(long id);


}
