package com.springboot.Cricket1.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Cricket1.dao.CricketDao;
import com.springboot.Cricket1.entity.Cricket;

@Service
public class CricketService {
	
	@Autowired
	CricketDao dao;
	
	//All data From database
	public List<Cricket> getAllStaffInfo()
	{
		List<Cricket> staffList = dao.getAllStaffInfo();
		
		return staffList;
	}
	//players name whose stats with 'B'
	
	public List<String> getNmStarrtB(){
	  List<Cricket> staffList =	dao.getAllStaffInfo();
	 List<String> getNmB = new ArrayList<String>();
	  for(Cricket c: staffList)
	  {
		 if(c.getDep().equals("player"))
		 {
			 if(c.getName().startsWith("b"))
			 {
				 getNmB.add(c.getName());
			 }
		 }
	  }
		return getNmB;
	}
	
	//All players name whos age is less than 30
	public List<String> getNameAgeles30()
	{
	List<Cricket> staffList =	dao.getAllStaffInfo();
    List<String> getNm = new ArrayList<>();
	for(Cricket c : staffList)
	{
		if(c.getDep().equals("player"))
		{
			if(c.getAge() < 30)
			{
				getNm.add(c.getName());
			}
		}
	}
		return getNm;
	}
	
	//fetch names only in medical department
	public List<String> getNmMedicalDep()
	{
	List<Cricket> staffList =	dao.getAllStaffInfo();
	List<String > getnames = new ArrayList<String>();
	for(Cricket c : staffList)
	{
		if(c.getDep().equals("medical"))
		{
			getnames.add(c.getName());
		}
	}
		
		return getnames;
	}
	
	//Addition of experience years of player department
	public int addOfExpPlayerDep()
	{
	List<Cricket> staffList =	dao.getAllStaffInfo();
	int sum=0;
	for(Cricket c : staffList)
	{
		if(c.getDep().equals("player"))
		{
			sum=sum+c.getExperience();
		}
	}
		return sum;
	}
	
	//Addition of experience of medical department
	public int addOfExpOfMedicalDepa()
	{
	List<Cricket> staffList = dao.getAllStaffInfo();
	int sum=0;
	for(Cricket c : staffList)
	{
		if(c.getDep().equals("medical"))
		{
			sum=sum+c.getExperience();
		}
	}
		return sum;
	}
	
	//All Players whos experience is more than 10
	public List<String> getNmExpGT10()
	{
	List<Cricket> staffList =	dao.getAllStaffInfo();
	List<String> gtTenExp = new ArrayList<String>();
	for(Cricket c : staffList)
	{
		if(c.getDep().equals("player"))
		{
			if(c.getExperience() < 10)
			{
				gtTenExp.add(c.getName());
			}
		}
	}
		return gtTenExp;
	}

	public void insertCricketStaffDetails(Cricket staff) {
		// TODO Auto-generated method stub
		dao.insertCricketStaffDetails(staff);
		
	}

	public void updateCricketStaffDetails(Cricket staff) {
		// TODO Auto-generated method stub
		dao.updateCricketStaffDetails(staff);
	}

	public int fetchAllStaffAsperDepa(String dep) {
		// TODO Auto-generated method stub
		List<Cricket> staffList =dao.getAllStaffInfo();
		ArrayList<Cricket> medicalStaff = new ArrayList<Cricket>();
		for(Cricket c:staffList)
		{
			if(c.getDep().equals(c))
			{
				medicalStaff.add(c);
			}
		}
		return medicalStaff.size();
	}
	
	
	
	

}
