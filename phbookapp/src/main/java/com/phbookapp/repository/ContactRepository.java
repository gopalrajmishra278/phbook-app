package com.phbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phbookapp.domain.Contact;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	
}
