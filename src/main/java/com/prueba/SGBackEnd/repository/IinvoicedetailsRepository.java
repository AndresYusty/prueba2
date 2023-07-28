package com.prueba.SGBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.SGBackEnd.model.invoicedetails;

@Repository
public interface IinvoicedetailsRepository extends JpaRepository<invoicedetails, Integer> {

}
