package com.phbookapp.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT_DTLS")
public class Contact {
	
	@Id
	@GeneratedValue
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	
    @Column(name="contact_NUM")	
	private Long contactNum;
    
    
    
}
