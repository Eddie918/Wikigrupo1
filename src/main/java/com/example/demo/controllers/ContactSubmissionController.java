package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Contacto;
import com.example.demo.service.ContactService;

@RestController
@RequestMapping("/grupo21/contacto")
public class ContactSubmissionController {

    private final ContactService contactoService;

    @Autowired
    public ContactSubmissionController(ContactService contactoService) {
        this.contactoService = contactoService;
    }

    @PostMapping("/submit")
    public Contacto submitContactForm(@RequestParam("name") String name,
                                      @RequestParam("email") String email,
                                      @RequestParam("message") String message) {
        Contacto contacto = new Contacto();
        contacto.setName(name);
        contacto.setEmail(email);
        contacto.setMessage(message);
        return contactoService.saveContact(contacto);
    }

    // Other methods if necessary...
}
