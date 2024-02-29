package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Contacto;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contacto saveContact(Contacto contact) {
        // Add any business logic here if needed
        return contactRepository.save(contact);
    }

    // Other business logic related to contacts could go here
}
