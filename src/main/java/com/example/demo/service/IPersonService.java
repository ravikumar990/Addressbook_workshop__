package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonDTO;
import com.example.demo.model.PersonData;

@Service
public interface IPersonService {

	PersonData createPersonData(PersonDTO personDTO);

	PersonData updatePersonDta(long id, PersonDTO personDTO);

	List<PersonData> getPersonData();

	PersonData getPersonDataById(long id);

	void deletePersonData(long id);
}