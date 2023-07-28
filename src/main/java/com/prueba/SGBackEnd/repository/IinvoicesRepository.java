package com.prueba.SGBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.SGBackEnd.model.invoices;

@Repository
public interface IinvoicesRepository extends JpaRepository<invoices, Integer>{

}
