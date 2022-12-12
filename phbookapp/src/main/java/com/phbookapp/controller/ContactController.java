package com.phbookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phbookapp.domain.Contact;
import com.phbookapp.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/contact")
	public String saveContact(@RequestBody Contact contact) {
    	
        String status= contactService.saveContact(contact);
        
        return status;
    	
    }
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		
		return contactService.getAllContacts();
	}
	
	
	@GetMapping("/{contactId}")
	public Contact getContactById(@PathVariable("contactId") Integer contactId) {
		
		return contactService.getContactById(contactId);
		
	}
	
	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		
		return contactService.updateContact(contact);
		
	}
	
	@DeleteMapping("/contact/{contactId}")
	public String deleteContact(@PathVariable("contactId") Integer contactId) {
		
		return contactService.deleteContactById(contactId);
		
	}
}
