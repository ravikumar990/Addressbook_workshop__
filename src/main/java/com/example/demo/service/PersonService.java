package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonDTO;
import com.example.demo.model.PersonData;
import com.example.demo.repository.IPersonRepository;



@Service
public class PersonService implements IPersonService {

	@Autowired
	private IPersonRepository personRepository;

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData createPersonData(PersonDTO personDTO) {
		PersonData contactData = null;
		contactData = new PersonData(1, personDTO);
		return personRepository.save(contactData);
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData updatePersonDta(long id, PersonDTO personDTO) {
		PersonData personData = this.getPersonDataById(id);
		personData.updatePersonData(personDTO);
		return personRepository.save(personData);
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public List<PersonData> getPersonData() {
		return personRepository.findAll();
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData getPersonDataById(long id) {
		return personRepository.findById(id).get();
	}

	@Override
	public void deletePersonData(long id) {
		PersonData personData = this.getPersonDataById(id);
		personRepository.delete(personData);
	}

}