package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AddressBookModel;

public interface IAddressBookRepository extends JpaRepository<AddressBookModel, Integer> {

}