package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.example.demo.dto.AddressBookDTO;

import lombok.Data;
@Entity
public @Data class AddressBookModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int bookId;
	
	private String addressBookName;

	public AddressBookModel() {
		super();
	}

	public AddressBookModel(AddressBookDTO bookDTO) {
		super();
		this.updateAddressBookData(bookDTO);
	}

	public void updateAddressBookData(AddressBookDTO bookDTO) {
		this.addressBookName = bookDTO.addressBookName;
	}
}