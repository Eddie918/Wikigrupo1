package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Contacto;

public interface ContactRepository extends CrudRepository<Contacto, Long> {

}
