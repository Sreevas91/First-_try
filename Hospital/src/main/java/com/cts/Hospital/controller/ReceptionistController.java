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
import com.cts.Hospital.model.Receptionist;
import com.cts.Hospital.service.ReceptionistService;

@Controller
public class ReceptionistController {
	@Autowired
	private ReceptionistService receptionistService;
	@GetMapping("/list-receptionists")
	public String showReceptionistList(ModelMap model) {
		model.addAttribute("listReceptionists",receptionistService.getAllReceptionist());
	     return "list-receptionists";	
	}
	
	@GetMapping("/Receptionist")
	public String addDoctor(ModelMap model) {
		Receptionist receptionist=new Receptionist();
		model.addAttribute("receptionist",receptionist);
		return "Receptionist";
	}
	@RequestMapping(value="/Receptionist",method=RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("doctor") Receptionist receptionist) {
		receptionistService.saveReceptionist(receptionist);
		return "redirect:/list-receptionists";
		
	}
	@RequestMapping(value = "/update-receptionist", method = RequestMethod.GET)
	public String showUpdatereceptionistPage(@RequestParam long id, ModelMap model) {
		Receptionist receptionist = receptionistService.getReceptionistById(id);
		model.put("receptionist", receptionist);
		return "Receptionist";
	}

	@RequestMapping(value = "/update-receptionist", method = RequestMethod.POST)
	public String updateReceptionist(ModelMap model, @Valid Receptionist receptionist, BindingResult result) {

		if (result.hasErrors()) {
			return "Receptionist";
		}
       receptionistService.saveReceptionist(receptionist);
		return "redirect:/list-receptionists";
	}
	@RequestMapping(value="/delete-receptionist",method=RequestMethod.GET)
	public String delecteReceptionist(@RequestParam long id) {
	receptionistService.deleteReceptionistById(id);
		return "redirect:/list-receptionists";
		
	}
	

}
