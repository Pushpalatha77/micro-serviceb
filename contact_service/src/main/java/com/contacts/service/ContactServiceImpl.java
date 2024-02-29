package com.contacts.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contacts.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> list=List.of(
			new Contact(1L,"bhumi@gmail.com","Bhumi",1311L),
			new Contact(2L,"bhumi@gmail.com","Bhumi",1311L),
			new Contact(3L,"anurja@gmail.com","Anurja",1312L),
			new Contact(4L,"padma@gmail.com","Padma",1314L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return this.list.stream().filter(c->c.getUserId().equals(userId)).collect(Collectors.toList());
	}
}
