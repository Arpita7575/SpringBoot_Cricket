package com.springboot.Cricket1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Cricket1.entity.Cricket;
import com.springboot.Cricket1.service.CricketService;

@RestController
public class CricketController {

	@GetMapping("/test")
	public String test()
	{
		return "testing";
	}
	
	
	@Autowired
	CricketService service;
	
	//Fetc All data from database
	@GetMapping("/getAllStaff")
	public List<Cricket> getAllStaffInfo()
	{
		List<Cricket> getInfo = service.getAllStaffInfo();
		return getInfo;
		//return service.getAllStaffInfo();
	}
	
	//Get staff name starts with "B"
	@GetMapping("/getNmStartsWithB")
	public List<String> getNmStarrtB(){
	//List<String> nmStarB = service.getNmStarrtB();
		return service.getNmStarrtB();
	}
	
	//All players name whos age is less than 30
	@GetMapping("getNmAgeLe")
		public List<String> getNameAgeless()
		{
			return service.getNameAgeles30();
		}
	
	//fetch names only in medical department
	@GetMapping("getnamesfrommedical")
		public List<String> getNmMedicalDep()
		{
			return service.getNmMedicalDep();
		}
	//Addition of experience years of player department
	@GetMapping("sumOfExperOfPlayerDepa")
		public int addOfExpPlayerDep()
		{
			return service.addOfExpPlayerDep();
		}
	

	//Addition of experience of medical department
	@GetMapping("getAddOfExOfMedicalDepa")
	public int addOfExpOfMedicalDepa()
	{
		return service.addOfExpOfMedicalDepa();
	}
	//All Players whos experience is more than 10
	@GetMapping("getNmPlayerExpGT10")
		public List<String> getNmExpGT10()
		{
			return service.getNmExpGT10();
		}
	
	
//	@PostMapping("/insertcricketstaff")
//	public void insertCricketStaffDetails(@RequestBody Cricket staff)
//	{
//		service.insertCricketStaffDetails(Cricket staff);
//	}
	@PostMapping("/insertcricketstaff")
	public void insertCricketStaffDetails(@RequestBody Cricket staff)
	{
		service.insertCricketStaffDetails(staff);
	}
	@PutMapping("/updateCricketStaff")
	public void updateCricketStaffDetails(@RequestBody Cricket staff)
	{
		service.updateCricketStaffDetails(staff);
	}
	
	
	
	@GetMapping("getallstaffasperdepa/{dep}/{age}")///{age}
	public int fetchAllStaffAsperDepa(@PathVariable String dep, @PathVariable int age)
	{
		System.err.println(dep);
	    System.err.println(age);

		return service.fetchAllStaffAsperDepa(dep);
		
		
	}
}


