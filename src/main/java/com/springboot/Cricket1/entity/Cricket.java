package com.springboot.Cricket1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cricket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sId;
	int experience;
	int age;
	String dep;
	String name;
	public Cricket(int sId, int experience, int age, String dep, String name) {
		super();
		this.sId = sId;
		this.experience = experience;
		this.age = age;
		this.dep = dep;
		this.name = name;
	}
	public Cricket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cricket [sId=" + sId + ", experience=" + experience + ", age=" + age + ", dep=" + dep + ", name=" + name
				+ "]";
	}
	

}
