package com.phbookapp.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.phbookapp.domain.Contact;
import com.phbookapp.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository repo;

	
	public String saveContact(Contact contact) {
	
		contact=repo.save(contact);
		
		if(contact.getContactId()!=null) {
			
			return "Contact saved";
		} else {
			
			return "Contact failed to save";
		}
	}

	
	public List<Contact> getAllContacts() {
		
		return repo.findAll(); 
	}


	public Contact getContactById(Integer contactId) {
		
		               
     Optional<Contact> findById=repo.findById(contactId);
		
	 return findById.get();
	}

	
	public String updateContact(Contact contact) {
		
		if(repo.existsById(contact.getContactId())) {
			
			repo.save(contact);
			return "Update Success";
			} else {
				
				return "No Record Found";
				
			}
	}
	
		      
		
	public String deleteContactById(Integer contactId) {
		
	     if(repo.existsById(contactId)) {
	    	 
	    	 repo.deleteById(contactId);
	    	 
	    	 return "Record Deleted";
	    	 
	     } else {
	    	 
	    	 return "No Record Found";
	    	 }
	     
	}    
		

 }
