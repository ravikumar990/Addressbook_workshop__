package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PersonData;

public interface IPersonRepository extends JpaRepository<PersonData, Long> {

}