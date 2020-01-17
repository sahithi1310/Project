package com.deloitte.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deloitte.bean.Passenger;

import com.deloitte.exception.PassengerException;

import com.deloitte.service.IPassengerService;

@Controller
public class PassengerController {
	@Autowired
	IPassengerService passengerService;

	List<String> busList = null;
	List<Passenger> plist;

	@RequestMapping(value = "/addPassenger.obj")
	public String redirectToAddPassenger(Model model) throws PassengerException {
		Passenger passenger = new Passenger();
		// busList = passengerService.getBus();
		// model.addAttribute("clist", busList);
		model.addAttribute("passenger", passenger);
		return "passengerForm";
	}

	@RequestMapping(value = "/submitPassenger.obj")
	public String addAthlete(@ModelAttribute(value = "passenger") @Valid Passenger passenger,
			BindingResult bindingResult, Model model) throws PassengerException {
		// System.out.println(athlete);

		int output = passengerService.addPassenger(passenger);
		model.addAttribute("passengerName", passenger.getName());
		if (output == 1) {
			return "successAdd";
		} else {
			return "PassengerAdded";
		}
	}

	// @RequestMapping(value = "/retreivePassenger.obj")
	// public String showAllPassenger(@PathVariable("to")String
	// to,@PathVariable("from")String from,Model model) throws PassengerException {
	// plist = passengerService.getPassengerList(to,from);
	// model.addAttribute("elist", plist);
	// //System.out.println(alist);
	// return "showAllPage";
	// }

	@RequestMapping(value = "/goHome.obj")
	public String goToHome(Model model) {
		return "index";
	}

	@ExceptionHandler(PassengerException.class)
	public String handleException(PassengerException e) {
		e.printStackTrace();
		return "passengerException";
	}

	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		e.printStackTrace();
		return "dataException";
	}

}
