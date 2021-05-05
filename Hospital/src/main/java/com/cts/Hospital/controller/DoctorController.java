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
import com.cts.Hospital.service.DoctorService;

@Controller
public class DoctorController {
	@Autowired
	private DoctorService doctorService ;
	@GetMapping("/list-doctors")
	public String viewDoctorList(ModelMap model) {
	model.addAttribute("listDoctors",doctorService.getAllDoctors());
     return "list-doctors";
}
	@GetMapping("/Doctor")
	public String addDoctor(ModelMap model) {
		Doctor doctor=new Doctor();
		model.addAttribute("doctor", doctor);
		return "Doctor";
	}
	@RequestMapping(value="/Doctor",method=RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
		doctorService.saveDoctor(doctor);
		return "redirect:/list-doctors";
		
	}
	@RequestMapping(value = "/update-doctor", method = RequestMethod.GET)
	public String showUpdateDoctorPage(@RequestParam long id, ModelMap model) {
		Doctor doctor = doctorService.getDoctorById(id);
		model.put("doctor", doctor);
		return "Doctor";
	}

	@RequestMapping(value = "/update-doctor", method = RequestMethod.POST)
	public String updateDoctor(ModelMap model, @Valid Doctor doctor, BindingResult result) {

		if (result.hasErrors()) {
			return "Doctor";
		}
       doctorService.saveDoctor(doctor);
		return "redirect:/list-doctors";
	}
	@RequestMapping(value="/delete-doctor",method=RequestMethod.GET)
	public String delecteDoctor(@RequestParam long id) {
		doctorService.deleteDoctorById(id);
		return "redirect:/list-doctors";
		
	}
}
