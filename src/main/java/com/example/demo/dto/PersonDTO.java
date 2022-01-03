package com.example.demo.dto;

import lombok.Data;

/**
 * @Data : Auto Generate getters and setters, constructor, toString
 *
 */
public @Data class PersonDTO {

	public String firstName;
	public String lastName;
	public String gender;
	public long phoneNumber;
	public String email;
	public String address;
	public String city;
	public String state;
	public String country;
	public String profilePic;


}