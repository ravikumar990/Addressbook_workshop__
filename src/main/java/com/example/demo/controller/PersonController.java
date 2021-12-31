package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.model.PersonData;
import com.example.demo.service.IPersonService;

@RestController
@RequestMapping("/addressbook")
public class PersonController {
	
	@Autowired
	private IPersonService personService;

	/**
	 * Call Get method
	 * 
	 * @return : Http Status & Contact details of the person
	 */
	@RequestMapping(value = { "/getAll" })
	public ResponseEntity<ResponseDTO> getPersonData() {
		List<PersonData> personList = null;
		personList = personService.getPersonData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", personList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * Call Get method
	 * 
	 * @param id : contact Id
	 * @return : Contact details of the person
	 */
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getPersonData(@PathVariable("id") int id) {
		PersonData personData = null;
		personData = personService.getPersonDataById(id);
		ResponseDTO respDTO = new ResponseDTO("Get Call for Id Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * Call post method to add details
	 * 
	 * @param personDTO : details id, Firstname, Lastname, Address, City & phoneNum
	 * @return : details
	 */
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createPersonData(@RequestBody PersonDTO presonDTO) {
		PersonData contactData = null;
		contactData = personService.createPersonData(presonDTO);
		ResponseDTO respDTO = new ResponseDTO("Created AddressBook data Successfully", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * Call put method to update details
	 * 
	 * @param personDTO : details id, Firstname, Lastname, Address, City & phoneNum
	 * @return : details
	 */
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updatePersonData(@PathVariable("id") int id, @RequestBody PersonDTO personDTO) {
		PersonData contactData = null;
		contactData = personService.updatePersonData(id, personDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated AddressBook data Successfully", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * Call delete method to remove address book details
	 * 
	 * @param id : Address book id
	 * @return : contact id which is deleted
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deletePersonData(@PathVariable("id") int id) {
		personService.deletePersonData(id);
		ResponseDTO respDTO = new ResponseDTO("Deleted AddressBook data Successfully", "Deleted id : " + id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
