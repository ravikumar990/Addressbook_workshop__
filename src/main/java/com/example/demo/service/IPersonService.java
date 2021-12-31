package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonDTO;
import com.example.demo.model.PersonData;

@Service
public interface IPersonService {

	List<PersonData> getPersonData();
	PersonData getPersonDataById(int id);
	
	PersonData createPersonData(PersonDTO personDTO);
	
	PersonData updatePersonData( int id,PersonDTO personDTO);
	
	void deletePersonData(int id);
}