package com.example.mindp.Model;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tourdata")
@Data
public class Tour 
{
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private int age;
	@Column(name="fromPlace")
	private String fromPlace;
	@Column(name="numberOfDaysVisits")
	private int numberOfDaysVisits;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public int getNumberOfDaysVisits() {
		return numberOfDaysVisits;
	}
	public void setNumberOfDaysVisits(int numberOfDaysVisits) {
		this.numberOfDaysVisits = numberOfDaysVisits;
	}
			
}
