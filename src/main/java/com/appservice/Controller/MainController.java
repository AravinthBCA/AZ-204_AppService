package com.appservice.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appservice.Model.People;
import com.appservice.Repo.PeopleRepository;

@RestController
public class MainController {

	@Autowired
	public PeopleRepository peopleRepo;

    @GetMapping("/")
	public String message() {
		return "Hello Everyone this is Aravinth...";
	}
	
	@GetMapping("/msg")
	public String messages() {
		return "This is production slot...";
	}

	@GetMapping("/list")
	public ArrayList<People> list(){
		return (ArrayList)peopleRepo.findAll();
	}
    
}
