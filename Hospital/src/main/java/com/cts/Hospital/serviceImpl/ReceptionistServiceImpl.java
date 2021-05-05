package com.cts.Hospital.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Hospital.model.Receptionist;
import com.cts.Hospital.repository.ReceptionistRepository;
import com.cts.Hospital.service.ReceptionistService;
@Service
public class ReceptionistServiceImpl implements ReceptionistService {
	@Autowired
	private ReceptionistRepository receptionistRepository;

	@Override
	public List<Receptionist> getAllReceptionist() {
		
		return receptionistRepository.findAll();
	}

	@Override
	public void saveReceptionist(Receptionist receptionist) {
		receptionistRepository.save(receptionist);
	}

	@Override
	public Receptionist getReceptionistById(long id) {
		Optional<Receptionist> optional =receptionistRepository.findById(id);
		Receptionist receptionist =null;
		if(optional.isPresent()) {
			receptionist=optional.get();
		}else {
			throw new RuntimeException("Receptionist is not found for id :" +id);
		}
		return receptionist;
	}

	@Override
	public void deleteReceptionistById(long id) {
		receptionistRepository.deleteById(id);
		
	}

}
