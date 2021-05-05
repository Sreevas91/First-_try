package com.cts.Hospital.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.Hospital.model.Doctor;
import com.cts.Hospital.model.Patient;
import com.cts.Hospital.service.PatientService;
@Controller
public class PatientController {

	@Autowired
	private PatientService patientService ;
	@GetMapping("/list-patients")
	public String viewPatientList(ModelMap model) {
	model.addAttribute("listDoctors",patientService.getAllPatients());
     return "list-pateints";
}
	
	@GetMapping("/Patient")
	public String addPatient(ModelMap model) {
		Patient patient=new Patient();
		model.addAttribute("patient", patient);
		return "Patient";
	}
	@RequestMapping(value="/Patient",method=RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("patient") Patient patient) {
		patientService.savePatient(patient);
		return "redirect:/list-patients";
		
	}
	@RequestMapping(value = "/update-patient", method = RequestMethod.GET)
	public String showUpdatePatientPage(@RequestParam long id, ModelMap model) {
		Patient patient = patientService.getPatientById(id);
		model.put("patient", patient);
		return "Patient";
	}

	@RequestMapping(value = "/update-patient", method = RequestMethod.POST)
	public String updatePatient(ModelMap model, @Valid Patient patient, BindingResult result) {

		if (result.hasErrors()) {
			return "Patient";
		}
       patientService.savePatient(patient);
		return "redirect:/list-patients";
	}
	
	@RequestMapping(value="/delete-patient",method=RequestMethod.GET)
	public String delectePatient(@RequestParam long id) {
		patientService.deletePatientById(id);
		return "redirect:/list-patients";
		
	}
	
	
	
	
	
	
}
