package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.AddressBookDTO;
import com.example.demo.model.AddressBookModel;

@Service
public interface IAddressBookService {

	AddressBookModel createAddressBookData(AddressBookDTO bookDTO);

	AddressBookModel updateAddressBookData(int addressbookId, AddressBookDTO bookDTO);

	List<AddressBookModel> getAddressBookData();

	AddressBookModel getAddressBookDataById(int id);

	void deleteAddressBookData(int id);
}